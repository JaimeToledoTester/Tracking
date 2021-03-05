package Test;

import org.testng.annotations.Test;

import POM.Base;
import POM.CStop;

public class Stop {
	Base b=Base.getInstance();
	CStop st=CStop.getInstance();	
	String Page;	 
	 
	@Test()
	public void selempresa(){
	try {	 
		st.selshipment();
	}catch(Exception e) {System.out.println("Error en Test Empresas, Metodo selempresas "+e);}
	}
}
