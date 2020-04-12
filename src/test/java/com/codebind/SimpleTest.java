package com.codebind;

import java.util.Calendar;
import java.util.Formatter;

public class SimpleTest {
	public static String getNameOfPastSpecificMonth(int i){
		Formatter fmt = new Formatter();
	      Calendar cal = Calendar.getInstance();
	      cal.add(Calendar.DAY_OF_MONTH, i-61);
	      fmt = new Formatter();
	      //fmt.format("%tB %tb %tm", cal, cal, cal);
	      String month =fmt.format("%tB", cal).toString();
	      System.out.println(month);
		return month;
	      
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNameOfPastSpecificMonth(0);
		
	      
	      
	}

}
