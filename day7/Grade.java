package day7;
import java.util.Scanner;
public class Grade {
	public void g() {
		System.out.println("학생 수를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("학생이름과 점수를 입력하시오");
		String[] hak = new String[a];
		int[] h = new int[a];
		for(int i=0;i<a;i++) {
			hak[i] = scan.next();
			h[i] = scan.nextInt();
		}
		for(int i=0;i<a-1;i++) {
			for(int j=1;j<a;j++) {
				if(h[j]>h[i]) {
					int temp = h[i];
					h[i]=h[j];
					h[j]=temp;
					String n = hak[i];
					hak[i] = hak[j];
					hak[j] =n;
				}
			}
		}
		String res = "";
		for(int i=0;i<a;i++) {
			res+=hak[i] + h[i]+"\n";
		}
		System.out.println(res);
	}
}
