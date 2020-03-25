package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//等价类设计：
/*
1.1为Monday
2.2为Tuesday
3.3为Wednesday
4.4为Thursday
5.5为Friday
6.6为Saturday
7.7为Sunday
8.所输入数字与当前的星期不一致
9.所输入数字不在1-7范围内,（返回999）

*/

//等价类测试用例设计：
/*
序 号 	   测试用例			覆盖等价类
1		7（7）		7
2		0			9
3		1（7）		8
*/


//边界值就是等价类中第9项
class C2_4Test {
	
	//正样本
	@Test
	void test() {
		//fail("Not yet implemented");
		C2_4 c24 = new C2_4();
	    int result = c24.week(7);
	    assertEquals(result,7);
	}
	
	//负样本
		@Test
		void test2() {
			//fail("Not yet implemented");
			C2_4 c24 = new C2_4();
		    int result = c24.week(0);
		    assertEquals(result,0);
		}
		
		//负样本
		@Test
		void test3() {
			//fail("Not yet implemented");
			C2_4 c24 = new C2_4();
		    int result = c24.week(1);
		    assertEquals(result,7);
		}

}
