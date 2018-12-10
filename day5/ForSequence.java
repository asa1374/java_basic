package day5;
import java.util.Scanner;
public class ForSequence {
	public static void main(String[] args) {
		System.out.println("1부터 몇까지의 합");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String res = "";
		int sum =0;
		for(int i=1;i<=10;i++) {
			sum += i;
			if(i<10) {
				res += i+"+";
			}else {
				res += i+"=";
			}
		}
		System.out.println(res+sum);
	}
}
