package Dengjialei;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//�ȼ�����ƣ�
/*
1.a>b  true
2.a<b  false
3.a=b  true
4.a>b  false
5.a<b  true
6.a=b false 

*/

//�ȼ������������ƣ�
/*
�� �� 	   ��������			���ǵȼ���
1		a=5 b=6 a>b  2.4
2		a=7 b=6 a>b	 1
3		a=7 b=7	a=b  3
4		a=1 b=-1 a>b 1.5
*/
//�޷���Ʊ߽�ֵ���������Ƚϣ�û�����



class C2_3Test {

	@Test
	void test() 
	{
		//������		
		C2_3 cmp = new C2_3();
		boolean flag = cmp.Compare(5, 6);//5>6
		assertEquals(true,flag);//����ture�����Ϊfalse
		
	}
	
	@Test
	void test2() 
	{
		//������
		C2_3 cmp = new C2_3();
		boolean flag = cmp.Compare(7, 6);//7>6
		assertEquals(false,flag);//����false�����Ϊtrue
		
	}
	
	@Test
	void test3() 
	{
		//������
		C2_3 cmp = new C2_3();
		boolean flag = cmp.Compare(7, 7);//7=7
		assertEquals(true,flag);//����true�����Ϊtrue
		
	}
	
	@Test
	void test4() 
	{
		//������
		C2_3 cmp = new C2_3();
		boolean flag = cmp.Compare(1, -1);//1>-1
		assertEquals(false,flag);//����false�����Ϊtrue
		
	}

}
