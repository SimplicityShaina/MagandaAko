package com.example.jumpee.Controller;

import java.io.UnsupportedEncodingException;

import java.util.List;

import javax.mail.MessagingException;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.jumpee.Service.UserServices;
import com.example.jumpee.Validation.UserValidator;
import com.example.jumpee.domain.User;

@Controller
public class UserController {

	@Autowired
	private UserServices service;
	
	@Autowired
	UserValidator userValidator;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String registerform(User user,Model model)
	{
		return "register";
	}
	
	@RequestMapping(value="/saveRegister",method=RequestMethod.POST)
	public String saveregister(@ModelAttribute("user") User user,BindingResult result)
	{
		userValidator.validate(user,result);
		
		if(result.hasErrors()){
			System.out.println("#####");
			System.out.println("firstname" + user.getFirstname());
			return "register";
		}else
		{
			service.save(user);
			return "redirect:/login";
		}
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginPage(@ModelAttribute User user, String error,String logout,HttpServletRequest request,HttpServletResponse response,Model model){
		model.addAttribute("user", user);
		if(error!=null){
			model.addAttribute("error", "password and login not avaliable");
		} 
		if(logout!=null){
			Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
			if(authentication!=null){
				new SecurityContextLogoutHandler().logout(request, response, authentication);
			}
		}  
		if (user.getEmail() !=null && user.getPassword() !=null) {
			System.out.println("########User #########"+user);
			User userDB = service.findByEmail(user.getEmail());
			if (userDB != null) {
		        String encodedPassword = userDB.getPassword();
		        
		        if(bCryptPasswordEncoder.matches(user.getPassword(), encodedPassword)) {
		        	 return "welcome";
		        	 
		        }
		        else {
		        	model.addAttribute("error", "username or password is incorrect");
		        }
		    }
			
		}
		return "login";
	}
//	@PostMapping("/process_register")
//	public String processRegister(User user, HttpServletRequest request) 
//			throws UnsupportedEncodingException, MessagingException {
//		service.register(user, getSiteURL(request));		
//		return "register_success";
//	}
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = service.listAll();
		model.addAttribute("listUsers", listUsers);
		
		return "users";
	}
	
//	private String getSiteURL(HttpServletRequest request) {
//		String siteURL = request.getRequestURL().toString();
//		return siteURL.replace(request.getServletPath(), "");
//	}	
	
//	@GetMapping("/verify")
//	public String verifyUser(@Param("code") String code) {
//		if (service.verify(code)) {
//			return "verify_success";
//		} else {
//			return "verify_fail";
//		}
//	}
}

