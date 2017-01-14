package com.commerce.web.i18n;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;


@Service
public class I18NService {

	/** The Application logger */
	private static final Logger LOG = Logger.getLogger(I18NService.class);
	
	@Autowired  // we are injecting 'MessageResource' bean
	private MessageSource messageSource;
	
	/*
	 *  Returns a message for the given message id and the default locale in the session context
	 *  @param messageId is the key to the messages resource file
	 */
	public String getMessage(String messageId){
		
		LOG.info("Returning i18n text for the messageId {}");
		
		Locale locale = LocaleContextHolder.getLocale();
		return getMessage(messageId, locale);
	}
	
	/*
	 *  Returns a message for the given messageId and locale
	 *  @param messageId is the key to the messages resources file
	 *  @param locale is the locale
	 */
	public String getMessage(String messageId, Locale locale){
		
		return messageSource.getMessage(messageId, null, locale);
	}
}
