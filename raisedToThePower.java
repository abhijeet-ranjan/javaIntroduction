import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {       
		Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        long power = scan.nextLong();
        long product = number;
        scan.close();
        if((number >= 0 && number <= 8) &&(power >=0 && power <= 9)){
        	if(power == 0){
        		product  = 1;
        	}else if(power == 1){
        		product = number;
        	}else{
        		while(power > 1){
        		product = product * number ;
        		power -- ; 
        		}
        	}
        	System.out.println(product);
        }
        
    }
}
