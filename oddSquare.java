import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int i = 1;
		while(i <= n){
			int alpha = 2*i - 1;
			while(alpha <= 2*n - 1){
					System.out.print(alpha);
					alpha += 2;
			}
			int beta = 1 ;
			while(beta < 2*(i -1)){
				System.out.print(beta);
				beta+=2;
			}
		System.out.println();
		i++;
		}
	}
}
