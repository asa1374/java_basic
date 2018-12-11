package day9;
import java.util.Scanner;
public class ScoreArray {
	public void test() {
		System.out.println("점수 3개 입력");
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0;i<num.length;i++) {
			num[i]=scanner.nextInt();
		}
		String a = "";
		for(int i=0;i<num.length;i++) {
			if(i<num.length-1) {
				a += num[i]+",";
			}else {
				a += num[i];
			}
		}
		System.out.println(a);
	}
}
