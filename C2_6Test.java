package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//等价类设计：
/*
1.数字颠倒
2.数字未颠倒
3.数字颠倒与结果不符
4.数字为个位数
*/

//等价类测试用例设计：
/*
序 号 	 	  测试用例			覆盖等价类
1		4511（1154）	 	1
2		4511（154）	 	3
3		4511（4511）	 	2
4		1（1）			4
*/


//无法设计边界值，数字无穷

class C2_6Test {

	@Test
	void test() 
	{
		//正样本
		C2_6 c26 = new C2_6();
	    int result = c26.daoxu(4511);
	    //System.out.printf("Enter the number: %d",result);
	    assertEquals(result,1154);
	    
	}
	@Test
	void test2() 
	{
		//负样本
		C2_6 c26 = new C2_6();
	    int result = c26.daoxu(4511);
	    //System.out.printf("Enter the number: %d",result);
	    assertEquals(result,154);
	    
	}
	@Test
	void test3() 
	{
		//负样本
		C2_6 c26 = new C2_6();
	    int result = c26.daoxu(4511);
	    //System.out.printf("Enter the number: %d",result);
	    assertEquals(result,4511);
	    
	}
	@Test
	void test4() 
	{
		//负样本
		C2_6 c26 = new C2_6();
	    int result = c26.daoxu(2);
	    //System.out.printf("Enter the number: %d",result);
	    assertEquals(result,2);
	}


}
