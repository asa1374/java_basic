package day6;
import java.util.Scanner;
public class Menu {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);			
		while(true) {
			System.out.println("[메뉴]\n0.종료 1.계산기 2.BMI 3.윤년계산 4.주민번호 5.등수구하기");
			String num = scanner.next();
			switch(num) {
			case "0": 
				System.out.println("종료");
				return;
			case "1": 
				System.out.println("계산기 식을 입력해주세요");
				int a = scanner.nextInt();
				String op = scanner.next();
				int b = scanner.nextInt();
				int add=0;
				switch(op) {
				case "+" : add = a+b;break;
				case "-" : add = a-b;break;
				case "*" : add = a*b;break;
				case "/" : add = a/b;break;
				case "%" : add = a%b;break;
				}
				System.out.println(a+op+b+"="+add);
				break;
			case "2": 
				System.out.println("몸무게를 입력해주세요");				
				double w = scanner.nextDouble();
				System.out.println("키를 입력해주세요");
				double t = scanner.nextDouble();
				
				double bmi = w/(t*t)*10000;
				String bm = "";
				if(bmi>=40) {
					bm = "고도비만";
				}else if(bmi>=35) {
					bm = "중등고 비만";
				}else if(bmi >=30) {
					bm = "경도 비만";
				}else if(bmi>=25) {
					bm = "과체중";
				}else if(bmi>=18) {
					bm = "정상";
				}else {
					bm = "저체중";
				}
				System.out.println("BMI는 " + bmi + "이고 " + bm +"입니다.");
				break;
			case "3": 
				System.out.println("년도를 입력해주세요");
				int y = scanner.nextInt();
				String year = "";
				if(y%4==0 && y%100==0 || y%400==0) {
					year = "윤년";
				}else {
					year = "평년";
				}
				System.out.println(y + "년은 " + year);
				break;
			case "4": 
				System.out.println("이름을 입력해주세요");
				String name = scanner.next();
				System.out.println("주민번호를 입력해주세요");
				String ssn = scanner.next();
				char ju = ssn.charAt(7);
				String res = "";
				
				switch(ju) {
				case '1' : case '3' :
					res = "남자";
					break;
				case '2' : case '4' :
					res = "여자";
					break;
				case '5' : case '6' :
					res = "외국인";
					break;
				default : 
					res = "잘못입력하셨습니다.";
				}
				System.out.println(name+res);
				break;
			case "5": 
				System.out.println("몇명의 학생의 점수를 입력하시나요");
				int num1 = scanner.nextInt();
				int[] test = new int[num1];
				String[] test1 = new String[num1];
				
				System.out.println(num1+"명의 학생과 점수를 입력해주세요");
				for(int i=0;i<num1;i++) {
				test1[i] = scanner.next();
				test[i] = scanner.nextInt();
				}
				for(int i=0;i<num1-1;i++) {
					for(int s=1;s<num1;s++) {
						if(test[s]>test[i]) {
							int temp = test[s];
							test[s]=test[i];
							test[i]=temp;
							String temp1 = test1[s];
							test1[s]=test1[i];
							test1[i]=temp1;
						}
					}
				}
				for(int j=0; j<num1;j++) {
				System.out.println(test1[j]+test[j]);
				}
				break;
			}
		}
		
	}
}
