package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//等价类设计：
/*
1.i<10
2.i>10
3.从i加到10并加上sum与结果相等
4.从i加到10并加上sum与结果不相等

*/

//等价类测试用例设计：
/*
序 号 		   测试用例				覆盖等价类
1		i=1 sum=1(56)		1.3
2		i=11 sum=0 (21)	 	2
3		i=1 sum=1(21)		1.4
*/

//边界值  i=0 sum=1(56)			1.3
class C2_7Test {

	@Test
	void test() {
		//正样本
				C2_7 c27 = new C2_7();
			    int result = c27.getsum(1, 1);
			    assertEquals(result,56);
	}
	
	@Test
	void test2() {
		//负样本
				C2_7 c27 = new C2_7();
			    int result = c27.getsum(11, 0);
			    assertEquals(result,21);
	}
	@Test
	void test3() {
		//负样本
		C2_7 c27 = new C2_7();
		int result = c27.getsum(1,1);
		 assertEquals(result,21);
		
	}
	@Test
	void test4() {
		//正样本
		C2_7 c27 = new C2_7();
		int result = c27.getsum(0,1);
		 assertEquals(result,56);
		
	}
}
