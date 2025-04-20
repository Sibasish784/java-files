package FacebookApplication;

import java.util.Scanner;

import facebookexceptions.FacebookException;

public class FacebookApp {

	static void login() throws FacebookException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		if (age > 13) {
			System.out.println("You are eligible to create a Facebook account.");
		} else {
			throw new FacebookException("You are not eligible to create a Facebook account. You must be at least 13 years old."); 
		}
		System.out.println("FaceBook Home");
	}
	public static void main(String[] args) 
	{
		try {
			login();
		} catch (FacebookException e) {
			System.out.println(e.getMessage());
		}
	}

}
