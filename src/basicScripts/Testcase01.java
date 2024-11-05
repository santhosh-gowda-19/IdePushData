package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase01 
{
	public static void main(String[] args) throws Exception 
	{
//		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		String src = driver.getPageSource();
		System.out.println(src);
		Thread.sleep(1000);
		driver.quit();
	}

	

}
