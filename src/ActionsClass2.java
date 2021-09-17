import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClass2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/akmal/Documents/drivers/chromedriver");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        driver.get("https://www.google.com/");


        Actions actions = new Actions(driver);
        WebElement gbqfbb = driver.findElement(By.id("gbqfbb"));

        actions.moveToElement(gbqfbb).build().perform();


        driver.get("https://unsplash.com/s/photos/free");


        WebElement element = driver.findElement(By.xpath("//a[@href='https://unsplash.com/photos/odxB5oIG_iA/download?force=true']"));

        new Actions(driver).moveToElement(element).click().build().perform();


        driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");

        WebElement box = driver.findElement(By.id("box"));


        actions.doubleClick(box).build().perform();


    }
}
