package day8;
import java.util.Scanner;
public class Calc {
	public void calc() {
		System.out.println("계산식입력");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		int add = 0;
		switch(op) {
		case "+": add = a+b; break;
		case "-": add = a-b; break;
		case "*": add = a*b; break;
		case "/": add = a/b; break;
		case "%": add = a%b; break;
		}
		System.out.println(a+op+b+"="+add);
		
	}
}
