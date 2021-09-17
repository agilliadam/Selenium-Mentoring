import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathDemo {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");

            WebDriver driver = new ChromeDriver(); // Polymorphism

            driver.get("https://www.google.com/");

            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hello");

            WebElement element = driver.findElement(By.xpath("//input")); // very first match
            List<WebElement> elements = driver.findElements(By.xpath("//input")); // returns all 9 input elements
            List<WebElement> elements1 = driver.findElements(By.xpath("//@id")); //returns all the elements that has id attribute

            // Find elements using attributes

            String xpath = "//input[@class='gLFyf gsfi'][@data-ved='0ahUKEwju8abg3PTxAhVnKVkFHWX5ANwQ39UDCAY'][@maxlength='2048']";

            driver.findElement(By.xpath(xpath)).sendKeys("Hello");

            //exact text match

            driver.findElement(By.xpath("//a[.='Store']"));

            // partial text match

            driver.findElement(By.xpath("//a[contains(text(), 'Search works')]"));

            // locate a non-unique parent by its unique child

            driver.findElement(By.xpath("//a[.='Advertising']//parent::div "));

            // locate a non-unique element by its sibling

            //a[.='Business']//preceding-sibling::a

            // Dynamic attributes
            // We need to find the static part and use the corresponding method

            //input[starts-with(@name, 'name')]

            // Using predicate

            //div[starts-with(@id,'_')])[1]

        }
    }





