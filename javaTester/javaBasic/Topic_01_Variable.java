package javaBasic;

public class Topic_01_Variable {
	//Global variable
	static int number;
	
	String address = "HCM";
	
	public static void main(String[] args) {
		//Local variable
		int studenNumber = 0;
		System.out.println(studenNumber);
		
		System.out.println(number);
		
		Topic_02_Data_Type topic = new Topic_02_Data_Type();
		System.out.println(topic.address);
		
	}
}


