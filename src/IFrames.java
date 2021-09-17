import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

class Iframes {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exer");



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


        driver.findElement(By.xpath("//div[.='Directions']")).click();


        System.out.println(driver.findElement(By.xpath("//span[.='DELAYS']")).getText());
    }


}
