package com.factorymethod;

import com.factorymethod.message.Message;
import com.factorymethod.message.TextMessage;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

	public Message getMessage() {
		Message message = createMessage();
		message.addDefaultHeaders();
		message.encrypt();
		return message;
	}

	//Factory method
	public abstract Message createMessage();
	
}
