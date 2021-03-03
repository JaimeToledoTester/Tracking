package Test;


import org.testng.annotations.Test;
import POM.Base;
import POM.CEmpresa;

public class Empresas {
	
	Base b=Base.getInstance();
	CEmpresa cemp=CEmpresa.getInstance();	
	String Page;	 
	 
	@Test()
	public void selempresa(){
	try {	 
			cemp.empresa();
	}catch(Exception e) {System.out.println("Error en Test Empresas, Metodo selempresas "+e);}
	}

}
