package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class OldTest {
  @Test
  public void f() {
	  System.out.println("Old Test case executing");
	  Reporter.log("Passed");
  }
}
