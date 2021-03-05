package POM;

import org.openqa.selenium.By;

public class CStop {
	Base b=Base.getInstance();
	By selstop=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
	By ok= By.xpath("//android.widget.Button[@text='OK']");
	String stop="CEDIS Prueba";
	
	public void selshipment() {
		b.wait(selstop);
		b.scroll(stop);
		b.clic(ok);
	}
	

	
	private static CStop st;

 	private CStop() {
 	}

 	public static CStop getInstance() {
        if (st== null) {
        	st=new CStop();
 		}
 		return st;
 	}
}
