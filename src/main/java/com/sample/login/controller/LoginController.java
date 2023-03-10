package com.sample.login.controller;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.RSAPublicKeySpec;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @ClassName LoginController.java
 * @description 로그인 컨트롤러 
 * @author JB
 * @since 2017. 3. 27.
 */

@Controller
public class LoginController {

	/**
	 * 
	 * @name loginIndex
	 * @description 로그인처리 RSA 
	 * @param 
	 * @return void
	 * @author JB
	 * @throws NoSuchAlgorithmException 
	 * @since 2017. 3. 27.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginIndex(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		
		// RSA Login
		KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
		generator.initialize(1024);
		KeyPair keyPair = generator.genKeyPair();
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		PublicKey publicKey = keyPair.getPublic();
		PrivateKey privateKey = keyPair.getPrivate();
		
		session.setAttribute("_RSAKey", privateKey);
		
		RSAPublicKeySpec publicSpec = (RSAPublicKeySpec) keyFactory.getKeySpec(publicKey, RSAPublicKeySpec.class);
		String publicKeyModulus = publicSpec.getModulus().toString(16);
		String publicKeyExponent = publicSpec.getPublicExponent().toString(16);
		
		request.setAttribute("RSAModulus", publicKeyModulus);
		request.setAttribute("RSAExponent", publicKeyExponent);
		
		return "login/login";
	}
}
