package day5;
import java.util.Random;
public class MyRandom {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(45)+1;
		System.out.println(a);
	}
}
