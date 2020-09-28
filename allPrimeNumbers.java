import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		boolean isPrime = false;
		System.out.println(2);
		for(int i = 2;i <= n ; i++){
			for(int j = 2; j < i; j++){
				if(i%j == 0){
					isPrime = false;
					break;
				}else{
					isPrime = true;
				}
			}
			if(isPrime){
				System.out.println(i);
			}
		}
	}
}
