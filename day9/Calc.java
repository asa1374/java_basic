package day9;
import java.util.Scanner;
public class Calc {
	public void test() {
		System.out.println("계산식 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		String op = scanner.next();
		int num2 = scanner.nextInt();
		int res = 0;
		switch(op) {
		case "+" : res = num1+num2 ; break;
		case "-" : res = num1-num2 ; break;
		case "*" : res = num1*num2 ; break;
		case "/" : res = num1/num2 ; break;
		case "%" : res = num1%num2 ; break;
		}
		System.out.println(num1+op + num2 + "=" +res);
	}
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.test();
	}
}
