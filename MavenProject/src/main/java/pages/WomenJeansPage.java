package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenJeansPage {
@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div/div")WebElement womenJeansproductDetails;
WebDriver dr;	
public WomenJeansPage(WebDriver x) {
	dr = x;
PageFactory.initElements(dr, this);
}
	public WomenJeansProductDetails clickJeansproduct() {
		womenJeansproductDetails.click();
	   return new WomenJeansProductDetails(dr);
	
	}
}
