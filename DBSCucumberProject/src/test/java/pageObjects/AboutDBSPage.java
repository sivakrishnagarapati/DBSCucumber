package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutDBSPage {
	public WebDriver driver;

	public AboutDBSPage(WebDriver driver) {
		this.driver = driver;
	}

	By whoweare = By.linkText("Who We Are");
	By ourawards = By.linkText("Our Awards & Accolades");

	public WebElement whoWeAre() {
		return driver.findElement(whoweare);
	}

	public WebElement ourAwards() {
		return driver.findElement(ourawards);
	}
}
