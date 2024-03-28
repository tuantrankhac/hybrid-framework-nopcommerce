package javaBasic;

import java.util.Iterator;
import java.util.Scanner;

import org.testng.annotations.Test;

//Class
public class Topic_09_While_Do_While {
	Scanner scanner = new Scanner(System.in);

	@Test
	public void TC_01_For() {
		//In ra các số chẵn từ n cho đến 100
		int number = scanner.nextInt();
		for (int i = number; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	@Test
	public void TC_02_While() {
		//In ra các số chẵn từ n cho đến 100
		int number = scanner.nextInt();
		
		while (number <= 100) {
			if(number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		}
	}
	
	@Test
	public void TC_03_Do_While() {
		//In ra các số chẵn từ n cho đến 100
		int number = scanner.nextInt();
		
		do {
			if(number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		} while (number <= 100);
	}
	
	@Test
	public void TC_04_While() {
		//Nhập vào 2 số a và b sau đó hiển thị ra màn hình các số từ a -> b mà chia hết cho 3 và 5
		
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();

		while (numberA <= numberB) {
			if (numberA % 3 == 0 && numberB % 5 == 0) {
				System.out.println(numberA);
			}
			numberA++;
		}
	}
	
	@Test
	public void TC_05_While() {
		//Tổng các số lẻ tử 0 đến n
		
		int numberA = scanner.nextInt();
		int i = 0;
		
		while (numberA > 0 ) {
			if (numberA % 2 != 0) {
				i += numberA;
				//i = i + numberA;
			}
			numberA--;
		}
		System.out.println(i);
	}
	
	@Test
	public void TC_06_While() {
		//Giai thừa
		
		int numberA = scanner.nextInt();
		int i = 1;
		
		while (numberA > 0) {
				i *= numberA;
				//i = i + numberA;
				numberA--;
		}
		System.out.println(i);
	}
	
	@Test
	public void TC_06__Do_While() {
		//Giai thừa
		
		int numberA = scanner.nextInt();
		int i = 1;
		
		do {
			i *= numberA;
			//i = i + numberA;
			numberA--;
		} while (numberA > 0);
		System.out.println(i);
	}
}
