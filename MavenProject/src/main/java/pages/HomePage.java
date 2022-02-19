package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath = "xpath of homelogo")WebElement HomeLogo;
@FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/nav/ol/li[1]/a")WebElement women;
@FindBy(css ="css of Men")WebElement men;
@FindBy(xpath= "xpath of kids")WebElement kids;
WebDriver dr;
 public HomePage(WebDriver x) {
	dr = x;
	PageFactory.initElements(dr, this);// we can initialize driver with this
 }
	public void verifyHomePageLogo() {
		if(HomeLogo.isDisplayed()) {
		System.out.println("logo is displayed");	
		}
		else {
			System.out.println("logo is not displayes");
		}
	}
 
public WomenPage womenclickMenu() {
	women.click();
	return new WomenPage(dr);
}
public MenPage menclickmenu() {
	men.click();
return new MenPage(dr);

}
public KidsPage kidsclickMenu() {
	kids.click();
	return new KidsPage();
}
}
	


