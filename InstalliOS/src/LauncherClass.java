import java.io.IOException;

public class LauncherClass {

	public static void main(String args[]) throws IOException {
		Runtime.getRuntime().exec("xcrun simctl install booted /Users/newuser/Downloads/fazolis.app");
	}
}
