package day9;
import java.util.Scanner;
public class NameScoreArray {
	public void test() {
		System.out.println("몇명의 학생의 점수를 입력하시나요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String[] name = new String[num];
		int[] res = new int[num];
		System.out.println(num+"명의 학생의 이름과 점수를 입력하시오");
		for(int i=0;i<num;i++) {
			name[i] = scanner.next();
			res[i] = scanner.nextInt();
		}
		for(int i=0;i<num-1;i++) {
			for(int j =1;j<num;j++) {
				if(res[j]>res[i]) {
					int temp = res[j];
					res[j]=res[i];
					res[i]=temp;
					String tem = name[j];
					name[j]=name[i];
					name[i]=tem;					
				}
			}
		}
		for(int i=0;i<num;i++) {
			System.out.println((i+1)+"등 "+name[i] + res[i]+"\n");
		}
	}
	public static void main(String[] args) {
		NameScoreArray array = new NameScoreArray();
		array.test();
	}
}
