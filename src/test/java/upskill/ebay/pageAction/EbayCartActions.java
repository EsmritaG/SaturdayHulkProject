package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {

	EbayCartLocators EbayCartLocatorsObj;// creating the constructor for the
											// action class.

	public EbayCartActions() {
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	}

	public void switchNewWindow() {
		for (String winhandle : SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(winhandle);// no matter how many windows you open its going to be switching to the new window. 					
	}// we want to name a dynamic name.
	}

	public void selectSizeTypeDD() {
		Select dropDown = new Select(EbayCartLocatorsObj.ddSizeType);// creating object of the select class. 
			dropDown.selectByVisibleText("Big & Tall");																											
	}
	public void selectMenSizeDD() {
		Select dropDown = new Select(EbayCartLocatorsObj.ddMenSize);
		//dropDown.selectByVisibleText("8XLT");
		dropDown.selectByValue("5");
	}
	public void selectShadeDD() {
		Select dropDown = new Select(EbayCartLocatorsObj.ddShade);
		//dropDown.selectByVisibleText("Black");
		dropDown.selectByIndex(3);
	}
	public void enterQuantity() {
		EbayCartLocatorsObj.txtbxQty.clear();
		EbayCartLocatorsObj.txtbxQty.sendKeys("1");
	}

	public void addToCart() {
		EbayCartLocatorsObj.btnAddCart.click();
	}
	
	public void SelectShoeSizeDD(){
		Select dropDown = new Select(EbayCartLocatorsObj.ddShoeSize);
		dropDown.selectByValue("4");
	}
}
