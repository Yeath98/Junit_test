package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

//�޷����в����Լ����ֵȼ��࣬û�����룬�޷����ȼ��ࡢ�߽�ֵ
class C2_1Test {
	
	//������
	@Test
	void it_prints_out() {

	    PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));

	    System.out.println("Hello!");
	    assertEquals("Hello!\r\n", out.toString());

	    System.setOut(save_out);
	}
	
	//������
	@Test
	void it_prints_out2() {

	    PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));

	    System.out.println("Welcome to C++!");
	    assertEquals("Welcome to C++!!\r\n", out.toString());

	    System.setOut(save_out);
	}
}
