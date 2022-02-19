package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenJeansProductDetails {
@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[4]/div/div[2]/a/span[1]/span[2]")List<WebElement>allColors;
@FindBy(xpath="//*[@id=\"content\"]/div/div/section/section[1]/section/div[6]/div/div/button")List<WebElement>allSize;
WebDriver dr;
public WomenJeansProductDetails(WebDriver x) {
	dr = x;
PageFactory.initElements(dr, this);
}
public void Selectcolor(String expectedcolor) {
	for(WebElement colors:allColors) {
	String co =	colors.getText();
	if(co.equals(expectedcolor)) {
	break;	
	}
	}
}

public void Selectsize(String expectedallSize) {
	for(WebElement size:allSize) {
	String qw=size.getText();
	if(qw.equals(expectedallSize)) {
	break;	
	}
}
}
@FindBy(xpath="")WebElement regPrice;
@FindBy(xpath="")WebElement salePrice;
@FindBy(xpath="")WebElement addCart;

public void comparePrice(float discountPrice)	{
String rp=regPrice.getText().replace("$", "");
double regP=Double.parseDouble(rp);
String sp= salePrice.getText().replace("$", "");
double saleP=Double.parseDouble(sp);
if(regP*discountPrice==saleP) {
	addCart.click();
}
}
@FindBy(xpath= "")WebElement cart;
public CartPage clickCart() {
	cart.click();
return new CartPage(dr);
}
}
