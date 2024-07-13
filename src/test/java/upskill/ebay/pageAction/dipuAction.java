package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.dipuHulk;
import upskill.utilities.SetupDrivers;

public class dipuAction {
	dipuHulk dipu;
	public dipuAction() {
		dipu = new dipuHulk();
		PageFactory.initElements(SetupDrivers.driver, dipu);
	};
	
	public void clickLoginLink(){
		dipu.authentication_link.click();
	}
}
