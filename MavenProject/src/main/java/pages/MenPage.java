package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage {
@FindBy(xpath="value")WebElement menShirtPage;
WebDriver dr;
public MenPage(WebDriver x) {
dr =x;
PageFactory.initElements(dr, this);
}
	
	public MenShirtPage clickAnyShirt() {
	menShirtPage.click();
	return new MenShirtPage(dr);
}
}
