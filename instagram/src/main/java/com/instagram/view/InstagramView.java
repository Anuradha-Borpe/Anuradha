package com.instagram.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.instagram.controller.InstagramControllerInterface;
import com.instagram.utility.ControllerFactory;

public class InstagramView {

	public static void main(String[] args) {
		System.out.println("**************MAIN MENU***************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to login profile");
		
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter your choice");
			
			int c=Integer.parseInt(br.readLine());
			
			InstagramControllerInterface ic=ControllerFactory.createObject();
			
			switch(c) {
			case 1: ic.createProfile();
				break;
			case 2: ic.loginProfile(); 
				break;
			}
		}
		catch(Exception e) {
			
		}

	}

}
