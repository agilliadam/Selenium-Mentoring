import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alerts {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        //UnhandledAlertException: unexpected alert open: {Alert text : I am a JS Alert}
        // When you try to do something else without handling the alert first
        Alert alert = driver.switchTo().alert();

        alert.accept();


        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();


        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().dismiss();

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();


        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();



        driver.switchTo().alert().accept();
        //  NoAlertPresentException: no such alert
        // When there is no alert on the page and you try to switch to it


        // driver.findElement(By.xpath("//a[.='Elemental Selenium']")).click();
    }
}
