package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.FunctionalLibrary;

public class ProfilePage extends FunctionalLibrary {
	
	Actions a ;
	
	 public ProfilePage() {
		 
		 PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath ="//span[@data-icon='pencil']")
	WebElement editicon;
	
	@FindBy (xpath = "//div[@class='_3FRCZ copyable-text selectable-text']")
	WebElement txtbox;
	
	
	
	public ProfilePage editusername () {
		
		editicon.click();
		txtbox.clear();
		txtbox.sendKeys("Whatsappuser");
		
		return new ProfilePage();
		
		
		
	}
	

}
