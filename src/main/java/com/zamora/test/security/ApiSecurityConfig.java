package com.zamora.test.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.CrossOrigin;


@EnableWebSecurity
@Configuration
class ApiSecurityConfig extends WebSecurityConfigurerAdapter {
	
	
		@Override
		protected void configure(HttpSecurity http) throws Exception {
		
			http.cors().and().csrf().disable()
			.authorizeRequests()
			.antMatchers("/module1/signing").permitAll()
			.antMatchers("/module2/register").permitAll()
			//.antMatchers(HttpMethod.GET,"/modulo2/testMensaje").authenticated()
			.anyRequest()
			.authenticated();
			
					
		}
	

	

	
	
}
