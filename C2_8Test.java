package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//等价类设计：
/*
1.将输入的数拆解为其自己的因数
2.将输入的数拆解为其自己的因数，因数不匹配
3.将输入的数拆解为其自己的因数，因数缺少
4.输入的数不能为负数

*/

//等价类测试用例设计：
/*
序 号 	   		测试用例			覆盖等价类
1		8{1,2,4,8}				1
2.		8{1,2,4}				3
3.		8{1,2,4,9}				2
4.		-8{-1，-2，-4，-8}			4
*/


//无法设计边界值，数字无穷
class C2_8Test {

	@Test
	public void test1() {
		//正样本
		int[] result = C2_8.factor(8);
		int[] data={1 ,2 ,4 ,8 };
		for(int i=0;i<6;i++)
			
		 System.out.print(result[i]);
		 //System.out.print(data[1]);
		for(int j=0;j<4;j++)
        {
			assertEquals(data[j], result[j]);
        
        }
		 
	}
	
	@Test
	public void test2() {
		//负样本
		int[] result = C2_8.factor(8);
		int[] data={1 ,2 ,4};
		for(int i=0;i<6;i++)
			
		 System.out.print(result[i]);
		 //System.out.print(data[1]);
		for(int j=0;j<4;j++)
        {
			assertEquals(data[j], result[j]);
        
        }
		 
	}
	
	
	
	@Test
	public void test3() {
		//负样本
		int[] result = C2_8.factor(8);
		int[] data={1 ,2 ,4 ,9 };
		for(int i=0;i<6;i++)
			
		 System.out.print(result[i]);
		 //System.out.print(data[1]);
		for(int j=0;j<4;j++)
        {
			assertEquals(data[j], result[j]);
        
        }
		
		 
	}
	
	
	
	@Test
	public void test4() {
		//负样本
		int[] result = C2_8.factor(-8);
		int[] data={-1 ,-2 ,-4,-8};
		for(int i=0;i<6;i++)
			
		 System.out.print(result[i]);
		 //System.out.print(data[1]);
		for(int j=0;j<4;j++)
        {
			assertEquals(data[j], result[j]);
        
        }
		 
	}
	
	

}
