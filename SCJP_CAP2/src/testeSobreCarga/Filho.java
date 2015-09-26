package testeSobreCarga;

public class Filho extends Pai{
	
	public void teste(String a){
		
	}
	
	public String teste(Integer a){
		return null;
	}
	
	public Object teste(Double a){
		return new Integer[5];
	}

	
	public void imprimir(Pai pai){
		System.out.println("imprimir pai");
	}
	
	public void imprimir(Filho filho){
		System.out.println("imprimir filho");
	}
	
	public static void main(String[] args) {
		Pai p = new Filho();
	    Filho f = new Filho();
	    f.imprimir(p);
	}
}
