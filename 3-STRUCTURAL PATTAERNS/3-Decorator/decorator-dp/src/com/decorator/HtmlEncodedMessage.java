package com.decorator;

//Decorator. Implements component interface
public class HtmlEncodedMessage implements Message
{
	private Message msg;

	public HtmlEncodedMessage(Message msg)
	{
		this.msg = msg;
	}
	@Override
	public String getContent()
	{
		return "HtmlEncodedMessage" + msg.getContent();
	}
}
