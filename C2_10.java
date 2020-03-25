package Dengjialei;
import java.util.Scanner;
public class C2_10 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int i = 0, j = 0, n;
	        System.out.println("Enter some integers please (enter 0 to quit):");
	        n = sc.nextInt();
	        while (n != 0) {
	            if (n > 0)
	                i += 1;
	            if (n < 0)
	                j += 1;
	            n = sc.nextInt();
	        }
	        System.out.println("Count of positive integers: " + i);
	        System.out.println("Count of negative integers: " + j);
	        sc.close();
	    }
	   
	   
	   public static int[] Geshu(int n[])
		{
			int i=0,j=0,m=0;
			int[] tmp = new int[10];
			
			while(n[m] != 0) {
	            if (n[m] > 0)
	                {
	            		i += 1;
	            		m++;
	                }
	            else if (n[i] < 0)
	            	{	
	                	j += 1;
	                	m++;
	           
	           
	            	}
			}
			tmp[0]=i;
			tmp[1]=j;
			
			 return tmp;
	        
				
		}
	   
	   

	  	   

}
