package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase04 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement ele = driver.findElement(By.name("login"));
		int w = ele.getSize().getWidth();
		int h = ele.getSize().getHeight();
		System.out.println(w);
		System.out.println(h);
		
		
		
		
		
		
		
		
		
		
		
		
}

}
