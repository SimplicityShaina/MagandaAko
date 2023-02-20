package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.demo.DAO.RoleDao;
import com.example.demo.DAO.UserDao;
import com.example.demo.common.ApiResponse;
import com.example.demo.config.JwtUtil;

import com.example.demo.entity.JwtResponse;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;

import java.util.HashSet;
import java.util.Set;



@Service

public class UserService implements UserDetailsService{
	
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
    
    
    @Autowired
    private JwtUtil jwtUtil;


    @Autowired
    private AuthenticationManager authenticationManager;

    public ResponseEntity<?> Login(User user) throws Exception {

    	if (user.getUserName() !=null && user.getUserPassword() !=null) {
    		
			System.out.println("########User #########"+ user.getUserName());
			  User userDB = userDao.findById(user.getUserName()).get();
           
           
            if (userDB != null) {
            	String encodedPassword = userDB.getUserPassword();

                
            	if(bCryptPasswordEncoder.matches(user.getUserPassword(), encodedPassword)) {
                	//session.setAttribute("appUser", user);
                	System.out.println("AppUser"+ user.getUserName());
                	authenticate(user.getUserName(), user.getUserPassword());

			        UserDetails userDetails = loadUserByUsername(user.getUserName());
			        String newGeneratedToken = jwtUtil.generateToken(userDetails);
			
			        User appUser = userDao.findById(user.getUserName()).get();
			        return ResponseEntity.ok(new JwtResponse(appUser, newGeneratedToken));
			       // return new ResponseEntity.ok(appUser, newGeneratedToken);
            	}else {
			    	
            		return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Wrong credentials"), HttpStatus.NOT_FOUND);
            	}
            	
            }
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Username does not exist"), HttpStatus.NOT_FOUND);
    	}
    	return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Please put username and password!"), HttpStatus.NOT_FOUND);
	    
	    	
    }
                

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findById(username).get();

        if (user != null) {
            return new org.springframework.security.core.userdetails.User(
                    user.getUserName(),
                    user.getUserPassword(),
                    getAuthority(user)
            );
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }

    private Set<SimpleGrantedAuthority> getAuthority(User user) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        user.getRole().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        });
        return authorities;
    }

    private void authenticate(String userName, String userPassword) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, userPassword));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created record");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setUserName("admin123");
        adminUser.setUserPassword(getEncodedPassword("admin@pass"));
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

//        User user = new User();
//        user.setUserName("raj123");
//        user.setUserPassword(getEncodedPassword("raj@123"));
//        user.setUserFirstName("raj");
//        user.setUserLastName("sharma");
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        user.setRole(userRoles);
//        userDao.save(user);
    }

    public User registerNewUser(User user) {
        Role role = roleDao.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));

        return userDao.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }

}
