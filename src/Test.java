import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.UUID;

import java.util.UUID;


public class Test  {

    private static int noOfChars;
    private static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }

    private static String generateData(int noOfChars) {
        Test.noOfChars = noOfChars;

        String coll = "abcdefghijklmnopqrstuvwxyz";
        String str = "";

        for (int i = 0; i < noOfChars; i++) {
            int index = (int) (Math.random() * coll.length());
            str += coll.charAt(index);
        }

        return str;
    }

    public static void main(String[] args) throws InterruptedException {


//    STEPS:

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(6_000);
//            1.  Navigate to http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php

            driver.get("http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php");

//            2. Verify that the title is "Welcome to Duotify!"
        String title = driver.getTitle();
        Assert.assertEquals(title,"Welcome to Duotify!");

//            3. Click on Signup here
        driver.findElement(By.id("hideLogin")).click();

//            4. Fill out the form with the required info

        driver.findElement(By.id("username")).sendKeys(generateData(8));
        driver.findElement(By.id("firstName")).sendKeys(generateData(8));
        driver.findElement(By.id("lastName")).sendKeys(generateData(8));
        WebElement email=driver.findElement(By.id("email"));

       String email1= randomEmail();
        email.sendKeys(email1);
        driver.findElement(By.id("email2")).sendKeys(email1);

//            5. Click on Sign up
        driver.findElement(By.name("registerButton")).click();

//            6. Once logged in to the application, verify that the URL is:
//             http://duotifyapp.us-east-2.elasticbeanstalk.com/browse.php?

                String URL = driver.getCurrentUrl();
                Assert.assertEquals(URL, "http://duotifyapp.us-east-2.elasticbeanstalk.com/browse.php?" );

//            7. In the left navigation bar, verify that your first and last name matches the first and last name that you used when signing up.

        WebElement e=driver.findElement(By.id("nameFirstAndLast"));
        String actual = e.getText();
        String expected="Natella Cash";
        Assert.assertEquals(actual,expected);

//            8. Click on the username on the left navigation bar and verify the username on the main window is correct and then click logout.

        e.click();
        String actual1= driver.findElement(By.xpath ("//div[@class='userInfo']")).getText();
        Assert.assertEquals(actual1,"Natella Cash");

//            9. Verify that you are logged out by verifying the URL is:
//            http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php

        String URL1 = driver.getCurrentUrl();
        Assert.assertEquals(URL1, "http://duotifyapp.us-east-2.elasticbeanstalk.com/register.php" );

//            10. Login using the same username and password when you signed up.
        WebElement el = driver.findElement(By.id("loginUsername"));
        el.sendKeys("agilliadam");
        WebElement el1=driver.findElement(By.id("loginPassword"));
        el1.sendKeys("test1234");
        driver.findElement(By.name("loginButton")).click();

//            11. Verify successful login by verifying that the home page contains the text "You Might Also Like".

        String text=driver.findElement(By.xpath("/html")).getText();

        Assert.assertTrue(text.contains("You Might Also Like"));


//            12. Log out once again and verify that you are logged out.

            driver.findElement(By.id("nameFirstAndLast")).click();
            driver.findElement(By.xpath("//button[@onclick='logout()']")).click();
    }

    }


