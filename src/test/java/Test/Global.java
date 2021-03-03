package Test;

import POM.Base;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;

public class Global {
	Base b=Base.getInstance();

  @Test
  public void testeo() {
	  try {
	  assert(true);
	  }catch(Exception e) {System.out.println("Error en Global, Mtesteo: "+e);}
  }


  @AfterSuite
  public void afterSuite() {
	  try {
      b.driver.quit();
	  }catch(Exception e) {System.out.println("Error en Global, driver: "+e);}
	  }
}
