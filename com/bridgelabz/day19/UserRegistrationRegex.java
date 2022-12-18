/*
 * Add password with at least one digit
 * 
 */

package com.bridgelabz.day19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		Pattern patf = Pattern.compile("^[A-Z][a-z]{2,}");
//		System.out.println("Enter first name First cap letter and minimum 3 chars");
//		String fname = sc.next();
//		Matcher mf = patf.matcher(fname);
//		
//		if(mf.matches())
//			System.out.println("Valid first name!");
//		else
//			System.out.println("Invalid first name!");
//		
//		System.out.println("Enter last name First cap letter and minimum 3 chars");
//		String lname = sc.next();
//		Pattern ptl = Pattern.compile("^[A-Z][a-z]{2,}"); 
//		Matcher ml = ptl.matcher(lname);
//		
//		if(ml.matches())
//			System.out.println("Valid last name!");
//		else
//			System.out.println("Invalid last name!");
//		
//		System.out.println("Enter email");
//		String email = sc.next();
//		Pattern ptmail = Pattern.compile("^[a-z]{3,}([.][a-z]{3,})?[@][a-z]{2,}[.]co([.]in)?$"); 
//		Matcher mail = ptmail.matcher(email);
//		
//		if(mail.matches())
//			System.out.println("Valid email!");
//		else
//			System.out.println("Invalid email!");
//		
//		System.out.println("Enter mobile number with country code");
//		String monum = sc.nextLine();
//		Pattern ptmobile = Pattern.compile("^[0-9]{2}\s[0-9]{10}$"); 
//		Matcher mobile = ptmobile.matcher(monum);
//		
//		if(mobile.matches())
//			System.out.println("Valid mobile!");
//		else
//			System.out.println("Invalid mobile!");
		
//		System.out.println("Enter password with min 8 chars at least one uppercase");
//		String passwd = sc.nextLine();
//		Pattern ptpswd = Pattern.compile("(?=[A-Z])[a-z A-Z 0-9]{8,}"); 
//		Matcher mpswd = ptpswd.matcher(passwd);
//		
//		if(mpswd.matches())
//			System.out.println("Valid password!");
//		else
//			System.out.println("Invalid password!");
		
		System.out.println("Enter password with min 8 chars at least one digit");
		String passwd = sc.nextLine();
		Pattern ptpswd = Pattern.compile("(?=.*[0-9])^[a-z A-Z 0-9]{8,}"); 
		Matcher mpswd = ptpswd.matcher(passwd);
		
		if(mpswd.matches())
			System.out.println("Valid password!");
		else
			System.out.println("Invalid password!");
		
	}

}
