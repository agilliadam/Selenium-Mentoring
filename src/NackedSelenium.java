import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NackedSelenium {public static void main(String[] args)
{

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");

//        System.setProperty("webdriver.gecko.driver", "/Users/akmal/Documents/drivers/geckodriver"); // Firefox

    // For windows, the driver will have an .exe extension ->"C:\\Users\\drivers\\chromedriver.exe");

    WebDriver driver = new ChromeDriver(); // Polymorphism

    //   ChromeDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver(); //Firefox

    driver.get("https://www.selenium.dev/");

    String pageSource = driver.getPageSource();

    System.out.println(pageSource);

//        if(pageSource.contains("BLACK LIVES MATTER")){
//            System.out.println("PASS");
//        }else{
//            System.out.println("FAIL");
//        }

    Assert.assertTrue(pageSource.contains("BLACK LIVES matter"));

}

}
