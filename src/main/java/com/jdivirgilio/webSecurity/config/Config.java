package com.jdivirgilio.webSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.jdivirgilio.webSecurity")
public class Config {

	/* Here is the equivalent XML version
	*
	*	<bean
	*		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
	*		<property name="prefix" value="/WEB-INF/view/" />
	*		<property name="suffix" value=".jsp" />
	*	</bean
	*/
	
	// Define a bean for the ViewResolver
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		
		view.setPrefix("/WEB-INF/view/");
		view.setSuffix(".jsp");
		
		return view;
	}
	
}
