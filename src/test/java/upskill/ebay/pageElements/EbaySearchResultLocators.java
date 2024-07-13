package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	//Validate Shoes Items
		@FindBy(xpath="//span[2][contains(text(),'Shoes')]")
		public WebElement txtShoes;
		
		//Validate Pants Items
				@FindBy(xpath="//span[2][contains(text(),'Pants')]")
				public WebElement txtPants;
				
		//Validate Shirts Items
		
				@FindBy(xpath="//span[2][contains(text(),'Shirts')]")
				public WebElement txtShirts;
		//Checkbox Brand Adidas
				@FindBy (xpath="//input[@aria-label='adidas']")
				public WebElement cbxBrandAdidas;
				
				//Checkbox Brand Nike
				@FindBy(xpath="//input[@aria-label='Nike']")
				public WebElement cbxBrandNike;

				//Checkbox Brand Unbranded
				@FindBy(xpath="//input[@aria-label='Unbranded']")
				public WebElement cbxBrandUnbranded;
				
	//Checkbox Color Black
				@FindBy (xpath="//input[@aria-label='Black']")
				public WebElement cbxColorBlack;
				
				//Checkbox Color White
				@FindBy (xpath="//input[@aria-label='White']")
				public WebElement cbxColorWhite;
				
				//roundColor Blue
				@FindBy(xpath= "//a[@style='background-color: #657EEA']")
				public WebElement cbxColorBlue;
				
				//Big and Tall Cotton Tee Shirt
				@FindBy (xpath= "//span[contains(text(),'Big and Tall Cotton Tee Shirt')]")
				public WebElement txtBigandTallCottonTeeShirt;
				
				//Shirt Link
				@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee.')]")
				public WebElement linkShirtItems;
				
				//Shoes Link
				@FindBy(xpath="//li[@id='item5c149f06d6']/div/div[2]/a/div/span")
				public WebElement linkShoeItems;
				
}