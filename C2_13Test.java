package Dengjialei;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

//等价类设计：
/*
1.输出的dog1，dog2，chicken与原输出语句相一致
2.输出的dog1，dog2，chicken与原输出语句不一致

*/

//等价类测试用例设计：
/*
序 号 	 	  测试用例																					覆盖等价类
1		The weight of dog1 is 15The weight of dog2 is 37The weight of chicken is 3					1
2		The weight of dog1 is 15The weight of dog2 is 37The weight of chicken is 3					2
*/

//无法进行边界值测试，语句只有输出，没有输入数据



public class C2_13Test {

	
	//正样本
	@Test
	public void test() {
		//fail("尚未实现");
		String result =C2_13.dog();
        assertEquals("The weight of dog1 is 15The weight of dog2 is 37The weight of chicken is 3", result);
	}
	
	
	//负样本
	@Test
	public void test2() {
		//fail("尚未实现");
		String result =C2_13.dog();
        assertEquals("The weight of dog1 is 15The weight of dog2 is 37The weight of chicken is 3", result);
	}

}
