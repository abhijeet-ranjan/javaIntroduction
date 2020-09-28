import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int choice = scan.nextInt();
		scan.close();
		if(choice==1){
			int sum = 0;
			for(int i = 1; i <= number;i++){
				sum+=i;
			}
			System.out.println(sum);
		}else if(choice == 2){
			long product = 1;
			for(int i =1;i <= number;i++){
				product *= i;
			}
			System.out.println(product);
		}else{
			System.out.println(-1);
		}

	}
}
