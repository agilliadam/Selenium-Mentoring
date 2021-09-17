import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FileUpload {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/akmal/Documents/drivers/chromedriver");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        driver.get("https://the-internet.herokuapp.com/upload");

        System.out.println(System.getProperty("user.dir"));

        String path = System.getProperty("user.dir") +"/screenshot.png";

        driver.findElement(By.id("file-upload")).sendKeys(path);


        driver.findElement(By.id("file-submit")).click();


//        driver.get("https://easyupload.io/");
//        driver.findElement(By.xpath("//button[@class='dz-button']")).click();

        driver.get("https://unsplash.com/s/photos/free");

        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement element = driver.findElement(By.xpath("//a[@href='https://unsplash.com/photos/odxB5oIG_iA/download?force=true']"));

        js.executeScript("arguments[0].click();", element);



    }
}
