import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {


        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");

            WebDriver driver = new ChromeDriver(); // Polymorphism

            driver.get("https://www.google.com/");

            //     /html/body/div  -> absolute xpath
            //     html>body>div  -> absolute css path
            driver.findElement(By.cssSelector("html>body>div"));

//        . -> class
//        # -> id

            // input element with a class gLFyf

            //   input.gLFyf

            // input element with a class gLFyf and gsfi

            //input.gLFyf.gsfi

            //div with id gb

            //   div#gb

            driver.findElement(By.xpath("input[name='q']")).sendKeys("Hello");

        }
    }
