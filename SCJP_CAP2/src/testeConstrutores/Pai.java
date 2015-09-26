package testeConstrutores;

import exceptions.MyException;

public class Pai {
	
	private Pai() {
		System.out.println("Construtor Pai executado");
	}
	
	public Pai(String s) throws MyException{		
		System.out.println("Construtor overload do pai executado");		
	}

}
