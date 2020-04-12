package com.codebind;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.log4testng.Logger;


public class RandomUtil {
	private Logger log = Logger.getLogger(RandomUtil.class);
	private Random r;
	public RandomUtil() throws Exception {
		r = new Random();
	}

	public String getRandomString(int size) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < size; i++)
			sb.append((char) (r.nextInt(26) + 97));

		return sb.toString();
	}

	public int getRandomInteger(int size) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < size; i++)
			sb.append(r.nextInt(9));

		return Integer.parseInt(sb.toString());
	}

	public int getRandomIntegerWithinRange(int max, int min) {
		Random rn = new Random();

		return rn.nextInt((max - min) + 1) + min;
	}

	public String getRandomStringWithPrefix(String prefix, int size) {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);

		for (int i = 0; i < size; i++)
			sb.append((char) (r.nextInt(26) + 97));

		return sb.toString();
	}

	public int getRandomIntegerWithPrefix(String prefix, int size) {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);

		for (int i = 0; i < size; i++)
			sb.append(r.nextInt(9));

		return Integer.parseInt(sb.toString());
	}

	public int getRandomIntegerWithinPrefix(String startPrefix, int size, String endPrefix) {
		StringBuilder sb = new StringBuilder();
		sb.append(startPrefix);

		for (int i = 0; i < size; i++)
			sb.append(r.nextInt(9));

		sb.append(endPrefix);
		return Integer.parseInt(sb.toString());
	}

	public int getRandomIntegerInSequence(String startPrefix, int size, String endPrefix, int middleSize,
			String middlePrefix) {
		StringBuilder sb = new StringBuilder();
		sb.append(startPrefix);

		for (int i = 0; i < size; i++)
			sb.append(r.nextInt(9));

		sb.append(middlePrefix);

		for (int i = 0; i < middleSize; i++)
			sb.append(r.nextInt(9));

		sb.append(endPrefix);
		return Integer.parseInt(sb.toString());
	}

	public String getRandomEmail(String prefix) {
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);

		for (int i = 0; i < 9; i++)
			sb.append(r.nextInt(9));

		sb.append("@infosys.com");

		return sb.toString();
	}

	
	
	public boolean isInputStringorInt(String input) throws Exception {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			log.error(e);
			return false;
		}
	}

	

	public String convertMilliSecondsToHHMMSS(long millis) throws Exception {
		String time = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
				TimeUnit.MILLISECONDS.toMinutes(millis)
						- TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
		return time;
	}

	public String replaceFirstOccurenceOfString(String inputString, String stringToReplace,
			String stringToReplaceWith) {
		int inputStringSize = inputString.length();
		int stringToReplaceSize = stringToReplace.length();

		int startingIndexOfTheStringToReplace = inputString.indexOf(stringToReplace);

		String finalString = inputString.substring(0, startingIndexOfTheStringToReplace) + stringToReplaceWith
				+ inputString.substring(startingIndexOfTheStringToReplace + inputStringSize, stringToReplaceSize);

		return finalString;
	}

	public String getLatestFileFromDirectory(String dirPath) {
		File f = new File(dirPath);
		File[] files = f.listFiles();

		long lastMod = Long.MIN_VALUE;

		File choice = null;

		for (File file : files)
			if (file.lastModified() > lastMod && (!file.getName().equals("log"))) {
				choice = file;
				lastMod = file.lastModified();
			}

		return choice.getName();
	}
}
