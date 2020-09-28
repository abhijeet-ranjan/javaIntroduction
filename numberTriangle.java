import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int i = 1;
		while(i <= n){
			int spaces = 1;
			while(spaces <= (n -i)){
				System.out.print("  ");
				spaces++;				
			}
			int num = i;
			while(num <= (2*i - 1)){
				System.out.print(num);
				num++;
			}
			int dec = 2*i - 2;
			while(dec > i - 1){
				System.out.print(dec);
				dec--;
			}
			System.out.println();
			i++;
		}

	}
}
