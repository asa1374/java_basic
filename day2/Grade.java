package day2;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		System.out.println("학생 이름을 입력해주세요.");
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.next();
		System.out.println("5과목의 점수를 입력해 주세요.");
		Scanner scan = new Scanner(System.in);
		String sub1 = scan.next();
		String sub2 = scan.next();
		String sub3 = scan.next();
		String sub4 = scan.next();
		String sub5 = scan.next();
		int num1 = Integer.parseInt(sub1);
		int num2 = Integer.parseInt(sub1);
		int num3 = Integer.parseInt(sub1);
		int num4 = Integer.parseInt(sub1);
		int num5 = Integer.parseInt(sub1);
		int sum = num1 + num2 + num3 + num4 +num5;
		int arg = 0;
		arg = sum / 5;
		if(arg >= 90){
			System.out.println(name + " 총점, " + sum + "점, " + "평균" + arg + "성적 A학점" );
		}else if(arg >= 80){
			System.out.println(name + " 총점, " + sum + "점, " + "평균" + arg + "성적 B학점" );
		}else if(arg >= 70){
			System.out.println(name + " 총점, " + sum + "점, " + "평균" + arg + "성적 C학점" );
		}else if(arg >= 60){
			System.out.println(name + " 총점, " + sum + "점, " + "평균" + arg + "성적 D학점" );
		}else {
			System.out.println(name + " 총점, " + sum + "점, " + "평균" + arg + "성적 F학점" );
		}
	}
}
