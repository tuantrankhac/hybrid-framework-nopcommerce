package javaBasic;

import java.util.Calendar;
import java.util.Random;

import com.github.javafaker.Faker;

public class RandomData {

	public static void main(String[] args) {
		Faker fake = new Faker(); 
		
		System.out.println(fake.address().firstName());
		System.out.println(fake.address().lastName());
		System.out.println(fake.internet().emailAddress());
		System.out.println(fake.internet().privateIpV4Address());
		System.out.println(fake.internet().publicIpV4Address());
	}
	
	public static int getRandomNumber() {
		int uLimit = 999;
		int lLimit = 100;
		Random rand = new Random();
		return lLimit + rand.nextInt(uLimit - lLimit);
	}
	
	public static int getRandomNumber(int minimum, int maximum) {
		Random rand = new Random();
		return minimum + rand.nextInt(maximum - minimum);
	}
	
	public static int getNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
	
	public static String getRandomEmail() {
		return "lio" + getRandomNumberByDateTime() + "@qa.team";
	}

	public static long getRandomNumberByDateTime() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Calendar.getInstance().getTimeInMillis() % 10000;
	}
}
