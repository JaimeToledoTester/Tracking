package POM;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;

public class CLogin {
	
	    Base b=Base.getInstance();
	    By luser= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
		By lpass= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
	    By llogin=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button");
	    By asser=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button");
	    String user,pass;
	    
	    
	    
		public void login() {
			try {
            usuario();
			}catch (Exception e) {System.out.println("Error en test: "+e);}
		}
	    
		public void usuario() {
			try {
			b.write("1060457",luser);
			contrase�a();
			}catch(Exception e) {System.out.println("Error en Capturar Usuario, Clogin "+e);}
		}
		
        public void contrase�a() {
        	try {
			b.write("Jtoledo106", lpass);
			inicses();
        	}catch(Exception e) {System.out.println("Error en Capturar Contrase�a, Clogin "+e);}
		}
        
        
        public void inicses() {
        	try {
        	b.clic(llogin);
    	    asser();
        	}catch(Exception e) {System.out.println("Error al iniciar sesi�n, Clogin "+e);}
		}
        
        public void asser() {    
        	try {
        	b.wait(asser);
        	assertTrue(b.isPresent(asser));
//        	screenshot();
        	}catch(Exception e) {System.out.println("Error en asser, Clogin "+e);}
        }
        
//        public void screenshot() {
//        	try {
//        WebDriver augment= new Augmenter().augment(driver);
//		File srcfile=((TakesScreenshot)augment).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(srcfile,new File("test1.png"));
//			}catch (Exception e) {System.out.println("Error en login mscreenshot: "+e);}
//        }
        

        
        private static CLogin clog;

    	private CLogin() {
    	}

    	public static CLogin getInstance() {
           if (clog == null) {
    			clog=new CLogin();
    		}
    		return clog;
    	}
	    
}
