package day9;
import java.util.Scanner;
public class ForeDemo {
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 10까지");
		int a = 0;
		String b = "";
		for(int i=0;i<=10;i++) {
			if(i!=10) {
				b += i+"+";
				a += i;
			}else {
				b+= i+"=";
				a+=i;
			}
		}
		System.out.println(b +a);
	}
	public static void main(String[] args) {
		ForeDemo demo = new ForeDemo();
		demo.test();
	}
}
