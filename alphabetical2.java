import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        if(number >=0 && number <= 26){
	        int i = 1;
        	
	        while(i <= number ){
	        	int j = 1;
	        	char character = (char) ( 'A' + i - 1)  ;
	        	while(j <= i){
	        		System.out.print(character);
	        		character+=1;
	        		j++;
	        	}
	        	System.out.println();
	        	i++;
	        }
	    }
	}
}
