package junittestingpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddstrings {

	@Test
	public void test() {
	    junitFunction junitString=new junitFunction();
	    String result=junitString.addStrings("deepu","kurivella");
	    assertEquals("deepukurivella",result);
	    
	    
	}

}
