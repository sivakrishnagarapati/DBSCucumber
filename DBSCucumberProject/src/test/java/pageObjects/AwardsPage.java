package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AwardsPage {
	public WebDriver driver;

	public AwardsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By awardtitle = By.tagName("strong");
	
	public WebElement awardTitle() {
		return driver.findElement(awardtitle);
	}
}
