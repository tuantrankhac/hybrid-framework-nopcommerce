package javaBasic;

public class Topic_04_Operator {

	public static void main(String[] args) {
		int number = 10;
				
		
		//number = number + 5; 
		number += 5; 
		System.out.println(number);
		  
		//Chia lấy nguyên: 15/5 = 3 
		System.out.println(number / 5);
		  
		//Chia lấy dư 15%7 = 2 dư 1 
		System.out.println(number % 7);
		 
		String address = "HCM";
		
		boolean status = (address == "Ha Noi") ? true : false;
		System.out.println(status);
		
	}
}
