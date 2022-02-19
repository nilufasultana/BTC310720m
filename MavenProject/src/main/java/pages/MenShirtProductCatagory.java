package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenShirtProductCatagory {
@FindBy(xpath="value")List<WebElement> allColors;
@FindBy(xpath ="value")List<WebElement>allSize;
WebDriver dr;
public MenShirtProductCatagory(WebDriver x) {
	dr = x;
PageFactory.initElements(dr, this);
}
	
	
public void selectColor(String expectedcolor) {
	for(WebElement colors:allColors)	{
	String co =colors.getText();
	if(co.equals(expectedcolor)) {
		colors.click();
	break;
	}
	}
}
	public void SelectSize(String expectedsize) {
		for(WebElement size:allSize ) {
	String sx =size.getText();
		if(sx.equals(expectedsize)) {
		break;	
		}
		}
	}
	}

