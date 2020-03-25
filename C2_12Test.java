package Dengjialei;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



//等价类设计：
/*
1。输出Lin Lin学号，姓名，性别，年龄
2。输出的同学不为Lin Lin

*/

//等价类测试用例设计：
/*
序 号 		   	测试用例			覆盖等价类
1		 Lin Lin F 19			1
2		 Lin	 F 19			2
*/

//无法测试边界值，姓名无穷且不确定




public class C2_12Test {

	@Before
	public void setUp() throws Exception 
	{
	}

	
	//正样本
	@Test
	public void test1() {
		
		Object [] array=new Object[4];
		
		array =  C2_12.student();		
        assertEquals(97001, array[0]);
        assertEquals("Lin Lin", array[1]);
        System.out.println(array[2]);
        assertEquals('F', array[2]);
        assertEquals(19, array[3]);
     
       
	}
	
	
	//负样本
	@Test
	public void test2() {	
		
		Object [] array=new Object[4];
		
		array =  C2_12.student();
        assertEquals(97001, array[0]);
        assertEquals("Lin", array[1]);
        System.out.println(array[2]);
        assertEquals('F', array[2]);
        assertEquals(19, array[3]);
     
       
	}

}
