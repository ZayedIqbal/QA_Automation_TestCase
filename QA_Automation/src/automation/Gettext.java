package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gettext {

	public static void main(String[] args) {
        WebDriver driver=Base.getDriver();
		
		driver.get("http://zayediqbal.000webhostapp.com/");
		
		WebElement element=driver.findElement(By.className("btn"));
		
		String s1=element.getText();
		System.out.println(s1);

	}

}
