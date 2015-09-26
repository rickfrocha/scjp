package main;


public class Animal {
	
	public String a = "xcvd";
	
	public String getA(){
		return "retornando animal " + a;
	}
	
	//testar override com metodo sem visibilidade no pacote bixos
	String teste(){
		return "teste animal";
	}
}
