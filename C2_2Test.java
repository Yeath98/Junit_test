package Dengjialei;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//等价类设计：
/*
 1.年份可以被4和100整除
 2.年份可以被400整除
 3.年份不可以被4和100整除
 4.年份不可以被400整除
 
 */

//等价类测试用例设计：
/*
 序 号 	   测试用例			覆盖等价类
 1		year=2000	 1.2
 2		year=2001	 3.4
 3		year=2001	 3.4
 */

//边界值 0	 year=1 	1.2
class C2_2Test {
	
	//正样本
	@Test
	void test() 
	{
		C2_2 c22 = new C2_2();
		boolean flag = c22.testyear(2000);
		assertEquals(true,flag);//期望ture,2000是闰年
	}
	
	//正样本
	@Test
	void test2() 
	{
		C2_2 c22 = new C2_2();
		boolean flag = c22.testyear(2001);
		assertEquals(false,flag);//期望false,2001不是闰年
	}
	//负样本
	@Test
	void test3() 
	{
		C2_2 c22 = new C2_2();
		boolean flag = c22.testyear(2001);
		assertEquals(true,flag);//期望ture,2001不是闰年
	}
	//正样本
	@Test
	void test4() 
	{
		C2_2 c22 = new C2_2();
		boolean flag = c22.testyear(0);
		assertEquals(true,flag);//期望ture,0是闰年
	}

}
