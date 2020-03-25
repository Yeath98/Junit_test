package Dengjialei;
import java.util.Scanner;

public class C2_4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;

        day = sc.nextInt();

        switch (day) {
            case 0: {
                System.out.println("Sunday");
                break;
            }
            case 1:{ 
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            default: {
                System.out.println("Day out of range Sunday .. Saturday");
            }
        }

        sc.close();
    }
	
	public static int week(int i)
	{
		if(i==1)
			return 1;
		else if(i==2)
			return 2;
		else if(i==3)
			return 3;
		else if(i==4)
			return 5;
		else if (i==6)
			return 6;
		else if (i==7)
			return 7;
		else 
			return 999;
		
	}

}
