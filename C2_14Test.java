package Dengjialei;

import static org.junit.Assert.*;

import org.junit.Test;


//�ȼ�����ƣ�
/*
1.����ķɻ�����������������ը��������ԭ��������һ��
2.����ķɻ�����������������ը��������ԭ�����䲻һ��

*/

//�ȼ������������ƣ�
/*
�� �� 	 	  ��������																					���ǵȼ���
1		The fighter carries 4 pallets."+"The bomber bomb load is 14000.0					1
2		The fighter carries 5 pallets."+"The bomber bomb load is 14000.0					2
*/

//�޷����б߽�ֵ���ԣ����ֻ�������û����������




public class C2_14Test {

	//������
	@Test
	public void test1() {
		
		String result =C2_14.Aircraft();
        assertEquals("The fighter carries 4 pallets."+"The bomber bomb load is 14000.0", result);
	}
	
	//������
	@Test
	public void test2() {
		
		String result =C2_14.Aircraft();
        assertEquals("The fighter carries 5 pallets."+"The bomber bomb load is 14000.0", result);
	}

}
