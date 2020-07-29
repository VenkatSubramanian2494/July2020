package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.FunctionalLibrary;

public class Homepage extends FunctionalLibrary{
	
	public Homepage () {
		
		PageFactory.initElements(driver , this);
	}
	
	@FindBy (xpath = "//span[@data-icon='menu']")
    WebElement menu;
	
	@FindBy (xpath = "//div[text()='Profile']")
	WebElement profile;
	
	
	
	public Homepage profileselect () {
		
		menu.click();
		profile.click();
		
		return new Homepage();
		
		
	}
	
}
