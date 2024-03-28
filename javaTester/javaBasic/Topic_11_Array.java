package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class Topic_11_Array {
//	//Thuộc tính/ Biến
//	String name;
//	int age;
//	
//	//Constructor: Hàm khởi tạo
//	public Topic_11_Array(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	public void display() {
//		System.out.println("Name: " + name);
//		System.out.println("Age: " + age);
//	}
//	
//	public static void main(String[] args) {
//		//Khai báo kiểu mảng trong java dùng cách nào cũng được
////		int number[] = {3, 6, 7, 15};
////		int[] numbers = {3, 6, 7, 15}; 
////		
////		//Được define cố định bao nhiêu phần tử khi mình viết code (compile)
////		String studentName[] = {"Nam", "An", "Long"};
////		
////		//Lấy toàn bộ giá trị ở studentName clone cho stdNewName
////		//String stdNewName[] = studentName.clone();
////		
////		//Khai báo số lượng của mảng
////		int b[] = new int[5];
////		b[0] = 10;
////		
////		for (int i = 0; i < studentName.length; i++) {
////			if(studentName[i].equals("An")) {
////			System.out.println("Click to An");
////			}
////		}
////		
////		for (String std : studentName) {
////			if(std.equals("An"))
////			System.out.println("Click to An");
////		}
////		
////		//Động
////		ArrayList<String> stdName = new ArrayList<String>();
////		//Khi chạy code mới add (Runtime)
////		for(String std : studentName) {
////			stdName.add(std);
////		}
////		
////		
////		List<String> names = Arrays.asList("Tom", "Jerry", "John", "Linda");
////		for (String name : names) {
////			System.out.println("Name: " + name);
////			
////		}
////		
////		//Chuyển đổi mảng sang chuỗi
////		String std_Name = Arrays.toString(studentName);
////		System.out.println(std_Name);
//		
//		Topic_11_Array[] students = new Topic_11_Array[3];
//		students[0] = new Topic_11_Array("Tuan", 24);
//		students[1] = new Topic_11_Array("Cuong", 25);
//		students[2] = new Topic_11_Array("Duc", 24);
//		for (int i = 0; i < students.length; i++) {
//			students[i].display();
//		}
//		
//	}
	
	int number[] = {5, 3, 11, 9, 33, 15};
	
	@Test
	public void TC_01_Find_Max_Number() {
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			if(x < number[i]) {
				x = number[i];
			}
		}
		System.out.println("Max_Number = " + x);
	}
	
	@Test
	public void TC_02_Total_First_Last_Number() {
		int x = 0;
		for (int i = 0; i < number.length; i++) {	
		}
		System.out.println("First number = " + number[0]);
		System.out.println("Last number = " + number[number.length - 1]);
		System.out.println("Total number = " + (number[0] + number[number.length - 1]));
	}
	
	@Test
	public void TC_03_TBC() {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {	
			sum += number[i];
		}
		float average = sum/number.length;
		System.out.println("TBC = " + average);
	}
	
}
