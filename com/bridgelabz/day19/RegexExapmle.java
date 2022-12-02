package com.bridgelabz.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExapmle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pattern pat = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher m = pat.matcher("Sac");
		
		if(m.matches())
			System.out.println("Valid first name");
		else
			System.out.println("Invalid first name");
	}

}
