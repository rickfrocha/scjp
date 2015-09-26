package testeBoxing;

public class TestePrimitivos2 {
	
	public static void main(String[] args) {
		char c = 10;		
		metodo( c );
	}
	
	static void metodo(long s){
		System.out.println("long");
	}
	
	static void metodo(Character s){
		System.out.println("Char boxing");
	}
	
	static void metodo(Integer v){
		System.out.println("Integer boxing");
	}

}
