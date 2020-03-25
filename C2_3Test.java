package Dengjialei;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//等价类设计：
/*
1.a>b  true
2.a<b  false
3.a=b  true
4.a>b  false
5.a<b  true
6.a=b false 

*/

//等价类测试用例设计：
/*
序 号 	   测试用例			覆盖等价类
1		a=5 b=6 a>b  2.4
2		a=7 b=6 a>b	 1
3		a=7 b=7	a=b  3
4		a=1 b=-1 a>b 1.5
*/
//无法设计边界值，两个数比较，没有误差



class C2_3Test {

	@Test
	void test() 
	{
		//负样本		
		C2_3 cmp = new C2_3();
		boolean flag = cmp.Compare(5, 6);//5>6
		assertEquals(true,flag);//期望ture，结果为false
		
	}
	
	@Test
	void test2() 
	{
		//负样本
		C2_3 cmp = new C2_3();
		boolean flag = cmp.Compare(7, 6);//7>6
		assertEquals(false,flag);//期望false，结果为true
		
	}
	
	@Test
	void test3() 
	{
		//正样本
		C2_3 cmp = new C2_3();
		boolean flag = cmp.Compare(7, 7);//7=7
		assertEquals(true,flag);//期望true，结果为true
		
	}
	
	@Test
	void test4() 
	{
		//负样本
		C2_3 cmp = new C2_3();
		boolean flag = cmp.Compare(1, -1);//1>-1
		assertEquals(false,flag);//期望false，结果为true
		
	}

}
