package day8;
import java.util.Scanner;
public class MyCalendar {
	public void mycalen() {
		System.out.println("년도를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		String year = "";
		
		if(y%4==0 && y%100!=0 || y%400==0) {
			year = "윤년";
		}else {
			year = "평년";
		}
		System.out.println(y + year);
		
	}
}
