package elementsFactory;

import elementsTest.winiumElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;

public class saveElements {
    WindowsDriver driver;

    public winiumElement saveBtn;
    public winiumElement cancelBtn;
    public winiumElement saveLabelExp;

    public saveElements(WindowsDriver driver){
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        saveBtn = new winiumElement(By.name("Save"),driver);
        cancelBtn = new winiumElement(By.name("Cancel"),driver);
        saveLabelExp = new winiumElement(MobileBy.AccessibilityId("1001"),driver);
    }
}
