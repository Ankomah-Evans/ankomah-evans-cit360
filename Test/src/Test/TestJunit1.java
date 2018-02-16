package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestJunit1 {
   @Test
   public void test() {
      //test data
      int num = 7;
      Object str = null;
	//check for equality
      assertEquals("Hurray!!", str);
      
      //check for false condition
      assertFalse(num > 3);

      //check for not null value
      assertNotNull(str);
   }
}