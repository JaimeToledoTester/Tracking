package Test;

import org.testng.annotations.Test;

import POM.Base;
import POM.CShipment;

public class Viaje {
	Base b=Base.getInstance();
	CShipment cshi=CShipment.getInstance();	
	String Page;	 
	 
	@Test()
	public void selempresa(){
	try {	 
		cshi.selshipment();
	}catch(Exception e) {System.out.println("Error en Test Empresas, Metodo selempresas "+e);}
	}
}
