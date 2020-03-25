package Dengjialei;
import java.util.Scanner;


public class C2_8 {
	
	public static int[] factor(int n)
	{
		 int k=0;
		//int[] i =new int[20];
		 int[] tmp = new int[10];
		 int j=0;
		 for (k = 1; k <= n; k++)
	            if (n % k == 0)
	                {System.out.print(k + " ");
	                
	                tmp[j]=k;
	                
	                System.out.println(tmp[j]);
	                j++;
	                }
		           
	                
	        //System.out.println();
		 //System.out.print(k);

		 return tmp;
			
	}
	
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        n = sc.nextInt();
        
		
		
        factor( n);
     

     
        sc.close();
    }
}