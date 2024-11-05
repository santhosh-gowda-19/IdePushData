package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase9 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSPR/Desktop/Weekend/Dropdown.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='Celebrities']"));
		Select s = new Select(dropdown);
		List<WebElement> opts = s.getOptions();	
		ArrayList<String> l = new ArrayList<>();				
		int count = opts.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			WebElement opt = opts.get(i);
			String txt = opt.getText();
			l.add(txt);
		}
		Collections.sort(l,Collections.reverseOrder());
		for(String j:l)
		{
			System.out.println(j);
		}
		
		
		
			
			
			
			
			
			
			
			
			
			
			
		
		Thread.sleep(1000);
		driver.quit();		
		
	}

}
