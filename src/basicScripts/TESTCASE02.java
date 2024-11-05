package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTCASE02 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/QSPR/Desktop/Weekend/locators.html");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.id("usn"));
		usn.sendKeys("admin");
		Thread.sleep(2000);
		WebElement psw = driver.findElement(By.name("psw"));
		psw.sendKeys("admin@123");
		Thread.sleep(2000);
		WebElement radiobtn = driver.findElement(By.className("radiobutton"));
		radiobtn.click();
		Thread.sleep(2000);
		WebElement box = driver.findElement(By.id("cb"));
		box.click();
		WebElement link = driver.findElement(By.linkText("Flipkart 2024"));
		link.click();
		Thread.sleep(3000);
		driver.quit();
	}

}






