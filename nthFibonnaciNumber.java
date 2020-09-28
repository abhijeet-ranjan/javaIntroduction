import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        scan.close();
        int alpha = 1;
        int beta = 1;
        int theta = alpha + beta;
        for(int i = 1; i <= n-3; i++){
        	alpha = beta;
        	beta = theta;
        	theta = alpha + beta;
        }
        System.out.println(theta);	
	}
}
