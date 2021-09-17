import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionsClass3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/akmal/Documents/drivers/chromedriver");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        Actions actions  = new Actions(driver);


        driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");

        Thread.sleep(1000);
        WebElement box = driver.findElement(By.id("box"));


        actions.doubleClick(box).build().perform();


    }
}
