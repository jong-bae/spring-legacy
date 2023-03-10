package com.sample.common.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 * 
 * @ClassName Encryptor.java
 * @description Jasypt Encryptor
 * @author JB
 * @since 2017. 2. 28.
 */
public class Encryptor {
	
	public static void main(String[] args) {
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("sample");
		
		String url = encryptor.encrypt("jdbc:log4jdbc:mysql://localhost:3306/sample");
		String username = encryptor.encrypt("local");
		String password = encryptor.encrypt("local");
		
		System.out.println("url=" + url);
		System.out.println("username=" + username);
		System.out.println("password=" + password);
	}
}
