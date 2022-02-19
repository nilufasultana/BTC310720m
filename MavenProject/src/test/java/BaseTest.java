import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
WebDriver dr;
	
	@Before
	public void openBrowser() throws InterruptedException, IOException {
		
		//getPropertyFile("config.properties", "browser");
		
		String br = System.getProperty("browser");
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
			dr = new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver 2");
			dr = new FirefoxDriver();
			System.out.println("Firefox browser -----------");
		}
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "path");
			System.out.println("IE browser -----------");
		}
		else if(br.equals("safari")) {
			System.setProperty("webdriver.safari.driver", "path");
			System.out.println("Safari browser -----------");
		}else {
			System.out.println("No match found, Chrom executed");
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Downloads/chromedriver");
			dr = new ChromeDriver();
		}
		
		dr.get("http://www.target.com");
		Thread.sleep(3000);
		//Dimension dimension = new Dimension(1800, 1080);
		//dr.manage().window().setSize(dimension);
		
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
	}
	
	String getPropertyFile(String fileName, String keyName) throws IOException {
		FileInputStream f = new FileInputStream(fileName);
		Properties p = new Properties();
		p.load(f);
		
		String pr = p.getProperty(keyName);
		System.out.println(pr + " property value------------");
		return pr;
	


}
	


	}





