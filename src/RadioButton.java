import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

class RadioButtons {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);

        driver.findElement(By.xpath("//a[.='Order']")).click();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio']"));

        for (WebElement radioButton : radioButtons) {

            if(radioButton.getAttribute("value").equals("MasterCard") && !radioButton.isSelected()){
                radioButton.click();
            }
        }

    }

}
