package Selenium_programms_pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        
        WebElement customerid = driver.findElement(By.name("cusid"));
        customerid.sendKeys("1234");
        
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        
        Alert alertbox = driver.switchTo().alert();
        //driver.switchTo().alert().accept();
        
        //driver.switchTo().alert().dismiss();
        
        String alertmsg = driver.switchTo().alert().getText();
        System.out.println(alertmsg);
        driver.quit();
	}

}
