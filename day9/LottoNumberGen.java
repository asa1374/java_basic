package day9;
import java.util.Random;
import java.util.Scanner;
public class LottoNumberGen {
	public void test() {
		//Lotto 6개의 랜덤 숫자
		//1~45까지 랜덤숫자
		Random random = new Random();
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]= random.nextInt(45)+1;
		}
		String res = "";
		for(int i=0;i<lotto.length;i++) {
			if(i<lotto.length-1) {
				res += lotto[i]+",";
			}else {
				res += lotto[i];
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		LottoNumberGen gen = new LottoNumberGen();
		gen.test();
	}
}
