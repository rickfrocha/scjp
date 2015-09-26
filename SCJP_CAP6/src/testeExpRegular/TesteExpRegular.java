package testeExpRegular;

public class TesteExpRegular {
	
	public static void main(String[] args) {
		
		String minhaPlaca = "EPD-5564";
		System.out.println( "Placa valida? " + validarPlacaCarro(minhaPlaca) );
		
		String meuCPF = "302372818-641";
		System.out.println( "Cpf valido? " + validarCpfPessoa(meuCPF) );
		
		String meuRG = "27.782.042-X";
		System.out.println( "rg valido? " + validarRG(meuRG) );
		
		
		String meuEmail = "rickfrocha@gmail.com";
		System.out.println("Email valido " + validarEmail( meuEmail )   );
	}
	
	/*
	 * Retorna true se encontrar o que deseja.
	 */
	static boolean validarPlacaCarro(String placa){
		String padrao = "[a-zA-Z]{3}-\\d{4}";
		return placa.matches(padrao);
	}

	static boolean validarCpfPessoa(String cpf){
		//VALIDA CPF: 302.372.818-64 E 30237281864
		String padrao = "\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2,3}";
		return cpf.matches(padrao);
	}
	
	static boolean validarEmail(String email){
		String padrao = "^[a-zA-Z]+@[a-zA-Z]{3,}\\.[a-zA-Z]{3,}";
		return email.matches(padrao);
	}
	
	static boolean validarRG(String rg){
		String padrao = "\\d{2,}\\.\\d{3}\\.\\d{3}-[a-zA-Z0-9]+";
		return rg.matches(padrao);
	}
	
}
