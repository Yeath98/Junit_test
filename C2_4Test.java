package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//�ȼ�����ƣ�
/*
1.1ΪMonday
2.2ΪTuesday
3.3ΪWednesday
4.4ΪThursday
5.5ΪFriday
6.6ΪSaturday
7.7ΪSunday
8.�����������뵱ǰ�����ڲ�һ��
9.���������ֲ���1-7��Χ��,������999��

*/

//�ȼ������������ƣ�
/*
�� �� 	   ��������			���ǵȼ���
1		7��7��		7
2		0			9
3		1��7��		8
*/


//�߽�ֵ���ǵȼ����е�9��
class C2_4Test {
	
	//������
	@Test
	void test() {
		//fail("Not yet implemented");
		C2_4 c24 = new C2_4();
	    int result = c24.week(7);
	    assertEquals(result,7);
	}
	
	//������
		@Test
		void test2() {
			//fail("Not yet implemented");
			C2_4 c24 = new C2_4();
		    int result = c24.week(0);
		    assertEquals(result,0);
		}
		
		//������
		@Test
		void test3() {
			//fail("Not yet implemented");
			C2_4 c24 = new C2_4();
		    int result = c24.week(1);
		    assertEquals(result,7);
		}

}
