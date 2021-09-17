import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandlingWindows {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        driver.get("file:///Users/akmal/Desktop/demo.html");

        //   driver.switchTo().frame(0);

//        driver.switchTo().frame("blabla");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='https://www.audiusa.com/us/web/en.html']"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.xpath("//span[.='Menu']")).click();

        driver.switchTo().defaultContent();



        System.out.println(driver.findElement(By.xpath("//p[contains(text(), 'This is')]")).getText());


        driver.switchTo().frame("google");

        String parentWindow = driver.getWindowHandle(); // gets the current window's window handle

        System.out.println(parentWindow);

        driver.findElement(By.xpath("//div[.='Directions']")).click();


        Set <String> windowHandles = driver.getWindowHandles(); // gets the all currently open windows' window handles

        for (String windowHandle : windowHandles) {
            if(!windowHandle.equals(parentWindow)){
                driver.switchTo().window(windowHandle);
            }
        }

        //



        System.out.println(driver.findElement(By.xpath("//span[.='DELAYS']")).getText());

        driver.findElement(By.xpath("//a[@title='Google apps']")).click();
        Thread.sleep(1000);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@role='presentation']")));

        driver.findElement(By.xpath("//span[.='Search']")).click();

        windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if(driver.getTitle().equals("Google")) {
                break;
            }
        }

        driver.findElement(By.name("q")).sendKeys("Third Window" + Keys.ENTER);

    }
}
