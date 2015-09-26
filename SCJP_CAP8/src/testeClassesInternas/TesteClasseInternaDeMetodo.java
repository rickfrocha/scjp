package testeClassesInternas;

public class TesteClasseInternaDeMetodo {
	
	private int j = 10;
	
	/**
	 * Teste de criacao de classe interna de metodo
	 * 1 - Classe interna de metodo consegue acessar membros da classe Pai (TesteClasseInternaDeMetodo)
	 * 2 - Classe interna de metodo nao consegue acessar variavel de escopo de metodo
	 * 3 - Para acessar variavel de escopo de metodo deve-se declarar como FINAL.
	 */
	public void teste(){
		int y = 10; //variavel diferente da variavel da classe Pessoa
		int h = 0;
		final int g = 0;
		class Pessoa{
			int x = 10;
			int y = 20;
			
			int calc(){
				//h++; //NAO CONSEGUE ACESSAR VARIAVEL DO METODO
				System.out.println("acessando variavel g " + g);  //consegue acessar variavel do metodo desde que seja FINAL.
				j++; //CONSEGUE ACESSAR VARIAVEL DA CLASSE PRINCIPAL.			
				return x + y;
			}
		}
		
		Pessoa p = new Pessoa();
		int x = p.calc();
		System.out.println("valor de calc " + x);
	}
	
	public static void main(String[] args) {
		TesteClasseInternaDeMetodo t = new TesteClasseInternaDeMetodo();
		t.teste();
	}

}
