import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

class Checboxes {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);

//        WebElement checkbox = driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
//
//        if(!checkbox.isSelected()){
//            checkbox.click();
//        }

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement checkbox : checkboxes) {

            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }

        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();

        Assert.assertTrue(driver.getPageSource().contains("List of orders is empty"));

        WebDriver driver1 = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
