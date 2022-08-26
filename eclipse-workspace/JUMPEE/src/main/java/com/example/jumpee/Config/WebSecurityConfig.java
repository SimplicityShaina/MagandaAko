package com.example.jumpee.Config;

import javax.sql.DataSource;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.jumpee.Service.CustomUserDetailsService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
public class WebSecurityConfig extends WebMvcConfigurerAdapter {
//	@Autowired
//	private DataSource dataSource;
    
    @Bean
    CustomUserDetailsService userDetailsService() {
        return new CustomUserDetailsService();
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//        authProvider.setUserDetailsService(userDetailsService());
//        authProvider.setPasswordEncoder(passwordEncoder());
//
//        return authProvider;
//    }

//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(authenticationProvider());
//	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//			.antMatchers("/users").authenticated()
//			.anyRequest().permitAll()
//			.and()
//			.formLogin()
//				.usernameParameter("email")
//				.defaultSuccessUrl("/users")
//				.permitAll()
//			.and()
//			.logout().logoutSuccessUrl("/").permitAll();
//	}
	
	
}
