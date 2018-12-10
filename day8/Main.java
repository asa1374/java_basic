package day8;
import java.util.Scanner;
import day8.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴]\n"
					+ "1.계산기\n"
					+ "2.BMI\n"
					+ "3.달력\n"
					+ "4.성별체크\n"
					+ "5.성적표");
			String select = scanner.next();
			switch(select) {
			case "0" : System.out.println("종료..."); return;
			case "1" : 
				Calc calc = new Calc();
				calc.calc();
				break;
			case "2" : 
				Bmi bmi = new Bmi();
				bmi.bmi();
				break;
			case "3" : 
				MyCalendar calendar = new MyCalendar();
				calendar.mycalen();
				break;
			case "4" : 
				GenderChecker checker =new GenderChecker();
				checker.gender();
				break;
			case "5" : 
				Grade grade = new Grade();
				grade.grade();
				break;
			default : break;
			}
		}
	}
}
