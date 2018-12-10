package day9;

public class NameArray {
	public void test() {
		String[] names = new String[3];
		names[0] = "이름은";
		names[1] = "무엇일";
		names[2] = "까아아";
		String res = "";
		for(int i=0;i<3;i++) {
			res += names[i] + ",";
		}
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		NameArray na = new NameArray();
		na.test();
	}
}
