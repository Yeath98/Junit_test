package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//�ȼ�����ƣ�
/*
1.i<10
2.i>10
3.��i�ӵ�10������sum�������
4.��i�ӵ�10������sum���������

*/

//�ȼ������������ƣ�
/*
�� �� 		   ��������				���ǵȼ���
1		i=1 sum=1(56)		1.3
2		i=11 sum=0 (21)	 	2
3		i=1 sum=1(21)		1.4
*/

//�߽�ֵ  i=0 sum=1(56)			1.3
class C2_7Test {

	@Test
	void test() {
		//������
				C2_7 c27 = new C2_7();
			    int result = c27.getsum(1, 1);
			    assertEquals(result,56);
	}
	
	@Test
	void test2() {
		//������
				C2_7 c27 = new C2_7();
			    int result = c27.getsum(11, 0);
			    assertEquals(result,21);
	}
	@Test
	void test3() {
		//������
		C2_7 c27 = new C2_7();
		int result = c27.getsum(1,1);
		 assertEquals(result,21);
		
	}
	@Test
	void test4() {
		//������
		C2_7 c27 = new C2_7();
		int result = c27.getsum(0,1);
		 assertEquals(result,56);
		
	}
}
