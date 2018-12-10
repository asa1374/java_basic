package day9;
import java.util.Scanner;
public class OddSum {
	public void test() {
		//Odd 홀수
		//Even 짝수
		//1부터 입력받은 숫자까지 합인데 그중에서 홀수의합
		System.out.println("숫자를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int odd = scanner.nextInt();
		int sum = 0;
		for(int i=0;i<=odd;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		OddSum oddSum = new OddSum();
		oddSum.test();
	}
}
