package com.factorymethod;

import com.factorymethod.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message message = creator.getMessage();
		System.out.println(message);
	}
}
