package Dengjialei;

public class C2_5 {
    public static void main(String[] args) 
    {
        int i = 1, sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }
        
        System.out.println("sum = " + sum);
    }
    
	public static int Sum() 
	{
		int sum = 0;
		int i=1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		//System.out.println("sum = " + sum);
		return sum;
	}

}
