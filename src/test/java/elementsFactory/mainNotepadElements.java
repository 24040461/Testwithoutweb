package elementsFactory;

import elementsTest.winiumElement;
import io.appium.java_client.MobileBy;
import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.By;

public class mainNotepadElements {
    WindowsDriver driver;

    public winiumElement save;
    public winiumElement file;
    public winiumElement print;
    public winiumElement title;
    public winiumElement edit;
    public winiumElement format;
    public winiumElement view;
    public winiumElement help;
    public winiumElement exit;


    public mainNotepadElements(WindowsDriver driver){
        this.driver = driver;
        WiniumElement();
    }

    private void WiniumElement() {
        save = new winiumElement(MobileBy.AccessibilityId("3"),driver);
        file = new winiumElement(By.name("File"),driver);
        edit = new winiumElement(By.name("Edit"),driver);
        format = new winiumElement(By.name("Format"),driver);
        view = new winiumElement(By.name("View"),driver);
        help = new winiumElement(By.name("Help"),driver);
        print = new winiumElement(MobileBy.AccessibilityId("6"),driver);
        title = new winiumElement(MobileBy.AccessibilityId("15"),driver);
        exit = new winiumElement(MobileBy.AccessibilityId("7"),driver);
    }
}
