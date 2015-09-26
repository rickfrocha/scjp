package testeColecoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TesteCompatibilidade {
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(7);
		a.add(8);
		teste(a);
		System.out.println("fim");
		
		List<Pai> pais = new ArrayList<Filho>();
		List<Filho> filho = new ArrayList<Filho>();
		testePolimorfismo( (List<Pai>) filho);		
		testeGeneric(filho);
	}
	
	static void teste(List a){
		a.add( new String("abcd") );
	}
	
	static void testePolimorfismo(List<Pai> pais){
		Filho f = new Filho();
		pais.add(f);
	}
	
	static void testeGeneric(List<? extends Pai> itens  ){
		
	}
	
	static void testeGeneric2(List<? super Filho> itens){
		
	}
	
	static <T extends Serializable> void meuTesteGeneric(T param){
		
	}
	
}

class a<T>{
	T teste(T a){
		return a;
	}
}

class DaoGeneric<T>{
	T busca(T param){
	   return null;	
	}
}
