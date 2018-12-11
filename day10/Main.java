package day10;
import java.util.Scanner;
import day9.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println(" [메뉴]\n 0.종료\n 1.BMI\n 2.계산기\n 3.시퀀스의 합\n"
					+ " 4.구구단\n 5.로또번호\n 6.홀수의 합\n 7.성별검사\n 8.성적표\n");
			switch(scanner.next()) {
			case "0" : System.out.println("종료"); return;
			case "1" : 
				Bmi bmi = new Bmi();
				System.out.println("키와 몸무게 입력하세요");
				System.out.println(bmi.test(scanner.nextDouble(),scanner.nextDouble()));
				break;
			case "2" :
				Calc calc = new Calc();
				System.out.println("계산식(숫자 연산자 숫자) 입력하시오");
				System.out.println((calc.test(scanner.nextInt(), scanner.next(), scanner.nextInt())));
				break;
			case "3" :
				Sequence sequence = new Sequence();
				System.out.println("1부터 덧셈할 마지막 숫자 입력");
				System.out.println(sequence.test(scanner.nextInt()));
				break;
			case "4" :
				Gugudan gugudan = new Gugudan();
				System.out.println("몇단을 출력할까요?");
				System.out.println(gugudan.test(scanner.nextInt()));
				break;
			case "5" :
				LottoNumberGen gen = new LottoNumberGen();
				System.out.println(gen.test());
				break;
			case "6" :
				OddSum oddSum = new OddSum();
				System.out.println("숫자를 입력해주세요");
				System.out.println(oddSum.test(scanner.nextInt()));
				break;
			case "7" :
				GenderChecker checker = new GenderChecker();
				System.out.println("주민번호 입력");
				System.out.println(checker.test(scanner.next()));
				break;
			case "8" :
				NameScoreArray arr = new NameScoreArray();
				System.out.println("몇명의 학생의 점수를 입력하시나요");
				int num = scanner.nextInt();
				String[] name = new String[num];
				int[] score = new int[num];
				for(int i=0;i<num;i++) {
					System.out.println("학생이름 점수 입력");
					name[i] = scanner.next();
					score[i] = scanner.nextInt();
				}
				System.out.println(arr.test(name,score));
				break;
			}
		}
	}
}
