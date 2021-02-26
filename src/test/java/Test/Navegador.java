package Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
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
public class Navegador {

	
	By q=By.name("q");
	By search =By.xpath("//*[@content-desc='Buscar']");
	By cajabus=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.EditText");		
    By sele=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout");
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
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome"); 
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver = new RemoteWebDriver(url,caps);   
	    }catch(Exception e) {System.out.println("ERROR en before class: "+e);}
	}
	

	@Test
	public void test() {
		try {	
			driver.get("http://www.amazon.com");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.id("nav-search-keywords")).sendKeys("hola");
			WebDriver augment= new Augmenter().augment(driver);
			Thread.sleep(1000);
			File srcfile=((TakesScreenshot)augment).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile,new File("test1.png"));
		}catch (Exception e) {System.out.println("Error en test: "+e);}
	}

	@Test
 	public void test2() {		
		try {
			driver.get("http://www.google.com");
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.findElement(q).sendKeys("face");
			Thread.sleep(1000);
			WebDriver augment= new Augmenter().augment(driver);
			File file=((TakesScreenshot)augment).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file,new File("test2.png"));
		}catch (Exception e) {System.out.println("Error en test: "+e);}
 	}

	
	@AfterClass
 	public void testend() throws Exception {		
	driver.close();
	driver.quit();
 	}

}
