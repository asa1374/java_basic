package day2;
import java.util.Scanner;
public class Calc {
	public static void main(String[] args) {
		System.out.println("숫자");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		System.out.println("숫자 1은" + a +"이고");
		System.out.println("숫자 2는" + b +"입니다.");
		int n1 = Integer.parseInt(a);
		int n2 = Integer.parseInt(b);
		int add = n1 * n2;
		System.out.println("두수의 곱은"+add+"입니다.");
	}
}
