package com.research.test.configuration;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MessageSourceImpl implements MessageSourceAware {

	private MessageSource messageSource;

	public void setMessageSource(MessageSource amsMessageSource) {
		this.messageSource = amsMessageSource;
	}

	public String getMessage(String msgKey)	{
		return messageSource.getMessage(msgKey, null, Locale.ENGLISH);
	}
	
}
