package testeBoxing;

public class TestePrimitivos {
	
	public static void main(String[] args) {
		byte a = 1;
		byte b = 2;
		byte c = (byte) (a +  b);
		//byte c = (byte) a +  b; ERRO DE COMPILACAO, TEM QUE TER PARENTESES NA EXPRESSAO
		//byte c = (byte) a +  (byte) b; ERRO DE COMPILACAO, TEM QUE HAVER CAST NA EXPRESSAO, IGUAL SOLUCAO ACIMA
		soma( (byte) b + c  ); //NAO TA ATRIBUINDO, PODE, MAIS O RESULTADO É INTEGER POR NAO TEM CAST NA EXPRESSAO
		soma( (byte) b + (byte) c  ); //NAO TA ATRIBUINDO, PODE, MAIS O RESULTADO É INTEGER POR NAO TEM CAST NA EXPRESSAO
		soma( (byte) (b +  c)  ); //CAST NA EXPRESSAO, TORNA byte, faz o BOXING, chama metodo com BYTE
		soma( b +  c  ); //NAO TEM PROBLEMA, NAO TA ATRIBUINDO. MAIS RESULTADO É INTEGER, TODA SOMA DE LITERAIS MENOR QUE INT É INT.
		//SE NAO HOUVER CAST PARA O TIPO MENOR QUE INT, E NAO TIVER UM METODO COM INTEGER, ENTAO, OCORRERA ERRO DE COMPILACAO POIS COMPILADOR SABE QUE NA SOMA RETORNA INTEGER.
		
		
		char h = 10;
	}
	
	static void soma(Byte b){
		System.out.println("Byte");
	}
	
//	static void soma(Integer b){
//		System.out.println("Integer");
//	}
	
	static void soma(Short b){
		System.out.println("Short");
	}
	
	static void soma(Long b){
		System.out.println("Long");
	}
	
	

}
