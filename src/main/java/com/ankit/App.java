package com.ankit;

import java.net.Authenticator;
import java.util.Properties;

import javax.mail.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String message="Hello dear, this message to security check";
        String subject="Confirmation";
        String to="guptaankit3673@gmail.com";
        String from="resource email";
        
        sendEmail(message,subject,to,from);
    }

	private static void sendEmail(String message, String subject, String to, String from) {
		// TODO Auto-generated method stub
		//variable for gmail host
		String host="smtp.gmail.com";
		//get simple properties
		Properties properties=System.getProperties();
		System.out.println("properties" + properties);
		properties.put("mail.smtp.host",host);
		properties.put("mail.smtp.port","465");
		properties.put("mail.smtp.ssl.enable","true"); 
		properties.put("mail.smtp.auth","True");
		
		Session session=Session.getInstance(properties, new Authenticator() {
		@override
		protected passwordAuthentication getPasswordAuthentication() {
			
		}
		}
		
	}

	}

