package Test;
import java.io.IOException;

import org.testng.annotations.Test;

public class LauncherClassTest {

  @Test
  public void main() throws IOException {
		Runtime.getRuntime().exec("xcrun simctl install booted /Users/newuser/Downloads/fazolis.app");
		System.out.println("Application Installed.");
  }
}
