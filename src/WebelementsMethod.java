import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ElementMethods {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");

//

        WebDriver driver = new ChromeDriver(); // Polymorphism



        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fProcess.aspx");

        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        Thread.sleep(1000);


        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getLocation());

        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getSize());

        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getTagName());


        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("color"));
        System.out.println(driver.findElement(By.id("ctl00_MainContent_status")).getCssValue("font-family"));

        System.out.println(driver.findElement(By.xpath("//div[@class='login']")).getText());

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        System.out.println(driver.findElement(By.id("ctl00_MainContent_username")).getAttribute("value"));



        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");

        System.out.println(driver.findElement(By.id("quantity_wanted")).getAttribute("value"));





    }
}
