package Dengjialei;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//�ȼ�����ƣ�
/*
 1.��ݿ��Ա�4��100����
 2.��ݿ��Ա�400����
 3.��ݲ����Ա�4��100����
 4.��ݲ����Ա�400����
 
 */

//�ȼ������������ƣ�
/*
 �� �� 	   ��������			���ǵȼ���
 1		year=2000	 1.2
 2		year=2001	 3.4
 3		year=2001	 3.4
 */

//�߽�ֵ 0	 year=1 	1.2
class C2_2Test {
	
	//������
	@Test
	void test() 
	{
		C2_2 c22 = new C2_2();
		boolean flag = c22.testyear(2000);
		assertEquals(true,flag);//����ture,2000������
	}
	
	//������
	@Test
	void test2() 
	{
		C2_2 c22 = new C2_2();
		boolean flag = c22.testyear(2001);
		assertEquals(false,flag);//����false,2001��������
	}
	//������
	@Test
	void test3() 
	{
		C2_2 c22 = new C2_2();
		boolean flag = c22.testyear(2001);
		assertEquals(true,flag);//����ture,2001��������
	}
	//������
	@Test
	void test4() 
	{
		C2_2 c22 = new C2_2();
		boolean flag = c22.testyear(0);
		assertEquals(true,flag);//����ture,0������
	}

}
