package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/div/div/div/div[1]/div/div[2]/div/div/div/div[3]/div/div/div/div/div/a")WebElement jeansCatagory;

	WebDriver dr;
	 public WomenPage(WebDriver x) {
		dr = x;
		PageFactory.initElements(dr, this);// we can initialize driver with this
	 }

	public WomenJeansPage womenjeanssubManu() {
		jeansCatagory.click();
		return new WomenJeansPage(dr);
}
}
