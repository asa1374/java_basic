package day9;

public class NameArray2 {
	public void test() {
		String[] names = {"홍길동","장영실","유관순"};
		String res = "";
		for(int i=0;i<3;i++) {
			res += names[i] + ",";
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		NameArray2 na = new NameArray2();
		na.test();
	}
}
