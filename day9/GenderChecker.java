package day9;
public class GenderChecker {
	public String test(String ssn) {
		char ch = ssn.charAt(7);
		String res = "";
		switch(ch) {
		case '1' :  case '3' : res= "남자"; break;
		case '2' :  case '4' : res= "여자"; break;
		case '5' :  case '6' : res= "외국인"; break;
		default : res = "잘못입력";		
		}
		return res;
	}
}
