package Dengjialei;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

//无法进行测试以及划分等价类，没有输入，无法做等价类、边界值
class C2_1Test {
	
	//正样本
	@Test
	void it_prints_out() {

	    PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));

	    System.out.println("Hello!");
	    assertEquals("Hello!\r\n", out.toString());

	    System.setOut(save_out);
	}
	
	//负样本
	@Test
	void it_prints_out2() {

	    PrintStream save_out=System.out;final ByteArrayOutputStream out = new ByteArrayOutputStream();System.setOut(new PrintStream(out));

	    System.out.println("Welcome to C++!");
	    assertEquals("Welcome to C++!!\r\n", out.toString());

	    System.setOut(save_out);
	}
}
