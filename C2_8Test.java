package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//�ȼ�����ƣ�
/*
1.������������Ϊ���Լ�������
2.������������Ϊ���Լ���������������ƥ��
3.������������Ϊ���Լ�������������ȱ��
4.�����������Ϊ����

*/

//�ȼ������������ƣ�
/*
�� �� 	   		��������			���ǵȼ���
1		8{1,2,4,8}				1
2.		8{1,2,4}				3
3.		8{1,2,4,9}				2
4.		-8{-1��-2��-4��-8}			4
*/


//�޷���Ʊ߽�ֵ����������
class C2_8Test {

	@Test
	public void test1() {
		//������
		int[] result = C2_8.factor(8);
		int[] data={1 ,2 ,4 ,8 };
		for(int i=0;i<6;i++)
			
		 System.out.print(result[i]);
		 //System.out.print(data[1]);
		for(int j=0;j<4;j++)
        {
			assertEquals(data[j], result[j]);
        
        }
		 
	}
	
	@Test
	public void test2() {
		//������
		int[] result = C2_8.factor(8);
		int[] data={1 ,2 ,4};
		for(int i=0;i<6;i++)
			
		 System.out.print(result[i]);
		 //System.out.print(data[1]);
		for(int j=0;j<4;j++)
        {
			assertEquals(data[j], result[j]);
        
        }
		 
	}
	
	
	
	@Test
	public void test3() {
		//������
		int[] result = C2_8.factor(8);
		int[] data={1 ,2 ,4 ,9 };
		for(int i=0;i<6;i++)
			
		 System.out.print(result[i]);
		 //System.out.print(data[1]);
		for(int j=0;j<4;j++)
        {
			assertEquals(data[j], result[j]);
        
        }
		
		 
	}
	
	
	
	@Test
	public void test4() {
		//������
		int[] result = C2_8.factor(-8);
		int[] data={-1 ,-2 ,-4,-8};
		for(int i=0;i<6;i++)
			
		 System.out.print(result[i]);
		 //System.out.print(data[1]);
		for(int j=0;j<4;j++)
        {
			assertEquals(data[j], result[j]);
        
        }
		 
	}
	
	

}
