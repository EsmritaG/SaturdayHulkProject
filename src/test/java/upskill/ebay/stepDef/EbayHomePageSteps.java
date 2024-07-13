package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		//Opening Ebay homepage in setup driver class
	}
	
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	}
	
	@When("^Search for Pants$")
	public void search_for_Pants() throws Throwable {
		EbayHomePageActionsObj.searchPants();
	}
	
	@When("^Search for Shirts$")
	public void search_for_Shirts() throws Throwable {
		EbayHomePageActionsObj.searchShirts();
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomePageActionsObj.searchItems(items);
	}

@When("^Search for Shoes$")
public void search_for_Shoes() throws Throwable {
    
}
@Given("^Search for Big Tall Cotton Tee Shirt$")
public void search_for_Big_Tall_Cotton_Tee_Shirt() throws Throwable {
	EbayHomePageActionsObj.searchItems("Big & Tall Cotton Tee");
}
@Given("^Search for Nike Air Jordan (\\d+)$")
public void search_for_Nike_Air_Jordan(int arg1) throws Throwable {
    EbayHomePageActionsObj.searchItems("Nike Air Jordan 4");
}

@When("^Mouse Hover to MyEbay Summary$")
public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
   EbayHomePageActionsObj.mousehoverEbay();
}

@Then("^Click on Summary$")
public void click_on_Summary() throws Throwable {
  EbayHomePageActionsObj.clickSummary();
}
}
