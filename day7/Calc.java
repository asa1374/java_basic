package day7;
import java.util.Scanner;
public class Calc {
	public void clac() {
		System.out.println("정욱씨가 쏩니다. !!!   계산기식을 입력하쇼");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		int add=0;
		switch(op) {
		case "+" : add=a+b; break;
		case "-" : add=a-b; break;
		case "*" : add=a*b; break;
		case "/" : add=a/b; break;
		case "%" : add=a%b; break;
		}
		System.out.println(add);
	}
}
