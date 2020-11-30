package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sendkeys {
	public static void main(String[] args) {
		WebDriver driver=Base.getDriver();
		
		driver.get("http://zayediqbal.000webhostapp.com/");
		
		WebElement element=driver.findElement(By.id("subject"));
		 element.sendKeys("Want to hire you");
		 System.out.println("Successfully send keys");
		 
		
		
		
		
		
	}
}
