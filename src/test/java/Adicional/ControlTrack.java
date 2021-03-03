package Adicional;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.TakesScreenshot;
public class ControlTrack {

    By user= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
	By pass= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
    By login=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button");
    
	WebDriver driver;
	@BeforeClass
	public void SetUp() {
		try {		
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(CapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");  
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "starqlteue");
        caps.setCapability(MobileCapabilityType.UDID, "3458415559353498");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
        caps.setCapability("appPackage","com.recursoconfiable.tracking");
        caps.setCapability("appActivity","crc64f5a004558f78f662.MainActivity");
        caps.setCapability("noReset", true);
        caps.setCapability("noSign", true);
        caps.setCapability("autoGrantPermissions", true);
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver = new RemoteWebDriver(url,caps);   
	    }catch(Exception e) {System.out.println("ERROR en before class: "+e);}
	}
	
	@Test
	public void test() {
		try {	
			driver.findElement(user).sendKeys("1060457");
			driver.findElement(pass).sendKeys("Jtoledo106");
			driver.findElement(login).click();	    	
			WebDriver augment= new Augmenter().augment(driver);
			File srcfile=((TakesScreenshot)augment).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile,new File("test1.png"));
		}catch (Exception e) {System.out.println("Error en test: "+e);}
	}
	

	
	@AfterClass
 	public void testend() throws Exception {		
	driver.quit();
 	}

}
