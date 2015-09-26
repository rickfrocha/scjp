package main;

/*
 *  - é possivel criar um enum interno (dentro da classe) ou externo
 *  - um construtor de um enum nunca pode ser chamado explicitamente. Portanto, sempre sera private.
 *  - pra cada constante(tipo), é possivel abrir chaves e implementar metodos, devera ser fechado com ponto e virgula.
 *  - pra cada constante(tipo), pode-se reescrever metodos. Porem, devera ter metodo criado fora para que ele seja invocado fora do enum. 
 */
enum COPO{ 
	   AMERICANO(0), 
	   PINGA(1), 
	   DUPLO(2){
		   public void teste(){
			   
		   };
		   
		   public void abcd(){
			   
		   }
	   };
	   
	   private int qtd;
	   
	   private COPO(int qtd){
		   this.qtd = qtd;
	   }
	   
	   public void teste(){
		   
	   }
}


public class Main_Teste_Enum {
	
	enum INTERNO{ VALOR_A, VALOR_B}	
	public static void main(String[] args) {
		COPO.DUPLO.teste();
	}
}
