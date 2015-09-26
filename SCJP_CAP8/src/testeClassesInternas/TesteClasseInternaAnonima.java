package testeClassesInternas;

public class TesteClasseInternaAnonima {
	
	abstract class Pessoa{
		private int x;
		private int y;
		Integer h;
		
		public int calc(){
			return x + y;
		}
		
		abstract void teste1();
		abstract void teste2();
	}
	
	public void calcPessoa(){
		
		//Quando instanciar classe anonima, obrigatorio o ";" depois das chaves "}"
		Pessoa p = new Pessoa(){
			@Override
			void teste1() {
				//x++;  NAO PODE ACESSAR MEBRO PRIVATE, IGUAL HERANCA.
				//System.out.println("teste1 exec... valor de x agora " + x);
				h++;
				System.out.println("teste 1 ... acessando Wrapper nao inicializado " + h);
			}

			@Override
			void teste2() {
			}			
		};
		p.teste1();
	}
	
	
	public static void main(String[] args) {
		TesteClasseInternaAnonima x = new TesteClasseInternaAnonima();
		x.calcPessoa();
	}

}
