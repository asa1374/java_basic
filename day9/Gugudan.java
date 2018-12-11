package day9;
public class Gugudan {
	//출력할 단.. 예를 들어 3을 입력하면
	//3단 출력 3*2 = 6 ...3*9=27
	public String test(int dan) {
		System.out.println("출력할 단을 입력하세요");
		String res = "";
		for(int i=1;i<10;i++) {
			res += dan + "*"+ i + "="+dan*i +"\n"; 
		}
		return res;
	}
}
