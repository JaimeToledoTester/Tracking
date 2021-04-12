package Test;


import org.testng.annotations.Test;

import Adicional.Data_Provider;
import POM.Base;
import POM.CLogin;


public class Login {
  
	Base b=Base.getInstance();
	CLogin clog=CLogin.getInstance();	
	String Page;	 
	 
	@Test(dataProvider = "AllData", dataProviderClass = Data_Provider.class)
	public void login(String a,String b,String c){
	try {	 
    System.out.println("R:" +a +"/n"+b+"/n"+c+"/n");
    //	clog.login();
	}catch(Exception e) {System.out.println("Error en Test Login, Metodo login "+e);}
	}
	

	
}
