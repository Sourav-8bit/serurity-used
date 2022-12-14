package com.screen.screenboot;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter {
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	auth.inMemoryAuthentication()
	.withUser("uuu")
	.password("kkk")
	.roles("USER")
	.and().withUser("lll").password("333").roles("ADMIN");
	}
	
	
	
	@Bean PasswordEncoder  getPasswordEncoder()
	 {
		 return NoOpPasswordEncoder.getInstance();
	 }

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("admin").hasRole("ADMIN")
		.antMatchers("users").hasRole("USER")
		.antMatchers("/").permitAll().and().formLogin();
		}
	
	}

		
	
	
	

	


