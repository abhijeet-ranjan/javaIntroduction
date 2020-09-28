import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        if(number >=0 && number <= 26){
	        int i = number;
	        while(i > 0){
	        	int j = 1;
	        	char character = (char) ( 'A' + i - 1)  ;
	        	while(j <= (number - i + 1)){
	        		System.out.print(character);
	        		character += 1;
	        		j++;
	        	}
	        	System.out.println();
	        	i--;
	        }
	    }
	}
}
