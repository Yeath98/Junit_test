package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


//�ȼ�����ƣ�
/*
1.���ֵߵ�
2.����δ�ߵ�
3.���ֵߵ���������
4.����Ϊ��λ��
*/

//�ȼ������������ƣ�
/*
�� �� 	 	  ��������			���ǵȼ���
1		4511��1154��	 	1
2		4511��154��	 	3
3		4511��4511��	 	2
4		1��1��			4
*/


//�޷���Ʊ߽�ֵ����������

class C2_6Test {

	@Test
	void test() 
	{
		//������
		C2_6 c26 = new C2_6();
	    int result = c26.daoxu(4511);
	    //System.out.printf("Enter the number: %d",result);
	    assertEquals(result,1154);
	    
	}
	@Test
	void test2() 
	{
		//������
		C2_6 c26 = new C2_6();
	    int result = c26.daoxu(4511);
	    //System.out.printf("Enter the number: %d",result);
	    assertEquals(result,154);
	    
	}
	@Test
	void test3() 
	{
		//������
		C2_6 c26 = new C2_6();
	    int result = c26.daoxu(4511);
	    //System.out.printf("Enter the number: %d",result);
	    assertEquals(result,4511);
	    
	}
	@Test
	void test4() 
	{
		//������
		C2_6 c26 = new C2_6();
	    int result = c26.daoxu(2);
	    //System.out.printf("Enter the number: %d",result);
	    assertEquals(result,2);
	}


}
