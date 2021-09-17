import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

    public class ActionsClass {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/akmal/Documents/drivers/chromedriver");



            WebDriver driver = new ChromeDriver(); // Polymorphism
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
            //


            driver.get("https://www.google.com/");


            Actions actions = new Actions(driver);

            WebElement q = driver.findElement(By.name("q"));



            actions.keyDown(Keys.LEFT_SHIFT).
                    sendKeys(q, "hello" + Keys.ENTER).keyUp(Keys.LEFT_SHIFT).build().perform();


            //StaleElementReferenceException -> this exception happens when the reference to the element that you located
            // previously became stale/old and to fix it you will need to get the fresh reference (re-locate and store it again)


            q = driver.findElement(By.name("q"));
            actions.sendKeys(q," adele").build().perform();



            driver.get("https://www.google.com/");
            WebElement gbqfbb = driver.findElement(By.id("gbqfbb"));

            actions.moveToElement(gbqfbb).build().perform();


        }
    }

