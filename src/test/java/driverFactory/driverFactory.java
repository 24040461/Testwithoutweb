package driverFactory;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class driverFactory {

public static WindowsDriver driver;
	public WindowsDriver setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app", "C:\\Windows\\System32\\Notepad.exe");
		cap.setCapability("platformName", "Windows");
		cap.setCapability("deviceName", "WINDOWS-III82PF");

		driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);

		return driver;
	}
	public static synchronized WindowsDriver getdriver() {
		return driver;
	}
}
