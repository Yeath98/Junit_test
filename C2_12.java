package Dengjialei;

public class C2_12 {
	 public static Student stu = new Student(97001, "Lin Lin", 'F', 19);

	    public static void main(String[] args) {
	        System.out.printf("%7d%20s%3c%3d", stu.num, stu.name, stu.sex, stu.age);
	    }
	    
	    public static Object[] student()
		{
	    	
			Object [] array=new Object[4];
			array[0] = stu.num;
	        array[1] = stu.name;
	        array[2] =stu.sex;
	        array[3]=stu.age;
	    	return  array;
				
		}
	    
	    
	    
	    
	    
}
