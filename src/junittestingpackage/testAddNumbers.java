package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		junitFunction junit=new junitFunction();
		int result=junit.addnumbers(100,200);
		assertEquals(300,result);
	}

}
