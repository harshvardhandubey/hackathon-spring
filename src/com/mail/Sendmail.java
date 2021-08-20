package com.mail;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.entity.Student;

import javax.activation.*;

public class Sendmail {
		Sendmail sendmail;
		private String email;
		public void sendmail(String email) 
		{
		final String from = "";
		String to = email;
		final String password = "";
		String host =  "smtp.gmail.com";
		String port = "587";
		
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.socketFactory.port", "465");
		
		
		
props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", port);
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from,password);
			}
		});
		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Reset password link");
			message.setText("http://localhost:8081/spring-demo/enterpassword.jsp");
			// send message
			Transport.send(message);
			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			System.out.println(e);
		}
	}
}