package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AwardsPage {
	public WebDriver driver;

	public AwardsPage(WebDriver driver) {
		this.driver = driver;
	}

	By awardtitle = By.xpath("//div[@class='col-md-8']/h3");
	By awardcaption = By.xpath("//div[@class='col-md-8']/p");

	public int awardTitle() {

		return driver.findElements(awardtitle).size();
	}

	public List<WebElement> awardTitleName() {

		List<WebElement> awardnames = driver.findElements(awardtitle);
		return awardnames;
	}

	public List<WebElement> awardCaption() {

		List<WebElement> awardcaptions = driver.findElements(awardcaption);
		return awardcaptions;
	}

}
