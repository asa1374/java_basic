package day9;
import java.util.Scanner;
public class NameScoreArray {
	public void test() {
		System.out.println("3명 점수입력");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		String res = "";
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1) {
				res += arr[i] + ",";
			}else {
				res += arr[i];
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		NameScoreArray array = new NameScoreArray();
		array.test();
	}
}
