package day3;
import java.util.Scanner;
public class LeepYear {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String year = scan.next();
		int a = Integer.parseInt(year);
		int b = a%4;
		int c = a%100;
		int d = a%400;
		if(b==0){
			if(d==0){
				System.out.println(a+"년: 윤년");
			}else if(c==0){
				System.out.println(a+"년: 평년");
			}else {
				System.out.println(a+"년: 윤년");
			}
		}else {
			System.out.println(a+"년: 평년");
		}
	}
}
