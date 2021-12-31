package pages.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import lib.selenium.PreAndPost;

public class ListIncidents extends PreAndPost {

	public ListIncidents(EventFiringWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='form-control'])[1]")
	private WebElement eleSearch;

	@FindBy(xpath = "//span[@id='incident_hide_search']//select")
	private WebElement eleSearchDD;

	public ListIncidents typeAndEnterSearch(String data) {
		typeAndEnter(eleSearch, data);
		return this;
	}

	public ListIncidents selectSearchDD(String data) {
		selectDropDownUsingVisibleText(eleSearchDD, data);
		return this;
	}

}