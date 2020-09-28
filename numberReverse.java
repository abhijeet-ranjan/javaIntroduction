import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        scan.close();
        int reverse = 0;
        if(n == 0){
            System.out.print(reverse);            
        }else{
        	while(n > 0){
            long alpha = n%10;
            if(alpha != 0){
                System.out.print(alpha);
            }
            n/=10;
        }
    }
}
}
