package com.instagram.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.InstagramUser;
import com.instagram.utility.DAOFactory;

public class InstagramController implements InstagramControllerInterface {
	
	private BufferedReader br;
	InstagramDAOInterface id;
	public InstagramController(){
		br=new BufferedReader(new InputStreamReader(System.in));
		id=DAOFactory.myMethod();
	}

	public void createProfile() {
		try {
		System.out.println("enter name");
		String name=br.readLine();
		
		System.out.println("enter password");
		String password=br.readLine();
		
		System.out.println("enter email");
		String email=br.readLine();
		
		System.out.println("enter address");
		String address=br.readLine();
		
		InstagramUser iu=new InstagramUser();
		iu.setName(name);
		iu.setPassword(password);
		iu.setEmail(email);
		iu.setAddress(address);
		
		
		int i=id.createProfileDAO(iu);
		
		if(i>0) {
			System.out.println("profile created successfully");
		}
		else {
			System.out.println("could not create profile");
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

	public void loginProfile() {
		// TODO Auto-generated method stub

	}

}
