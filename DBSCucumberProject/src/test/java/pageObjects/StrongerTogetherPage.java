package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StrongerTogetherPage {
	public WebDriver driver;

	public StrongerTogetherPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By singapore = By.linkText("Singapore");
	By about = By.linkText("About");
	
	public WebElement Singapore() {
		return driver.findElement(singapore);
	}
	
	public WebElement About() {
		return driver.findElement(about);
	}
}