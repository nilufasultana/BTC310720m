package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenShirtPage {
@FindBy(xpath="value")WebElement menShirtCatagory;
WebDriver dr;
public MenShirtPage(WebDriver x) {
	dr=x;
}


public MenShirtProductCatagory menShirtproductCatagory() {
menShirtCatagory.click();
return new MenShirtProductCatagory(dr);
}
}
