import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();
        long binary = 0;
        long number = 0;
        long multiplier = 1;
        while(n>0){
            long alpha = n % 2;
            number += multiplier*alpha;
            multiplier *= 10;
            n /= 2;
        }
        System.out.println(number);

	}
}
