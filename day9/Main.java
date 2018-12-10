package day9;
import java.util.Scanner;
import day9.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴]\n"
					+ "0.종료"
					+ "1.계산기"
					+ "2.BMI"
					+ "3.구구단"
					+ "4.로또번호"
					+ "5.홀수의합");
			String num = scanner.next();
			switch(num) {
			case "0" : return;
			case "1" : 
				Calc calc = new Calc();
				calc.test();
				break;
			case "2" : 
				Bmi bmi = new Bmi();
				bmi.test();
				break;
			case "3" : 
				Gugudan gugudan = new Gugudan();
				gugudan.test();
				break;
			case "4" : 
				LottoNumberGen gen = new LottoNumberGen();
				gen.test();
				break;
			case "5" :
				OddSum oddSum = new OddSum();
				oddSum.test();
				break;
			}
			
		}
	}
}
