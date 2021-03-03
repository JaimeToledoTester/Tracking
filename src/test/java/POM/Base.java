package POM;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public AndroidDriver<WebElement> driver;

	public AndroidDriver<WebElement>driv(){
		return driver;
	}
	
	public AndroidDriver<WebElement> generatedriver() {
		try {		
			DesiredCapabilities caps = new DesiredCapabilities();
			 caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
		        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");  
		        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "starqlteue");
		        caps.setCapability(MobileCapabilityType.UDID, "3458415559353498");
		        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
		        caps.setCapability("appPackage","com.recursoconfiable.tracking");
		        caps.setCapability("appActivity","crc64f5a004558f78f662.MainActivity");
		        caps.setCapability("noReset", false);
		        caps.setCapability("noSign", true);
		        caps.setCapability("autoGrantPermissions", true);
		        URL url=new URL("http://127.0.0.1:4723/wd/hub");
			    driver= new AndroidDriver<WebElement>(url,caps);   
		    }catch(Exception e) {System.out.println("ERROR en Base Método generatedriver: "+e);}
		return driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}

	public Boolean isPresent(By locator) {
		return driver.findElements(locator).size() > 0;
	}

	public void write(String text, By locator) {
		driver.findElement(locator).sendKeys(text);
	}

	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public void clic(By locator) {
		driver.findElement(locator).click();
	}

	public void clear(By locator) {
		driver.findElement(locator).clear();
	}

	public void submit(By locator) {
		driver.findElement(locator).submit();
	}

	public void wait(By locator) {
		try {
			WebDriverWait load = new WebDriverWait(driver, 10);
			load.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("No se encontro el elemento en el tiempo de espera");
		}
	}

	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

	public Boolean isEnabled(By locator) {
		try {
			return driver.findElement(locator).isEnabled();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}



	
//---------------------------------------------------singleton---------------------------
	private static Base base;

	private Base() {
    driver=generatedriver();
	}

	public static Base getInstance() {
        if (base == null) {
			base=new Base();
		}
		return base;
	}

}
