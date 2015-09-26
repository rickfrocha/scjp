package testeConstrutores;


class A{
	protected A(){
		System.out.println("construtor classe pai.");
	}
}

class B extends A{
	private B(){
		System.out.println("construtor classe filha");
	}
}

public class TesteConstrutorPrivate extends A{
 
	private TesteConstrutorPrivate() {
		System.out.println("construtor de teste");
	}
	
	public static void main(String[] args) {
		//B b = new B(); CONSTRUTOR DE B NAO ESTA VISIVEL, POR ISSO NAO PODE INSTANCIA-LO. TERIA QUE TER UM SINGLETON AQUI
		TesteConstrutorPrivate t = new TesteConstrutorPrivate();
	}

}
