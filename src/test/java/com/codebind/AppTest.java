package com.codebind;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;

import org.codehaus.plexus.util.InterpolationFilterReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public void TestNGMaventest() {
		System.out.println("TestNG Maven Project");
		
	}
    public static String getRandomString(int size) {
    	Random ran = new Random();
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<=size ;i++) {
    	char ch=(char) (ran.nextInt(26) + 97);
    	sb.append(ch);
    	}
		return sb.toString();
    }
    
    
    public static int getRandomNumber(int size) {
    	StringBuilder sb = new StringBuilder();
    	Random ran = new Random();
    	for(int i =1;i<=size ; i++) {
    		int num=ran.nextInt(9);
    		sb.append(num);
    	}
		return Integer.parseInt(sb.toString());
    }
    
    public static int getRandomIntegerWithinrange(int max , int min) {
    	
    	Random r = new Random();
    	
    	return r.nextInt((max-min) + 1) +min ;
    }
    
    public static String getrandomStringWithPrefix(String prefix, int size) {
    	StringBuilder sb = new StringBuilder();
    	Random ran = new Random();
    	sb.append(prefix);
    	for(int i =0; i<=size ; i++) {
    	char ch=(char) ran.nextInt((26) + 97);
    	sb.append(ch);
    	}
		return sb.toString();
    	
    }
    
	public static String getRandomEmail(int size) throws FileNotFoundException, IOException {
		
		DateFormat dateformat = new SimpleDateFormat("MMDDYYYY");
		Date date = new Date();
		dateformat.format(date);
		Calendar cal= Calendar.getInstance();
		String dateValue=dateformat.format(date);
		
		Properties properties = new Properties();
		properties.load(new FileInputStream("filename.properties"));
		String value=properties.getProperty(dateValue);
		
		
		return dateValue;

		
	}
	
	
	public static void main(String[] args) {
		/*getRandomString(6);
		System.out.println("The Random String is " + getRandomString(9));
		System.out.println("The Random String is " + getRandomString(11));
		System.out.println("The Random String is " + getRandomString(13));
		System.out.println("The Random String is " + getRandomString(8));
		System.out.println("The Random String is " + getRandomString(4));
		
		System.out.println("The Random String is " + getRandomNumber(9));
		System.out.println("The Random String is " + getRandomNumber(8));
		System.out.println("The Random String is " + getRandomNumber(7));
		
		System.out.println("The Random String is " + getRandomIntegerWithinrange(13,6));
		System.out.println("The Random String is " + getRandomIntegerWithinrange(25,6));*/
		
		/*String str= "Automation";
		System.out.println("The original value is " + str);
		StringBuilder str2= new StringBuilder();;
		str2.append(str);
		str2.reverse();
		System.out.println("The reverse value is " +str2.reverse());
		
		
		String str3= "Automationtestengineer";
		char ch[]=str3.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.println("The reverse order is " +ch[i] );
		}
		String reverse = null;
		int length=str3.length();
		for(int i=length-1;i>=0;i--) {
			
			reverse=reverse + str3.charAt(i);
			System.out.println("The reverse sequence is " +ch[i] );
		}*/
		/*
		String str= "this this is is krishna from india india";
		String[] strspilt=str.split(" ");
		HashMap<String , Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<strspilt.length;i++) {
			if(map.containsKey(strspilt[i])) {
				int count=map.get(strspilt[i]);
				map.put(strspilt[i], count+1);
			}else {
				map.put(strspilt[i], 1);
				System.out.println("The number is " +map.put(strspilt[i], 1));
			}
		}
		
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext()) {
	    Map.Entry me =(Map.Entry) itr.next();
		}
		for(Map.Entry<String,Integer> listmap : map.entrySet()) {
			System.out.println("The key is "+listmap.getKey() + "The value is " +listmap.getValue());
		}*/
		/*List<String> list = new ArrayList<String>();
		list.add("Krishna");
		list.add("vinod");
		list.add("Bunga");
		list.add("Dodla");
		
		Iterator<String> itr =list.iterator();
		while(itr.hasNext()) {
			System.out.println("the value is " + itr.next());
		}*/
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		List<WebElement> list = driver.findElements(By.xpath(""));
		Iterator<WebElement> itr = list.iterator();
		while(itr.hasNext()){
			String URL=itr.next().getAttribute("href");
			if(URL==null || URL.isEmpty()) {
				
				
			}
		}
		
	}
}
