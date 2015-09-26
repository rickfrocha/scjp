package testeSobrescrita;

import exceptions.MyException;
import exceptions.MyExceptionFilha;

public class Filho extends Pai{

	/**
	 * -Ao sabrescrever o metodo eu posso NAO lancar uma excessao declarada no metodo pai, porem,
	 * -Eu nao posso lancar uma excessao mais abrangente.
	 * -Eu posso adicionar uma subclasse da exception declarada na classe pai.
	 * -A classe filha pode lancar uma excessao nao declarada desde que seja RuntimeException
	 * -A assinatura do metodo deve ser exatamente igual, caso, o argumento pai seja uma Class Pai e no metodo filho o argumento
	 * seja uma classe Filha, sera um overload, nao um override.
	 */
	@Override
	public void metodoUm() throws MyExceptionFilha{
		
	}
	
	
	
	
	
	public void metodoDois(Pai x) throws RuntimeException {
		//super.metodoDois(x);
	}



	public void metodoTres(){
		System.out.println("executou filho");
	}


	public static void main(String[] args) {
		System.out.println("main");
		Filho f = new Filho();
		try {
			f.metodoUm();	
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}
	
	

}
