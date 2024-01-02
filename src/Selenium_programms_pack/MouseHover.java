package Selenium_programms_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https:testsigma.com");
        driver.manage().window().maximize();
        
        WebElement MainItem = driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[2]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(MainItem).build().perform();
        
        WebElement select = driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[2]/div/div[2]/ul[1]/li[1]/p/a"));
        select.click();
        
        //driver.close();

	}

}
