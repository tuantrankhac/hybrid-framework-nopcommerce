package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_String_Exercise {
	String courseName = "Automation Testing Advanced";
		
	//In ra màn hình các ký tự in hoa trong chuỗi
	//=> Duyệt qua từng ký tự -> So sánh nằm trong khoảng nào (A - Z)
	@Test
	public void TC_01() {
		char courseNameArr[] = courseName.toCharArray();
		int count = 0;
		//Lấy ra từng ký tự trong mảng courseNameArr 
		for (char character : courseNameArr) {
			if(character <= 'Z' && character >= 'A') {
				System.out.println("Character uppercase = " + character);
				//Nếu là ký tự in hoa => tăng count lên 1
				count++;
			}
		}
		System.out.println("Sum of uppercase = " + count);
	}
	
	@Test
	public void TC_02() {
		char courseNameArr[] = courseName.toCharArray();
		int count = 0;
		
		for (char c : courseNameArr) {
			//Đếm số kú tự là 'a' có trong chuỗi
			if(c == 'a') {
				count++;
			}
		}
		System.out.println("Số ký tự là a = " + count);
	}
	
	@Test
	public void TC_03() {
		char courseNameArr[] = courseName.toCharArray();
		
		//Reverse - In ra chuỗi đảo ngược
		for (int i = courseNameArr.length - 1; i >= 0; i--) {
			System.out.print(courseNameArr[i]);
		}
	}
}
