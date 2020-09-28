import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int count  = 1;
        for(int i = 1; count <= n;){
            int alpha = 3*i + 2;
            if(alpha%4==0){
                i++;
                continue;
            }else{
                System.out.print(alpha + " ");
                i++;
                count++;
            }
        }
        

	}
}
