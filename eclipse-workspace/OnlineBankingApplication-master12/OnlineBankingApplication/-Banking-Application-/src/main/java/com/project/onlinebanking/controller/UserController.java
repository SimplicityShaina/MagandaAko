package com.project.onlinebanking.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.onlinebanking.domain.User;
import com.project.onlinebanking.service.UserService;
import com.project.onlinebanking.validation.UserValidator;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserValidator userValidator;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@GetMapping("/register")
	public String registerform(User user,Model model)
	{
		return "register";
	}

	@PostMapping("/register")
	public String saveregister(@ModelAttribute("user") User user,BindingResult result)
	{
	
		System.out.println(" USER FROM MODEL "+user);
		
		userValidator.validate(user,result);
		
		if(result.hasErrors()){
			System.out.println("#####");
			return "register";
		}else
		{
			userService.save(user);
			return "redirect:/login";
		}
	}
	
	@PostMapping("/login")
	public String loginPage(@ModelAttribute User user, String error,String logout,HttpServletRequest request,HttpServletResponse response,Model model){
		model.addAttribute("user", user);
		System.out.println("########LOGIN PAGE #########"+user);
		if(error!=null){
			model.addAttribute("error", "password and login not avaliable");
		} 
		if(logout!=null){
			Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
			if(authentication!=null){
				new SecurityContextLogoutHandler().logout(request, response, authentication);
			}
		}  
		if (user.getUsername() !=null && user.getPassword() !=null) {
			System.out.println("########User #########"+user);
			User userDB = userService.findByUsername(user.getUsername());
			if (userDB != null) {
		        String encodedPassword = userDB.getPassword();
		        
		        if(bCryptPasswordEncoder.matches(user.getPassword(), encodedPassword)) {
		        	return  "welcome";
		        }
		        else {
		        	model.addAttribute("error", "username or password is incorrect");
		        }
		    }
			
		}
		return "login";
	}
	


	
	@GetMapping("/set-myaccount")
	public String MyAccountPage(User user,Model model)
	{
		return "myaccount";
	}

	
	@GetMapping("/login?error")
	public String logout(){
		return  "redirect:/login";
	}
	
	
}

	

