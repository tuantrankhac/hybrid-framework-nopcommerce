package javaBasic;

public class Topic_05_Casting {

	public static void main(String[] args) {
		//Ép kiểu ngầm định (không bị mất dữ liệu)
//		byte bNumber = 126;
//		short sNumber = bNumber;
//		int iNumber = sNumber;
//		long lNumber = iNumber;
//		float fNumber = lNumber;
//		double dNumber = fNumber;
//		
		//Ép kiểu tường minh (có thể bị mất dữ liệu)
		double dNumber = 234234233;
		System.out.println(dNumber);
		
		float fNumber = (float) dNumber;
		System.out.println(fNumber);
		
		long lNumber = (long) fNumber;
		System.out.println(fNumber);
		
		int iNumber = (int) lNumber;
		System.out.println(iNumber);
		
	}

}
