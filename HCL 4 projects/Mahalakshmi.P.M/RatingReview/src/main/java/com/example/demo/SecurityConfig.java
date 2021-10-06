package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("sabari")
		.password("sabari")
		.roles("ADMIN")
		.and()
		.withUser("shiva")
		.password("shiva")
		.roles("REGULAR");
	}
		
		@Bean
		
			public PasswordEncoder getPasswordEncoded()
			{
				return  NoOpPasswordEncoder.getInstance();
			}


		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
			.antMatchers("/admin").hasRole("ADMIN")
			.antMatchers("/regular").hasAnyRole("REGULAR","ADMIN")
			.antMatchers("/").permitAll()
			.and().formLogin();
     		/*
			.antMatchers("/register").hasRole("REGULAR")
	        .and()
	        .formLogin()
	        .rememberMe()
	        .rememberMeParameter("name")
	        .rememberMeCookieName("remembername")
	        .tokenValiditySecond(100)
	        .and()
	        .logout()
	        */
		
		
		}	
		
		
		

		
		
}
		
		
	

	
	
	
