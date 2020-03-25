package Dengjialei;
import java.util.Scanner;


public class C2_6 {
	    public static void main(String[] args) 
	    {
	        int n, right_digit;

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number: ");
	        n = sc.nextInt();

	        System.out.print("The number in reverse order is ");
	        do {
	            right_digit = n % 10;
	            System.out.print(right_digit);
	            n /= 10;
	        } while (n != 0);

	        System.out.println();
	        sc.close();
	    }
	    public static int daoxu(int n)
	    {
			int num=0;
			int sum=0;
			int count=0;
			int m=0;
			int t=0;
			int k=1;
			while(k>0){
				k=(int)(n-Math.pow(10, count));//判断位数直到k<0
				count++;
			}
			m=count-1;
			t=n;
//			首尾颠倒
			for(int i=1;i<=m;i++){
				num=t%10;
				sum=(int)(sum+num*Math.pow(10, m-i));
				t=(t-num)/10;
			}
			if(sum==n)
			{
				return 1;
			}
			else
			{
				return sum;
			}
		}



}
