import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingElements {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");

//        System.setProperty("webdriver.gecko.driver", "/Users/akmal/Documents/drivers/geckodriver"); // Firefox

        // For windows, the driver will have an .exe extension ->"C:\\Users\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Polymorphism

        //   ChromeDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver(); //Firefox

        driver.get("https://www.google.com/");

        WebElement inputBox = driver.findElement(By.name("q"));

        WebElement element = driver.findElement(By.xpath("//input"));

        //  findElement() throws NoSuchElementException if the element is not found
        //NoSuchElementException: no such element: Unable to locate element:


        //  findElements() returns an empty list if the element is not found

        List<WebElement> elements = driver.findElements(By.xpath("//inpu"));
        System.out.println(elements.size());

        for (WebElement webElement : elements) {
            System.out.println(webElement.getAttribute("type"));
        }


        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
        }


        WebElement searchLink = driver.findElement(By.partialLinkText("Search"));



        // Xpath -> XML Query Language

    }
}
