package Test;

import POM.Base;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Adicional.LeerJson;

public class Global {
	Base b=Base.getInstance();
	LeerJson js = LeerJson.getInstance();

	@BeforeMethod
	  public void beforeMethod() throws FileNotFoundException, IOException, ParseException {
		  try {
		  js.leerjson();
		  }catch(Exception e) {System.out.println("Error en Global,leerjson: "+e);}

	  }
  @Test
  public void testeo() {
	  try {
	  assert(true);
	  }catch(Exception e) {System.out.println("Error en Global, Mtesteo: "+e);}
  }


  @AfterSuite
  public void afterSuite() {
	  try {
     // b.driver.quit();
	  }catch(Exception e) {System.out.println("Error en Global, driver: "+e);}
	  }
}
