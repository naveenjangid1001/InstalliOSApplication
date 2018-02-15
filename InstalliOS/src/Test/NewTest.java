package Test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void first() {
	  Assert.assertEquals("String", "String");
  }
  
  @Test
  public void second() {
	  Assert.assertEquals("String", "int");
  }
  
  @Test
  public void third() {
	  throw new SkipException("Test case skipped");
  }
}
