package Selenium_programms_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        
        driver.switchTo().frame(0);
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));
        
        Actions ac = new Actions(driver);
        ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
        

	}

}
