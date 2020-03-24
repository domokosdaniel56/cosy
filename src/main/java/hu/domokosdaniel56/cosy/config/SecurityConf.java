package hu.domokosdaniel56.cosy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConf extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configureAuth(AuthenticationManagerBuilder auth) throws Exception {
		auth
		  .inMemoryAuthentication()
		    .withUser("admin")
		    .password("{noop}admin")
		    .roles("ADMIN")
		  .and()
		    .withUser("user")
		    .password("{noop}user")
		    .roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		  .authorizeRequests()
		    .antMatchers("/main.css", "/h2/**").permitAll()
		    .anyRequest().authenticated()
		  .and()
		    .formLogin()
		    .loginPage("/login")
		    .permitAll()
		  .and()
		    .logout()
		    .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login");
		
		http.csrf().disable();
		http.headers().frameOptions().disable();
	}
}
