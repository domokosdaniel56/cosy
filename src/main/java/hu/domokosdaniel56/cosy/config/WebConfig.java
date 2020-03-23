package hu.domokosdaniel56.cosy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addViewControllers(ViewControllerRegistry reg) {
		reg.addViewController("/login").setViewName("/login/login");
		reg.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
}
