package javaBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Topic_12_String {
	
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		String schoolName = "Automation Test";
		String courseName = "AUTOMATION TEST";
		String schoolAddress = "Ha Noi";
		
		//Lấy độ dài (số lượng) ký tự của chuỗi (ký tự cũng bắt đầu từ index[0] đến index[length - 1]
		//length()
		System.out.println("Độ dài: " + schoolName.length());
		
		//Lấy ký tự từ vị trí bất kỳ (charAt())
		System.out.println("Lấy ra 1 ký tự : " + schoolName.charAt(6));
		
		//Nối chuỗi concat
		System.out.println("Nối chuỗi : " + schoolName.concat(" - " + schoolAddress));
		//Không cần dùng concat -> dùng " + " cũng được
		System.out.println("Nối chuỗi : " + schoolName + " - " + schoolAddress);
		
		//So sánh tuyệt đối equals => Trả về kiểu boolean
		System.out.println("Kiểm tra 2 chuỗi bằng nhau tuyệt đối: " + schoolName.equals("Automation Test"));
		
		//So sánh tương đối equalsIgnoreCase() => Không phân biệt chữ hoa-thường
		System.out.println("Kiểm tra 2 chuỗi bằng nhau tương đối: " + schoolName.equalsIgnoreCase(courseName));
		
		//Kiểm tra giá trị chuỗi - startsWith/ endsWith/ contains => Trả về kiểu boolean
		//startsWith: Kiểm tra chuỗi có bắt đầu bằng 1 ký tự/ chuỗi ký tự hay không
		//endsWith: Kiểm tra chuỗi có kết thúc bằng 1 ký tự/ chuỗi ký tự hay không
		//contains: Kiểm tra chuỗi có chứa 1 ký tự/ chuỗi ký tự hay không
		System.out.println("Có bắt đầu bằng 1 ký tự/ chuỗi ký tự hay không: " + schoolName.startsWith("Auto"));
		System.out.println("Có kết thúc bằng 1 ký tự/ chuỗi ký tự hay không: " + schoolName.endsWith("est"));
		System.out.println("Có chứa 1 ký tự/ chuỗi ký tự hay không: " + schoolName.contains("tion"));
		
		//Vị trí của từ trong 1 chuỗi - index : Lấy từ ký tự đầu tiên
		System.out.println("Vị trí của 1 ký tự/ chuỗi ký tự trong chuỗi: " + schoolName.indexOf("tion"));
		
		//Chuỗi con từ vị trí - substring
		//Bắt đầu từ vị trí bất kỳ
		System.out.println("Tách 1 ký tự/ chuỗi ký tự trong chuỗi: " + schoolName.substring(5));
		//Bắt đầu và kết thúc ở vị trí bất kỳ
		System.out.println("Tách 1 ký tự/ chuỗi ký tự trong chuỗi: " + schoolName.substring(3, 7));
		
		//Split: Tách chuỗi thành 1 mảng dựa vào ký tự/ chuỗi ký tự
		//Lấy ra chuỗi 48
		String result = "Viewing 48 of 132 results";
		//Tách chuỗi dựa vào khoảng trắng => tách thành 5 element
		String results[] = result.split(" ");
		System.out.println(results[1]);
		
		//Thay thế - Replace
		String price = "$100.00";
		price = price.replace("$", "");
		//Replace $ -> ""
		System.out.println(price);
		//Chuyển sang kiểu float
		float priceF = Float.parseFloat(price);
		System.out.println(priceF);
		
		//Từ float qua string
		price = String.valueOf(priceF);
		
		//UpperCase/ LowerCase
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		//Handle multiple OS: MAC/ Windows
		if(osName.toLowerCase().contains("windows")) {
			Keys key = Keys.CONTROL;
		}else {
			Keys key = Keys.COMMAND;
		}
		//Multiple browser: toUpperCase
		
//		String driverInstanceName = driver.toString();
//		System.out.println(driverInstanceName);
//		//ChromeDriver: chrome on WINDOWS (0e0b1c64ff120a1b01f4ef2efff58dd2)
//		
//		//Close browser/ driver
//		if(driverInstanceName.contains("internetexplorer")) {
//			//Sleep cứng thêm 5s sau mỗi sự kiện chuyển page
//		}
		
		//Cắt bỏ khoảng trắng/ tab/ xuống dòng ở đầu và cuối chuỗi 
		String helloWorld = "   \n  \t    Hello World!       ";
		System.out.println(helloWorld);
		System.out.println(helloWorld.trim());
		
		helloWorld = "    ";
		//Kiểm tra chuỗi có rỗng không (Không chứa bất kỳ ký tự nào) - isEmpty => Trả về boolean
		System.out.println("Empty: " + helloWorld.isEmpty());
		//Kiểm tra chuỗi có trống không (Chuỗi chỉ chứa khoảng trắng) - isBlank => Trả về boolean
		System.out.println("Blank: " + helloWorld.isBlank());

		//Format - học trong bài Dynamic locator
		//Đại diện cho 1 chuỗi: %s
		String dynamicButtonXpath = "//button[@id= '%s']";
		System.out.println("Click to Login button: " + dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		System.out.println("Click to Search button: " + dynamicButtonXpath.format(dynamicButtonXpath, "search"));
		
	}
}
