package elementsTest;

import io.appium.java_client.windows.WindowsDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class winiumElement {
    private By Locator;
    WindowsDriver Driver;

    public winiumElement(By locator, WindowsDriver driver){
        Locator = locator;
        Driver = driver;
    }
    public void click(){
        WebDriverWait wait = new WebDriverWait(Driver, (20));
        wait.until(ExpectedConditions.elementToBeClickable(this.Locator));
        Driver.findElement(this.Locator).click();
    }
    public void isDisplayed(){
        WebDriverWait wait = new WebDriverWait(Driver, (20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Locator));
        Driver.findElement(this.Locator).isDisplayed();
    }
    public void type(String text){
        WebDriverWait wait = new WebDriverWait(Driver, (20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.Locator));
        Driver.findElement(this.Locator).sendKeys(text);
    }
    public void downArrow(){
        Driver.findElement(this.Locator).sendKeys(Keys.DOWN);
    }
    public void wordCompare(String wordCompare){
        Assert.assertEquals(wordCompare, Driver.findElement(this.Locator).getText());
    }
    public void enter(){
        Driver.findElement(this.Locator).sendKeys(Keys.ENTER);
    }
}
