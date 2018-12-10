package day4;
import java.util.Scanner;
public class GenderChecker {
	public static void main(String[] args) {
		System.out.println("주민등록번호 - 포함 13자리를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		String ssn = scan.next();
		char ch = ssn.charAt(7);
		String gender = "";
		int len = ssn.length();
		System.out.println(len-1 +"자리 입니다." );
		if(len < 15){
			if(ch=='1'||ch=='3'){
				gender="남자";
			}else if(ch=='2'||ch=='4'){
				gender="여자";
			}else if(ch=='5'||ch=='6'){
				gender="외국인";
			}else if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
				gender="다시 입력하세요";
			}else {
				gender="다시 입력하세요";
			}
		}else {
			gender="다시 입력하세요.";
		}
		System.out.println(gender);
	}
}
