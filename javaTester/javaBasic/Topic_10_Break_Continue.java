package javaBasic;

public class Topic_10_Break_Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				//Loại trừ 1 điều kiện xảy ra (loại trừ i = 5)
				continue;
			}
			System.out.println(i);
		}
		
	}

}
