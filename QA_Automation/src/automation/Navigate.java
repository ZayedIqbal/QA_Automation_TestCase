package automation;

import org.openqa.selenium.WebDriver;

public class Navigate {

	public static void main(String[] args) {
		WebDriver driver=Base.getDriver();
		
		driver.get("http://zayediqbal.000webhostapp.com/");
		
		System.out.println("Successfully Navigate to the website");

	}

}
