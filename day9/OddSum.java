package day9;
public class OddSum {
	public String test(int odd) {
		//Odd 홀수
		//Even 짝수
		//1부터 입력받은 숫자까지 합인데 그중에서 홀수의합
		int sum = 0;
		String res = "";
		for(int i=0;i<=odd;i++) {
			if(i%2!=0) {
				if(i<odd-1) {
					res += i+"+" ;
				}else {
					res += i+"=";
				}
				sum+=i;
			}
		}
		return res+sum;
	}
}

