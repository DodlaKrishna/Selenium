package com.codebind;

import java.util.Random;

public class App {
	
	public static void getrandomStrig(int size) {
		StringBuilder str= new StringBuilder();
		Random r = new Random();
		for(int i =0; i<size ;i++) {
		str.append((char)(r.nextInt(26) + 97)) ;
		}
	}
public static void main(String[] args) {
	getrandomStrig(9);
}
}
