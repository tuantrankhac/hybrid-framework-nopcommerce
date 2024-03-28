package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Topic_08_For_Foreach {
	
	public void TC_01_For() {
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			
		//Vế 1: Biến tạm dùng để tăng giá trị lên sau mỗi lần duyệt
		// => Dùng để so sánh với tổng giá trị
		//Vế 2: So sánh với tổng
		//Vế 3: Tăng i lên 1 đơn vị sau khi chạy vào thân vòng for
			
		}
		
		//Array
		//In ra hết những giá trị trong cityName
		//For kết hợp if: Thoả mãn điều kiện mới action
		//Dùng biến đếm i để filter
		String[] cityName = {"Ha Noi", "HCM", "Da Nang", "Can Tho"};
		for (int i = 0; i < cityName.length; i++) {
			if(cityName[i].equals("Da Nang")) {
				//Thoả mãn điều kiện -> Action
				System.out.println("Action");
				//System.out.println(cityName[i]);
				break;
			}
		}
		
	}

	@Test
	public void TC_02_For_Each() {
		String[] cityName = {"Ha Noi", "HCM", "Da Nang", "Can Tho"};
		//Dùng biến tạm city
		//Kiểu dữ liệu là kiểu của Element (Vd: String)
//		for (String city : cityName) {
//			System.out.println(city);
//		}
		
		//Java Collection
		//Class: ArrayList/ LinkedList/ Vector/...
		//Interface: List/Set/Queue
		List<String> cityAddress = new ArrayList<String>();
		
		//Compile (Coding)
		cityAddress.add("Ha Giang");
		cityAddress.add("Quang Ninh");
		cityAddress.add("Hai Phong");
		
		//Runtime (Running)
		//Add tiếp những thằng trong cityName vào cityAddress
		for (String city : cityName) {
			cityAddress.add(city);
		}
		
		System.out.println(cityAddress);
		
		
	}
}
