import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int i = 1;
		while(i <= n){
			int spaces = 1;
			int nums = 1;
				while(spaces <= n-i){
					System.out.print(" ");
					spaces++ ;
				}
				while(nums <= i){
					System.out.print(nums);
					nums++;
				}
				System.out.println();
				i++;
        }		
	}
}
