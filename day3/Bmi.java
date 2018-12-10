package day3;
import java.util.Scanner;
public class Bmi {
	public static void main(String[] args) {
		System.out.println("몸무게:");
		Scanner scan = new Scanner(System.in);
		String kg = scan.next();
		int kg1 = Integer.parseInt(kg);
		System.out.println("키 :");
		String m = scan.next();
		double m1 = Integer.parseInt(m);
		m1 = m1/100;
		double bmi = 0.0;
		bmi = kg1/(m1*m1);
		System.out.println("BMI : "+ bmi);
		if(bmi>=40.0){
			System.out.println("고도비만");
		}else if(bmi>35.0){
			System.out.println("중등도 비만");
		}else if(bmi>=30.0){
			System.out.println("경도 비만");
		}else if(bmi>=25.0){
			System.out.println("과체중");
		}else if(bmi>=18.5){
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
	}
}
