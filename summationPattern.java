import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int i = 1;
		while(i <= n){
			int sum = 0;
			int alpha = 1;
			while(alpha <= i){
				sum += alpha;
				if(alpha == 1){
					System.out.print(alpha);
				}else{
					System.out.print("+" + alpha );
				}
				alpha++;
			}
			System.out.print("="+sum);
			System.out.println();
			i++;
		}
						

	}
}
