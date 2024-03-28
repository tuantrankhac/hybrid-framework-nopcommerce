package javaBasic;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_06_Condition_Exercise {
	WebDriver driver;
	Scanner scanner = new Scanner(System.in);
	
	@Test
	public void TC_01() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		if(numberA >= numberB) {
			System.out.println(numberA + " lớn hơn hoặc bằng " + numberB);
		}else {
			System.out.println(numberA + " nhỏ hơn " + numberB);
		}
		
	}
	
	public void TC_02() {
		String firstStudent = scanner.nextLine();
		String secondStudent = scanner.nextLine();
		
		//Reference: String
		//Kiểm tra vị trí của biến trong vùng nhớ
		if(firstStudent.equals(secondStudent)) {
			System.out.println("Giống tên");
		}else {
			System.out.println("Khác tên");
		}
		
		//Kiểu primitive type (thường dùng để so sánh số nguyên int)
		if(firstStudent == secondStudent) {
			System.out.println("Giống tên");
		}else {
			System.out.println("Khác tên");
		}
	}
	
	//Kiểm tra a có nằm trong đoạn [10, 100] không, nếu có thì in ra màn hình
	public void TC_03() {
		int number = scanner.nextInt();
		if (10 < number && number < 100) {
			System.out.println(number + " nằm trong khoảng [10, 100]");
		} else {
			System.out.println(number + " không nằm trong khoảng [10, 100]");
		}
		
	}
	
	//Nhập vào điểm của sv và in ra hệ số tương ứng
	//0 < 5 	Điểm D
	//5 < 7.5 	Điểm C
	//7.5 < 8.5 Điểm B
	//8.5 <= 10 Điểm A
	public void TC_04() {
		float point = scanner.nextFloat();
			
		if (point <= 10 && point >= 8.5) {
			System.out.println("Đạt điểm A");
		} else if(point < 8.5 && point >= 7.5) {
			System.out.println("Đạt điểm B");			
		} else if(point < 7.5  && point >= 5) {
			System.out.println("Đạt điểm c");
		} else if(point < 5 && point > 0) {
			System.out.println("Đạt điểm D");
		} else {
			System.out.println("Nhập lại!");
		}
	}
	
	//Nhập vào tháng và in ra số ngày
	@Test
	public void TC_05() {
		int month = scanner.nextInt();
		
		//Tháng có 31 ngày
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("Tháng này có 31 ngày");
		} else if (month == 2){
			System.out.println("Tháng này có 28 ngày");
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("Tháng này có 30 ngày");
		}
	}
	
}
