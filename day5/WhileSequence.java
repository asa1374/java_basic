package day5;
import java.util.Scanner;
public class WhileSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("1부터 몇까지 나오게 할까요`?");
        int limit = scan.nextInt();
        int count = 1;
        String a = "";
        int sum = 0;             
        while(count <= limit){
            sum += count;
            if(count!=limit){
                a += count + "+";
            }else {
                a+= count + "=";
            }
            count++;        
        }
        System.out.println(a + sum);
	}
}
