package POM;


import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;

public class CEmpresa {
	
	    Base b=Base.getInstance();
	    By ok= By.xpath("//android.widget.Button[@text='OK']");
	    String user,pass;
	    String nempresa="UNILEVER";
	    
	    
		public void empresa() {
			try {
			    By empresa= By.xpath("//android.widget.TextView[@text='"+nempresa+"']");			    
				b.wait(empresa);
				b.clic(empresa);
				b.clic(ok);
				assertTrue(true);
			}catch (Exception e) {System.out.println("Error en test: "+e);}
		}
	   
    private static CEmpresa cemp;

 	private CEmpresa() {
 	}

 	public static CEmpresa getInstance() {
        if (cemp == null) {
        	cemp=new CEmpresa();
 		}
 		return cemp;
 	}
}
