package day7;
import java.util.Scanner;
import day7.Calc;
import day7.Bmi;
import day7.Year;
import day7.Ssn;
import day7.Grade;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴]\n0.종료 1.계산기 2.BMI 3.윤년계산 4.성별검사 5.등수계산");
			String num = scanner.next();
			switch(num) {
			case "0" : 
				System.out.println("종료");
				return;
			case "1" : 
				Calc c = new Calc();
				c.clac();
				break;
			case "2" : 
				Bmi b = new Bmi();
				b.bmi();
				break;				
			case "3" : 
				Year y = new Year();
				y.year();
				break;
			case "4" : 
				Ssn s = new Ssn();
				s.sn();
				break;
			case "5" :
				Grade g = new Grade();
				g.g();
				break;
			}
		}
	}
}
