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

public class WebTablesDynamic {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\agill\\Downloads\\chromedriver_win32\\chromedriver.exe");



        WebDriver driver = new ChromeDriver(); // Polymorphism
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Implicit wait is normally set once per driver, and it is applicable to all findElement/s methods
        //


        driver.get("http://demo.guru99.com/test/web-table-element.php");

        int noOfRows = driver.findElements(By.xpath("//table//tbody//tr")).size();
        int noOfCols = driver.findElements(By.xpath("//table//tbody//tr[1]//td")).size();


//     OUTER:   for (int i = 1; i <= noOfRows; i++) {
//
//
//            for (int j = 1; j <= noOfCols; j++) {
//                // dynamic xpath
//                String xpath = "//table//tbody//tr[" + i + "]//td[" + j+ "]";
//
//
//                if(driver.findElement(By.xpath(xpath)).getText().equals("Quess Corp")){
//                    System.out.println("Sun Pharma is at position "  + i);
//                    break OUTER;
//                }
//
//            }
//
//            System.out.println();
//
//        }

        double max = 0;
        for (int i = 1; i <= noOfRows; i++) {

            String xpath = "//table//tbody//tr[" + i + "]//td[3]";

            String str = driver.findElement(By.xpath(xpath)).getText();
            double num = Double.parseDouble(str);

            if(num>max){
                max = num;
            }

        }


        System.out.println("The max value is: "+ max);





    }
}
