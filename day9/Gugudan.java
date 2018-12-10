package day9;
import java.util.Scanner;
public class Gugudan {
	//출력할 단.. 예를 들어 3을 입력하면
	//3단 출력 3*2 = 6 ...3*9=27
	public void test() {
		System.out.println("출력할 단을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		int add = 0;
		String res = "";
		for(int i=0;i<10;i++) {
			res += dan + "*"+ i + "="+dan*i +" "; 
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		gugudan.test();
	}
}
