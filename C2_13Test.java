package Dengjialei;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

//�ȼ�����ƣ�
/*
1.�����dog1��dog2��chicken��ԭ��������һ��
2.�����dog1��dog2��chicken��ԭ�����䲻һ��

*/

//�ȼ������������ƣ�
/*
�� �� 	 	  ��������																					���ǵȼ���
1		The weight of dog1 is 15The weight of dog2 is 37The weight of chicken is 3					1
2		The weight of dog1 is 15The weight of dog2 is 37The weight of chicken is 3					2
*/

//�޷����б߽�ֵ���ԣ����ֻ�������û����������



public class C2_13Test {

	
	//������
	@Test
	public void test() {
		//fail("��δʵ��");
		String result =C2_13.dog();
        assertEquals("The weight of dog1 is 15The weight of dog2 is 37The weight of chicken is 3", result);
	}
	
	
	//������
	@Test
	public void test2() {
		//fail("��δʵ��");
		String result =C2_13.dog();
        assertEquals("The weight of dog1 is 15The weight of dog2 is 37The weight of chicken is 3", result);
	}

}
