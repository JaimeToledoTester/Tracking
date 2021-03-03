package POM;


import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class CEmpresa {
	
	    Base b=Base.getInstance();
		
	    String user,pass;
	    String nempresa="Almexa";
	    
	    public AndroidDriver<WebElement> driver; 	    
	    
		public void empresa() {
			try {
			    By empresa= By.xpath("//*[text()='"+nempresa+"']");
				b.wait(empresa);
				assertTrue(b.isPresent(empresa));
			}catch (Exception e) {System.out.println("Error en test: "+e);}
		}
	   
    private static CEmpresa cemp;

 	private CEmpresa() {
 		this.driver=b.driv();//se trae el driver de Base
 	}

 	public static CEmpresa getInstance() {
        if (cemp == null) {
        	cemp=new CEmpresa();
 		}
 		return cemp;
 	}
}
