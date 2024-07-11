package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SikuliWindow {
	Screen se = new Screen();
	
  @Test
  public void start() throws FindFailed, Exception {
	  Thread.sleep(2000);
	  se.click("C:\\Users\\licious.DESKTOP-SSHCSEN\\OneDrive\\Text Book\\screenshot\\win.png");
  }
}
