package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//�ȼ�����ƣ�
/*
1.��������������������������һ��
2.����������������������������һ��

*/

//�ȼ������������ƣ�
/*
�� �� 	 	  	��������				���ǵȼ���
1		 {1��2��3��0};{3,0}			1
2		 {1,2,-3,0}{2,1}		1
3		 {-1,-2,-3,0}{0,3}		1
4		 {-1,-2,-3,0}{1,3}		2
	
*/

//�޷����Ա߽�ֵ����������


class C2_10Test {
	//������
	@Test
	public void test() {
		
		int i=0;
		int[] data={1,2,3,0};
		int[] data2={3,0};
		
		int[] result1 = C2_10.Geshu(data);		
		 System.out.println(result1[i]);
        assertEquals(data2[0], result1[0]);
        assertEquals(data2[1], result1[1]);
       
		
	}
	
	//������
	@Test
	public void test2() {
		
		int i=0;
		int[] data1={1,2,-3,0};
		int[] data2={2,1};
		
		int[] result1 = C2_10.Geshu(data1);		
		 System.out.println(result1[1]);
        assertEquals(data2[0], result1[0]);
        assertEquals(data2[1], result1[1]);
       
		
	}
	
	//������
		@Test
		public void test3() {
			
			int i=0;
			int[] data1={-1,-2,-3,0};
			int[] data2={0,3};
			
			int[] result1 = C2_10.Geshu(data1);		
			 System.out.println(result1[1]);
	        assertEquals(data2[0], result1[0]);
	        assertEquals(data2[1], result1[1]);
	       
			
		}
		
		//������
				@Test
				public void test4() {
					
					int i=0;
					int[] data1={-1,-2,-3,0};
					int[] data2={1,3};
					
					int[] result1 = C2_10.Geshu(data1);		
					 System.out.println(result1[1]);
			        assertEquals(data2[0], result1[0]);
			        assertEquals(data2[1], result1[1]);
			       
					
				}

}
