package br.com.activemqspringbootapi;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	@JmsListener(destination = "mailbox", containerFactory = "myFactory")
	public void recevieMessage(Email email) {
		System.out.println("received <" + email + ">");
	}
}
