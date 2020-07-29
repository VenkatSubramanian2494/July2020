package whatsapp.steps;

import POM.Homepage;
import POM.ProfilePage;
import Utility.FunctionalLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebWhatsapp extends FunctionalLibrary {
	
	static Homepage home;
	static ProfilePage p ;
	
	@Given("To navigate url")
	public void to_navigate_url() {
	    
		FunctionalLibrary.browserFactory();
		
	}

	@When("whatsapp launched click on the menu")
	public void whatsapp_launched_click_on_the_menu() {
	   
		home.profileselect();
		
	}

	
	@When("profile page appears edit username")
	public void profile_page_appears_edit_username() {
	     p.editusername();
	}

	

	
	

}
