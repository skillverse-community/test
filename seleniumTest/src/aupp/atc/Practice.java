package aupp.atc;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		WebDriver driver;
		//Setting the GeckoDriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");

		DesiredCapabilities dc = new DesiredCapabilities();
		//No to marionatte driver
		dc.setCapability("marionatte", false);
		dc.setPlatform(Platform.ANY);
		
		//Get Firefox browser
	    dc.setBrowserName("firefox");
		
	    FirefoxOptions opt = new FirefoxOptions();
		//merge the desired capabilities with options
		opt.merge(dc);
		
		//set the firefox exe to option
		opt.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		
		//instantiate the driver
		driver = new FirefoxDriver(opt);
		
		//make a get call to sauce demo
		driver.get("http://the-internet.herokuapp.com/");
		
		WebElement element = driver.findElement(By.linkText("Dropdown"));
		element.click();
		
		WebElement testDropDown = driver.findElement(By.id("dropdown")); 
		Select dropdown = new Select(testDropDown); 
		System.out.println("Does it support multiple selection? " + dropdown.isMultiple());
		
		dropdown.selectByIndex(1);
		List<WebElement> selectedOption = dropdown.getAllSelectedOptions();
		System.out.println("The selected option is : " + selectedOption.get(0).getText());

		
		
		System.out.println("Done");
		
	}
}
