import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number =  scan.nextInt();
        if(number >=0 && number <=10000){
        for(int i =2; i <=number/2; i++){
            if(number%i ==0){
                System.out.print(i+" ");
        	    }
        	}
    	}
        
    }
}
