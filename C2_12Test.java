package Dengjialei;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



//�ȼ�����ƣ�
/*
1�����Lin Linѧ�ţ��������Ա�����
2�������ͬѧ��ΪLin Lin

*/

//�ȼ������������ƣ�
/*
�� �� 		   	��������			���ǵȼ���
1		 Lin Lin F 19			1
2		 Lin	 F 19			2
*/

//�޷����Ա߽�ֵ�����������Ҳ�ȷ��




public class C2_12Test {

	@Before
	public void setUp() throws Exception 
	{
	}

	
	//������
	@Test
	public void test1() {
		
		Object [] array=new Object[4];
		
		array =  C2_12.student();		
        assertEquals(97001, array[0]);
        assertEquals("Lin Lin", array[1]);
        System.out.println(array[2]);
        assertEquals('F', array[2]);
        assertEquals(19, array[3]);
     
       
	}
	
	
	//������
	@Test
	public void test2() {	
		
		Object [] array=new Object[4];
		
		array =  C2_12.student();
        assertEquals(97001, array[0]);
        assertEquals("Lin", array[1]);
        System.out.println(array[2]);
        assertEquals('F', array[2]);
        assertEquals(19, array[3]);
     
       
	}

}
