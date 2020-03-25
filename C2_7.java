package Dengjialei;

public class C2_7 {
	  public static void main(String[] args) {
	        int i = 1, sum = 0;
	        do {
	            sum += i;
	            i++;
	        } while (i <= 10);
	        System.out.println("sum = " + sum);
	    }
	  public static int getsum(int i ,int sum)
	  {
		  
		  do{
			  sum += i;
			  i++;
		  }while(i<=10);
		  return sum;
		  
	  }
}
