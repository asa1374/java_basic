package day7;

import java.util.Scanner;

public class Ssn {
	public void sn() {
		System.out.println("이름을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("주민번호를 입력해주세요");
		String ssn = scanner.next();
		char ju = ssn.charAt(7);
		String res = "";
		
		switch(ju) {
		case '1' : case '3' :
			res = "남자";
			break;
		case '2' : case '4' :
			res = "여자";
			break;
		case '5' : case '6' :
			res = "외국인";
			break;
		default : 
			res = "잘못입력하셨습니다.";
		}
		System.out.println(name+res);
	}
}
