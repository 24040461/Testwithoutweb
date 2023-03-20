package elementsFactory;

import elementsTest.winiumElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;

public class printElements {
    WindowsDriver driver;

    public winiumElement pref;
    public winiumElement portrait;
    public winiumElement landscape;
    public winiumElement open;
    public winiumElement close;
    public winiumElement orientation;
    public winiumElement general;


    public printElements(WindowsDriver driver){
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        pref = new winiumElement(By.name("Preferences"),driver);
        portrait = new winiumElement(MobileBy.AccessibilityId("1232"),driver);
        landscape = new winiumElement(MobileBy.AccessibilityId("2"),driver);
        open = new winiumElement(By.name("Open"),driver);
        close = new winiumElement(By.name("Close"),driver);
        orientation = new winiumElement(By.name("Orientation: "),driver);
        general = new winiumElement(MobileBy.AccessibilityId("1072"),driver);
    }
}
