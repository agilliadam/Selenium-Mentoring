import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdowns {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        driver.get("https://www.cars.com/");

        System.out.println(new Select(driver.findElement(By.id("make-model-maximum-distance"))).getFirstSelectedOption().getText());
        WebElement element = driver.findElement(By.id("make-model-search-stocktype"));
        Select select = new Select(element);
        select.selectByVisibleText("Used cars");
        //  select.deselectByVisibleText("Used cars");

        new Select(driver.findElement(By.id("make-model-max-price"))).selectByValue("6000");

        new Select(driver.findElement(By.id("make-model-maximum-distance"))).selectByIndex(0); // zero based


        // Verify the dropdown options

        List<String> expected = Arrays.asList("New & used cars", "New & certified cars", "New cars", "Used cars", "Certified cars");


        List<WebElement> options = new Select(driver.findElement(By.id("make-model-search-stocktype"))).getOptions();

        List<String> actual = new ArrayList<>();
        for (WebElement option : options) {

            actual.add(option.getText());
        }

        Assert.assertEquals(actual, expected);


    }
}
