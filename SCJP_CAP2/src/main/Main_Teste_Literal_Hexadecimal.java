package main;

public class Main_Teste_Literal_Hexadecimal {
	
	//numeros vao de 0-9 e a-f
	// ox + 1..9 = ..9
	// ox + a..f = ..15
	// ox + 10   = 16
	// ox + 11 = 17
	// ox + 12 = 18
	// ox + 13 = 19	
	
	public static void main(String[] args) {
		int a = 0x13;
		System.out.println(a);
	}

}
