package day4;
import java.util.Scanner;
public class LeepYear {
	public static void main(String[] args) {
		System.out.println("년도입력 ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String result="";
        if((a%4==0 && a%100!=0) || a%400==0){   
                result="윤년";
        }else{
                result="평년";
        }
        System.out.print(result);
	}
}
