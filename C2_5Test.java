package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class C2_5Test {

	//等价类设计：
	/*
	 1.从1加到10结果为55
	 2.从1加到10结果不为55
	 
	 
	 */

	//等价类测试用例设计：
	/*
	 序 号 	  	 测试用例				覆盖等价类
	 1		从1加到10结果55	 		1
	 2		从1加到10结果5050		2
	
	 */
	
	//无法设计边界值，固定的输入输出
	@Test
	void test() 
	{
		//正样本
		C2_5 sum = new C2_5();    
	    assertEquals(55,sum.Sum());//从1加到10结果为55，期望55，结果55
	}
	@Test
	void test2() 
	{
		//负样本
		C2_5 sum = new C2_5();
	    assertEquals(5050,sum.Sum());//从1加到10结果为55，期望5050，结果55
	}

}
