package day9;
public class Calc {
	public String test(int num1, String op,int num2) {
		int res = 0;
		switch(op) {
		case "+" : res = num1+num2 ; break;
		case "-" : res = num1-num2 ; break;
		case "*" : res = num1*num2 ; break;
		case "/" : res = num1/num2 ; break;
		case "%" : res = num1%num2 ; break;
		}
		 return num1+op + num2 + "=" +res;
	}
}
