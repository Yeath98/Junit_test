package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class C2_5Test {

	//�ȼ�����ƣ�
	/*
	 1.��1�ӵ�10���Ϊ55
	 2.��1�ӵ�10�����Ϊ55
	 
	 
	 */

	//�ȼ������������ƣ�
	/*
	 �� �� 	  	 ��������				���ǵȼ���
	 1		��1�ӵ�10���55	 		1
	 2		��1�ӵ�10���5050		2
	
	 */
	
	//�޷���Ʊ߽�ֵ���̶����������
	@Test
	void test() 
	{
		//������
		C2_5 sum = new C2_5();    
	    assertEquals(55,sum.Sum());//��1�ӵ�10���Ϊ55������55�����55
	}
	@Test
	void test2() 
	{
		//������
		C2_5 sum = new C2_5();
	    assertEquals(5050,sum.Sum());//��1�ӵ�10���Ϊ55������5050�����55
	}

}
