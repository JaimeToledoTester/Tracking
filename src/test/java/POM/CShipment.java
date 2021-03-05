package POM;

import org.openqa.selenium.By;

public class CShipment {
	Base b=Base.getInstance();
	By caja=By.id("android:id/search_src_text");
	By ok= By.xpath("//android.widget.Button[@text='OK']");
	String ship="0403202101";
	
	public void selshipment() {
		b.wait(caja);
		b.scroll(ship);
		b.clic(ok);
	}
	
	
	
	
	
	
	private static CShipment shipe;

 	private CShipment() {
 	}

 	public static CShipment getInstance() {
        if (shipe== null) {
        	shipe=new CShipment();
 		}
 		return shipe;
 	}
}
