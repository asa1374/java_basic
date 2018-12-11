package day9;
public class NameArray2 {
	public void test() {
		String[] names = {"홍길동","장영실","유관순"};
		String res = "";
		System.out.println("배열의 길이"+names.length);
		for(int i=0;i<names.length;i++) {
			if(i<names.length) {
				res += names[i] + ",";
			}else {
				res += names[i];
			}
		}
		System.out.println(res);
	}
}
