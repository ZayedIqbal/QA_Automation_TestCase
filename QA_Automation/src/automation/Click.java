package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Click {
	public static void main(String[] args) {
	WebDriver driver=Base.getDriver();
	
	driver.get("http://zayediqbal.000webhostapp.com/"); //Navigate
	
	WebElement element = driver.findElement(By.xpath("/html/body/header/div/div[2]/a[1]/button")); //Xpath
	element.click();
}
}
