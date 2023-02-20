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
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.DAO.UserDao;
import com.example.demo.DAO.UserRepo;
import com.example.demo.common.ApiResponse;
import com.example.demo.config.JwtUtil;
import com.example.demo.entity.JwtRequest;
import com.example.demo.entity.JwtResponse;
import com.example.demo.entity.User;

import java.util.HashSet;
import java.util.Set;

@Service
public class JwtService implements UserDetailsService {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthenticationManager authenticationManager;
    
    @Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

    public ResponseEntity<?> createJwtToken(JwtRequest jwtRequest) throws Exception {
	if (jwtRequest.getUserName() !=null && jwtRequest.getUserPassword() !=null )   {
	    		
				System.out.println("########User #########"+ jwtRequest.getUserName());
				  User userDB = userRepo.findByUserName(jwtRequest.getUserName());
	           
	           
	            if (userDB != null) {
	            	String encodedPassword = userDB.getUserPassword();
	
	                
	            	if(bCryptPasswordEncoder.matches(jwtRequest.getUserPassword(), encodedPassword)) {
	                	//session.setAttribute("appUser", user);
	                	System.out.println("AppUser"+ jwtRequest.getUserName());
	                	authenticate(jwtRequest.getUserName(), jwtRequest.getUserPassword());
	
				        UserDetails userDetails = loadUserByUsername(jwtRequest.getUserName());
				        String newGeneratedToken = jwtUtil.generateToken(userDetails);
				
				        User appUser = userDao.findById(jwtRequest.getUserName()).get();
				        return ResponseEntity.ok(new JwtResponse(appUser, newGeneratedToken));
				       // return new ResponseEntity.ok(appUser, newGeneratedToken);
	            	}else {
				    	
	            		return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Wrong credentials"), HttpStatus.NOT_FOUND);
	            	}
	            	
	            }
	           // return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Username does not exist"), HttpStatus.NOT_FOUND);
	    	}
	    	return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Username does not exist"), HttpStatus.NOT_FOUND);
		    
		    	
	}

    @Override
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
}
