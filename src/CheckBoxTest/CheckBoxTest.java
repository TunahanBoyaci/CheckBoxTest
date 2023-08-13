package CheckBoxTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utilities.BaseDriver.driver;
import static Utilities.BaseDriver.waitAndQuit;

public class CheckBoxTest {
    @Test
    public void test1(){
        driver.get("https://chercher.tech/practice/frames");

        // First frame
        WebElement iFrame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iFrame1);

        // Inner frame inside first frame
        WebElement iFrame3 = driver.findElement(By.id("frame3"));
        driver.switchTo().frame(iFrame3);

        WebElement checkBox = driver.findElement(By.cssSelector("input[id='a']"));
        checkBox.click();

        driver.navigate().to("https://chercher.tech/practice/frames");
        waitAndQuit();

    }
}
