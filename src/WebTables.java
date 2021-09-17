import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTables {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");


        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);


        driver.findElement(By.linkText("View all products")).click();

        System.out.println(driver.findElement(By.xpath("//table[@class='ProductsTable']//tr[2]//td[1]")).getText());


        // Verify the column names
        //Extract the row values

        List<String> columns = Arrays.asList("Product name", "Price", "Discount");

        List<WebElement> headers = driver.findElements(By.xpath("//table[@class='ProductsTable']//tr[1]//th"));

        List<String> actual = new ArrayList<>();
        for (WebElement option : headers) {

            actual.add(option.getText());
        }


        Assert.assertEquals(actual, columns, "The assertion failed. The actual list is: " + actual );

        //Extract the column values

        List<String> products = Arrays.asList("MyMoney", "FamilyAlbum", "ScreenSaver");

        List<WebElement> column1 = driver.findElements(By.xpath("//table[@class='ProductsTable']//tr//td[1]"));

        List<String> actualProducts = new ArrayList<>();
        for (WebElement option : column1) {

            actualProducts.add(option.getText());
        }
        System.out.println(actualProducts);
        Assert.assertEquals(actualProducts, products);

    }
}