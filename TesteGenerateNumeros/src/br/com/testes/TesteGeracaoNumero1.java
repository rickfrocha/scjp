package br.com.testes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class TesteGeracaoNumero1 {
	
	private static class Generator{				
		static Generator instance = new Generator();
		private SimpleDateFormat sdf = new SimpleDateFormat("hhmmssSS");
		
		public static synchronized Generator getGeneratorInstance(){
			return instance;
		}
		
		public Long gerarNumero(){
			StringBuffer sb = new StringBuffer();
			sb.append(  sdf.format( new Date() ) );
			sb.append(  this.gerarNumeroRandomico(4) );			
			return  Long.valueOf(  sb.toString() );
		}
		
		private Long gerarNumeroRandomico(int length) {
		    Random random = new Random();
		    char[] digits = new char[length];
		    digits[0] = (char) (random.nextInt(9) + '1');
		    for (int i = 1; i < length; i++) {
		        digits[i] = (char) (random.nextInt(10) + '0');
		    }
		    return Long.valueOf(new String(digits));
		}		
	}
	
	static Long gerarNumero(){
		
		
		Calendar c = Calendar.getInstance();
		
		StringBuffer sb = new StringBuffer();		
		sb.append(  c.get(  Calendar.YEAR ) ); // 4 digitos
		sb.append(  String.format("%03d", c.get(  Calendar.DAY_OF_YEAR ) )  ); //3 digitos
		
		System.out.println(sb.toString());
		
		
		return 0L;
	}
	
	public static void main(String[] args) {
		Generator generator = Generator.getGeneratorInstance();
		for (int i = 0; i < 100; i++) {
		   //long numero = generator.gerarNumero();
		   long numero = gerarNumero();
		   //System.out.println(numero);
		}
		
		String strCobranca = "48177052";
		System.out.println(  strCobranca.substring(  strCobranca.length() -4    )      );
		 
	}

}
