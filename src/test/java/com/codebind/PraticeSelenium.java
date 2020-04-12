package com.codebind;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class PraticeSelenium {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//Here parse methos is used to convert String into Date Format
		String pattern = "14/12/2012";
		DateFormat date =new SimpleDateFormat("dd/MM/YYYY");
		Date dateformat=date.parse(pattern);
		System.out.println("Date pattern is " + dateformat);
		System.out.println("Date pattern is " + dateformat.toString());
		
		System.out.println("String format date is " +date.format(dateformat));
		
		String name = "This is krishna vinod friend";
		String[] names = name.split(" ");
		System.out.println("Array string is "+Arrays.toString(names));

	}

}
