package Dengjialei;
import java.util.Scanner;
public class C2_3 {
	 public static void main(String[] args) 
	 {
	        int x, y;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter x and y: ");

	        x = sc.nextInt();
	        y = sc.nextInt();
	        
	        if (x != y) {
	            if (x > y) {
	                System.out.println("x > y");
	            } else {
	                System.out.println("x < y");
	            }
	        } else {
	            System.out.println("x = y");
	        }

	        sc.close();
	    }
	 public boolean Compare(int x,int y)
		{
			if (x != y)
				if (x > y)
					return true;
					//System.out.println("x > y");
				else
					return false;
					//System.out.println("x < y");
			else
				return true;
				//System.out.println("x = y");
			
				
		}
	 

}
