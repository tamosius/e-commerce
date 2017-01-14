package com.commerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18Config {

	@Bean  // for Spring to initialize the 'messageSource' correctly, the bean must be named 'messageSource'
	public ReloadableResourceBundleMessageSource messageSource(){
		
		ReloadableResourceBundleMessageSource resourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
		
		// Spring will look into folder named 'i18n' for the file named 'messages.properties'
		resourceBundleMessageSource.setBasename("classpath:i18n/messages");
		
		// check for new messages every 30 minutes
		resourceBundleMessageSource.setCacheSeconds(1800);
		return resourceBundleMessageSource;
	}
}
