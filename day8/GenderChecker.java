package day8;
import java.util.Scanner;
public class GenderChecker {
	public void gender() {
		System.out.println("이름을 입력하시오");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("주민번호 입력");
		String ssn = scanner.next();
		char ch = ssn.charAt(7);
		String res = "";
		switch(ch) {
		case '1' :  case '3' : res= "남자"; break;
		case '2' :  case '4' : res= "여자"; break;
		case '5' :  case '6' : res= "외국인"; break;
		default : res = "잘못입력";		
		}
		System.out.println(name +res);
	}
}
