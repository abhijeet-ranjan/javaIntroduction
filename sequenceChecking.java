import java.util.Scanner;
public class Main {
	
    public static int c;
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a[] = new int [n];
        for(int i = 0; i<n; i++)            // loop for taking input
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i<n-2; i++)          // loop for finding the minimum point
        {
            if(a[i]<a[i+2])
            {   c = i;                      // associated minimum valued index to c
                for( ; i<n-2; i++)          /* loop for checking whether after that the array 
                {                  			         //is decreasing or not*/  
                    if(a[i+1]<a[i+2])           
                    {
                        count = count+1;
                    }   
                    else
                    {

                    }
                }

            }
        if(count == n-2-c)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
}}
