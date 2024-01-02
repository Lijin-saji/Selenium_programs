package Selenium_programms_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        
        //Absolute xpath example
        
        WebElement close = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
        close.click();
        //WebElement close = driver.findElement(By.xpath("//*[@class='_30XB9F']"));
        //close.click();
        
        //OR option
        //WebElement close = driver.findElement(By.xpath("//*[@class='_30XB9F' or @role='button']"));
        //close.click();
        
        //AND option
        //WebElement close = driver.findElement(By.xpath("//*[@class='_30XB9F' and @role='button']"));
        //close.click();
        
        //contains option
        //WebElement close = driver.findElement(By.xpath("//*[contains(@class,'_30XB9F')]"));
        //close.click();
        
        //Starts with
        //WebElement close = driver.findElement(By.xpath("//*[starts-with(@class,'_30XB9F')]"));
        //close.click();
        
        //text
        //WebElement select = driver.findElement(By.xpath("//span[text()='Mobiles']"));
        //select.click();
        
        //chained
        
        
        
        
        
        //WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
        //search.sendKeys("Watches for women");       
        WebElement search = driver.findElement(By.xpath("//*[@class='Pke_EE'] //form[@class='_2rslOn header-form-search']"));
        search.sendKeys("Watches for women");
        
        //OR option
        //WebElement search = driver.findElement(By.xpath("//*[@class='Pke_EE' or @name='q']"));
        //search.sendKeys("Watches for women");
        
        //AND option
        //WebElement search = driver.findElement(By.xpath("//*[@class='Pke_EE' and @name='q']"));
        //search.sendKeys("Watches for women");
        
        //contains option
        //WebElement search = driver.findElement(By.xpath("//*[contains(@placeholder,'Search for Products, Brands and More')]"));
        //search.sendKeys("Watches for women");
        
        //starts with
        //WebElement search = driver.findElement(By.xpath("//*[starts-with(@placeholder,'Search')]"));
        //search.sendKeys("Watches for women");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //WebElement searchbtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/button"));
        //searchbtn.click();    
        //WebElement searchbtn = driver.findElement(By.xpath("//*[@type='submit']"));
        //searchbtn.click(); 
        
        
        
        //driver.navigate().back();
        
        
        
        //WebElement search2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
        //search2.sendKeys("Watches for men");
        
        //WebElement searchbutton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/button"));
        //searchbutton.click();
       
        //WebElement select = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]"));
        //select.click();
        
        //WebElement addtocart = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button/svg/path"));
        //addtocart.click();
        
        //driver.close();
     
     
	}

}
