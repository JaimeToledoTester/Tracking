package POM;


import org.openqa.selenium.By;
 

public class CEmpresa {
	
	    Base b=Base.getInstance();
	    By ok= By.xpath("//android.widget.Button[@text='OK']");
	    By  empresas= By.className("android.widget.TextView");
	    String user,pass;
	    String nempresa="nomasno";
	    
		public void empresa() {
			try {
			    b.wait(empresas);
				b.scroll(nempresa);
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
