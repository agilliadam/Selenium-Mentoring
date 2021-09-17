import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClass6 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/akmal/Documents/drivers/chromedriver");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        Actions actions  = new Actions(driver);


        driver.get("https://javascript.info/mouse-drag-and-drop");









        driver.switchTo().frame(driver.
                findElement(By.xpath("//iframe[@src='https://en.js.cx/article/mouse-drag-and-drop/ball3/']")));

        WebElement source1 = driver.findElement(By.id("ball"));

//        actions.dragAndDropBy(source1, 100, 100).build().perform();

        actions.clickAndHold(source1).moveByOffset(100, 100).
                moveByOffset(100, -100).
                moveByOffset(100, 100).
                moveByOffset(100, -100).
                moveByOffset(100, 100).
                release(source1).
                build().perform();


    }
}
