package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase03 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.cssSelector("input[placeholder='Enter your name']"));
		usn.sendKeys("admin");
		WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("admin@gmail.com");
		WebElement psw = driver.findElement(By.cssSelector("input[name='password']"));
		psw.sendKeys("snbsvn");
			WebElement btn = driver.findElement(By.cssSelector("button[type='submit']"));
			
		
		
		
		
		
		
		
		
	}

}
