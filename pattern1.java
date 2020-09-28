import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
    	Scanner scan =  new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		System.out.println("*");
		int i = 1;
		while(i <= n){
			System.out.print("*");
			int num = 1;
			while(num <= i){
				System.out.print(num);
				num++;
			}
			int alpha = i-1;
			while(alpha > 0){
				System.out.print(alpha);
				alpha--;
			}
			System.out.print("*");
			System.out.println();
			i++;
		}
		while(i > n && i <=(2*n-1)){
			System.out.print("*");
			int j = 2*n - i + 1;
			int num = 1;
			while(num < j){
				System.out.print(num);
				num++;
			}
			int alpha = ( j-1-1);
			while(alpha > 0){
				System.out.print(alpha);
				alpha--;
			}
		System.out.print("*");
		System.out.println();
		i++;
		}
		System.out.println("*");
    }
}
