package day7;
import java.util.Scanner;
public class Year {
	public void year() {
		System.out.println("년도를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		String year = "";
		if(y%4==0 && y%100!=0 || y%400==0) {
			year ="윤년";
		}else {
			year = "평년";
		}
		System.out.println(year);		
	}
}
