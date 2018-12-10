package day2;
import java.util.Scanner;
public class HowMuch {
	public static void main(String[] args) {
		System.out.println("얼마에요?");
		Scanner scan = new Scanner(System.in);
		String n1 = scan.next();
		int a = Integer.parseInt(n1);
		System.out.println("몇개 드릴까요?");
		Scanner scan2 = new Scanner(System.in);
		String n2 = scan2.next();
		int b = Integer.parseInt(n2);
		System.out.println(b+"개 주세요");
		int add =0;
		if(a >= 1000){
			add = a*b;
			add = add /100;
			add = add *80;
		}else if(a >= 500){
			add= a*b;
			add = add / 100;
			add = add * 90;
		}else {
			add = a*b;
		}
		System.out.println("총 금액은 "+ add + " 입니다.");
	}
}
