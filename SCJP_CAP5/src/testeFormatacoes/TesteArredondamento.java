package testeFormatacoes;

import java.text.NumberFormat;

public class TesteArredondamento {
	
	public static void main(String[] args) {
		
		
		
			
		double d = 987.123456d;
		float  f = 987.123456f;	
        NumberFormat nf = NumberFormat.getInstance();  
        //nf.setMaximumFractionDigits(5);  
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(d));  
		
		System.out.println("Valor formatado double : " + nf.format(d));
		System.out.println("Valor formatado float  : " + nf.format(f));
		
		double dd = 987.51345;
		System.out.println("Valor formatado double  dd: " + nf.format(dd));
		
		
		double d1 = 987.333;
		float fl1 = 234.567f;
		float d2 = 234.567f;
		nf.setMaximumFractionDigits(2);
		System.out.println("Valor formatado double d1 : " + nf.format(d1));
		System.out.println("Valor formatado double d2 : " + nf.format(d2));
		System.out.println("Valor formatado float  : " + nf.format(fl1));
		
		double d3 = 987;
		System.out.println("Valor formatado double  d3: " + nf.format(d3));
		

		double d4 = 987.51345;
		System.out.println("Valor formatado double  d3: " + nf.format(d4));
		
		
		double d5 = Double.valueOf(2.5);
		double d6 = Double.valueOf(1.5);
		double d7 = Double.valueOf(3.56789);
		double d8 = Double.valueOf(654.56789);
		nf.setMaximumFractionDigits(3);
		System.out.println("Valor formatado double  d5: " + nf.format(d5));
		System.out.println("Valor formatado double  d6: " + nf.format(d6));
		System.out.println("Valor formatado double  d7: " + nf.format(d7));
		System.out.println("Valor formatado double  d8: " + nf.format(d8));
	}

}
