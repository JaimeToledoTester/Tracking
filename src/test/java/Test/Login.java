package Test;


import org.testng.annotations.Test;
import POM.Base;
import POM.CLogin;


public class Login {
  
	Base b=Base.getInstance();
	CLogin clog=CLogin.getInstance();	
	String Page;	 
	 
	@Test()
	public void login(){
	try {	 
	clog.login();
	}catch(Exception e) {System.out.println("Error en Test Login, Metodo login "+e);}
	}
	

	
}
