package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import upskill.ebay.pageAction.dipuAction;
import upskill.utilities.SetupDrivers;

public class HomePageDipu {
	dipuAction dipu2 = new dipuAction();
@Given("^Homepage is open and clicking the link$")
public void homepage_is_open_and_clicking_the_link() throws Throwable {
   SetupDrivers.driver.get("http://the-internet.herokuapp.com/");
dipu2.clickLoginLink();
}
}
