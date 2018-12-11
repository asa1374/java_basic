package day9;
public class Sequence {
	public String test(int limit) {
		String res = "";
		int sum = 0;
		for(int i=0;i<=limit;i++) {
			if(i!=10) {
				res += i+"+";
			}else {
				res+= i+"=";
			}
			sum+=i;
		}
		return res +sum;
	}
}
