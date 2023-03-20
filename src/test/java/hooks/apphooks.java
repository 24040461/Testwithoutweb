package hooks;

import driverFactory.driverFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.net.MalformedURLException;


public class apphooks extends driverFactory {
    WindowsDriver driver;
    @Before
    public void launchNotePad() throws MalformedURLException, InterruptedException {
        driver = setUp();
    }
    @After
    public void cleanUp() throws InterruptedException {
        driver.quit();
    }
    @After(order = 1)
    public void screenshot(Scenario scenario) {
        if(scenario.isFailed()){
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }
    @AfterAll
    public static void end() throws IOException {
        Runtime.getRuntime().exec("cmd /c taskkill /F /IM WinAppDriver.exe");
        Runtime.getRuntime().exec("cmd /c taskkill /F /IM Notepad.exe");

    }
}
