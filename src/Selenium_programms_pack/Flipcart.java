package Selenium_programms_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.flipkart.com/jainx-jw8516-blue-dial-steel-chain-analog-watch-women/p/itmccf7f15cae2de?pid=WATGGTFY7MTNAQX3&lid=LSTWATGGTFY7MTNAQX39GEEHD&marketplace=FLIPKART&q=Watches+for+women&store=r18%2Ff13&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=en_PnzDQOQJhGT-etEMvpbfr9Ea-83ZuidiLQ4S5kKJ9C669mA0pIa2o0r8MIzxK9MsSu3dulvZxORTrwEkO0jYZA%3D%3D&ppt=sp&ppn=sp&ssid=arvzd70qw00000001700482817540&qH=38b377295f2a1eeb");
        driver.manage().window().maximize();
        
        WebElement addtocart = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button/svg/path"));
        addtocart.click();
	}

}
