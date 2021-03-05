package POM;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
 

public class CEmpresa {
	
	    Base b=Base.getInstance();
	    By ok= By.xpath("//android.widget.Button[@text='OK']");
	    By  empresas= By.className("android.widget.TextView");
	    By caja=By.id("android:id/search_src_text");	    String user,pass;
	    String nempresa="Corporativo de pruebas RC";
	    
		public void empresa() {
			try {
			    b.wait(empresas);
				b.scroll(nempresa);
				b.clic(ok);
				b.wait(caja);
				assertTrue(b.isPresent(caja));
			}catch (Exception e) {System.out.println("Error en test empresa: "+e);}
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
