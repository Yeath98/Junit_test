package Dengjialei;

import static org.junit.Assert.*;

import org.junit.Test;


//等价类设计：
/*
1.输出的飞机载物器数量和载物炸弹数量与原输出语句相一致
2.输出的飞机载物器数量和载物炸弹数量与原输出语句不一致

*/

//等价类测试用例设计：
/*
序 号 	 	  测试用例																					覆盖等价类
1		The fighter carries 4 pallets."+"The bomber bomb load is 14000.0					1
2		The fighter carries 5 pallets."+"The bomber bomb load is 14000.0					2
*/

//无法进行边界值测试，语句只有输出，没有输入数据




public class C2_14Test {

	//正样本
	@Test
	public void test1() {
		
		String result =C2_14.Aircraft();
        assertEquals("The fighter carries 4 pallets."+"The bomber bomb load is 14000.0", result);
	}
	
	//负样本
	@Test
	public void test2() {
		
		String result =C2_14.Aircraft();
        assertEquals("The fighter carries 5 pallets."+"The bomber bomb load is 14000.0", result);
	}

}
