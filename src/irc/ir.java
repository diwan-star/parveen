
package irc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ir {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.irctc.co.in/");
		WebElement obj=driver.findElement(By.xpath("//input[@autocomplete='off'][5]"));
		obj.sendKeys("parveen");
<<<<<<< HEAD
		//updated at 2.50 am
=======
		//updated at 2 am

>>>>>>> b707d993bf49a00b230e23e279b16cf162d55488
		
	
		
		
		

	}

}

