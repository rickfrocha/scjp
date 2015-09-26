package testeClassesInternas;

public class TesteClasseInterna {
	
	private int x = 10;
	
	/**
	 * Classes internas podem ter mesmos modificadores de acesso a MEMBROS (default, private, protected e default)
	 * @author darochri
	 *
	 */
	private abstract class Pessoa {
		void teste(){
			System.out.println("teste pessoa executado");
		}
		
		void testeAcessoMembroInstanciaPai(){
			System.out.println("membro da classe Pai " + x);
		}
		
		void testeAcessoThis(){
			System.out.println("acessando membro this da classe Pai" + TesteClasseInterna.this  );
		}
	}
	
	private class Filho extends Pessoa {
		void teste(){
			System.out.println("sobrescrita");
		}
	}
	
	
	/**
	 * Para instanciar, primeiro deve instanciar a classe pai para depois instanciar classe filha.
	 */
	public void testeInstanciarClasseInterna(){
		TesteClasseInterna.Filho filho = new TesteClasseInterna().new Filho();
		filho.teste();
	}
	
	//Metodo main nao pode instanciar direto uma classe interna.
	//Primeiro deve instanciar a classe pai para depois instanciar classe filha.
	public static void main(String[] args) {
		TesteClasseInterna t1 = new TesteClasseInterna();
		Pessoa p = t1.new Filho();
		p.teste();
		p.testeAcessoMembroInstanciaPai();
		p.testeAcessoThis();
	}

}
