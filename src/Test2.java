import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String[] args) throws InterruptedException {

//        CREATE A WEB ORDER
//        1. Launch Chrome browser.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        2. Navigate to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

//        3. Login using username Tester and password test
        Actions actions = new Actions(driver);
        WebElement element1=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        element1.sendKeys("Tester");
        WebElement element2=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        element2.sendKeys("test");
        element2.click();
        WebElement element3 = driver.findElement(By.xpath("//input[@type='submit']"));
        element3.click();
        Thread.sleep(6000);
//        4. Click on Order link
        WebElement element4 = driver.findElement(By.xpath("//ul[@id='ct100_menu']//a[@href='Process.aspx'])"));
        element4.click();

//        5. Enter a random product quantity between 1 and 100
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")).sendKeys("88");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

//        6. Click on Calculate and verify that the Total value is correct.
//                Price per unit is 100.  The discount of 8 % is applied to quantities of 10+.
//        So for example, if the quantity is 8, the Total should be 800.
//        If the quantity is 20, the Total should be 1840.
//        If the quantity is 77, the Total should be 7084. And so on.
//        6. Generate and enter random first name and last name.
//        7. Generate and Enter random street address
//        8. Generate and Enter random city
//        9. Generate and Enter random state
//        10. Generate and Enter a random 5 digit zip code
//        EXTRA: As an extra challenge, for steps 6-10 download 1000 row of corresponding realistic data from mockaroo.com in a csv format and load it to your program and use the random set of data from there each time.
//        11. Select the card type randomly. On each run your script should select a random type.
//        12. Generate and enter the random card number:
//        If Visa is selected, the card number should start with 4.
//        If MasterCard is selected, card number should start with 5.
//        If American Express is selected, card number should start with 3.
//        Card numbers should be 16 digits for Visa and MasterCard, 15 for American Express.
//        13. Enter a valid expiration date (newer than the current date)
//        14. Click on Process
//        15. Verify that “New order has been successfully added” message appeared on the page.
//        16. Click on View All Orders link.
//        17. The placed order details appears on the first row of the orders table. Verify that the entire information contained on the row (Name, Product, Quantity, etc) matches the previously entered information in previous steps.
//        18. Log out of the application.
    }}