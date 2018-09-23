package com.jdivirgilio.springRestDemo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/*
	 * <servlet>
	 * 	<servlet-name>dispatcher</servlet-name>
	 *	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
	 *
	 *	<init-param>
	 *		<param-name>contextConfigLocation</param-name>
	 *		<param-value>/WEB-INF/spring-mvc-demo-servlet.xml</param-value>
	 *	</init-param>
	 *
	 *	<load-on-startup>1</load-on-startup>
	 * </servlet>
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { Config.class };
	}

	/*
	 * <servlet-mapping>
	 * 	<servlet-name>dispatcher</servlet-name>
	 * 	<url-pattern>/</url-pattern>
	 * </servlet-mapping>
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
