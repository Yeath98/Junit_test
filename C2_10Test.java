package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//等价类设计：
/*
1.正负个数与所输入的数里面的数一致
2.正负个数与所输入的数里面的数不一致

*/

//等价类测试用例设计：
/*
序 号 	 	  	测试用例				覆盖等价类
1		 {1，2，3，0};{3,0}			1
2		 {1,2,-3,0}{2,1}		1
3		 {-1,-2,-3,0}{0,3}		1
4		 {-1,-2,-3,0}{1,3}		2
	
*/

//无法测试边界值，数字无穷


class C2_10Test {
	//正样本
	@Test
	public void test() {
		
		int i=0;
		int[] data={1,2,3,0};
		int[] data2={3,0};
		
		int[] result1 = C2_10.Geshu(data);		
		 System.out.println(result1[i]);
        assertEquals(data2[0], result1[0]);
        assertEquals(data2[1], result1[1]);
       
		
	}
	
	//正样本
	@Test
	public void test2() {
		
		int i=0;
		int[] data1={1,2,-3,0};
		int[] data2={2,1};
		
		int[] result1 = C2_10.Geshu(data1);		
		 System.out.println(result1[1]);
        assertEquals(data2[0], result1[0]);
        assertEquals(data2[1], result1[1]);
       
		
	}
	
	//正样本
		@Test
		public void test3() {
			
			int i=0;
			int[] data1={-1,-2,-3,0};
			int[] data2={0,3};
			
			int[] result1 = C2_10.Geshu(data1);		
			 System.out.println(result1[1]);
	        assertEquals(data2[0], result1[0]);
	        assertEquals(data2[1], result1[1]);
	       
			
		}
		
		//正样本
				@Test
				public void test4() {
					
					int i=0;
					int[] data1={-1,-2,-3,0};
					int[] data2={1,3};
					
					int[] result1 = C2_10.Geshu(data1);		
					 System.out.println(result1[1]);
			        assertEquals(data2[0], result1[0]);
			        assertEquals(data2[1], result1[1]);
			       
					
				}

}
