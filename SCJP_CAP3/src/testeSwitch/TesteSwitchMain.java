package testeSwitch;

public class TesteSwitchMain {
	
	enum Cor{
		AMARELO, VERDE, AZUL, BRANCO, PRETO;
	}
	
	public static void main(String[] args) {
		
		Cor escolha = Cor.BRANCO;
		switch(escolha){		    
		    case AMARELO: System.out.println("amarelo"); break;
		    default: System.out.println("default branco"); break;
		    case VERDE: System.out.println("verde"); break;
		    case BRANCO: System.out.println("branco branco");		    
		}
		assert(true):"true";
		
	}

}
