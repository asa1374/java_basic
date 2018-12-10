package day8;
import java.util.Scanner;
public class Bmi {
	public void bmi() {
		System.out.println("몸무게 :");
		Scanner scanner = new Scanner(System.in);
		double w = scanner.nextDouble();
		System.out.println("키 :");
		double t = scanner.nextDouble();
		
		double res = w/(t*t)*10000;
		String a = "";
		if(res>=40) {
			a = "고도비만";
		}else if (res>=35) {
			a = "중등도 비만";
		}else if (res>=30) {
			a = "경도비만";
		}else if(res>=25) {
			a = "과체중";
		}else if(res>=18.5) {
			a = "정상";
		}else {
			a= "저체중";
		}
		System.out.println(res + a);
	}
}
