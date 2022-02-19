package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
 @FindBy(xpath="value")WebElement changeprice;
 WebDriver dr;
public CartPage(WebDriver x){
	dr=x;
PageFactory.initElements(dr, this);
}

public void verifyquantityandprice3() {
	
}

}
