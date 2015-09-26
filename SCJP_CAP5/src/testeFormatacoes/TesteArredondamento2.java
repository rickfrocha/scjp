package testeFormatacoes;

import java.text.NumberFormat;

public class TesteArredondamento2 {
	
	public static void main(String[] args) {
		double d1 = 2.5;
		double d2 = 1.5;
		NumberFormat nb = NumberFormat.getInstance();
		nb.setMaximumFractionDigits(0);
		
		System.out.println("valor impresso: " + nb.format(d1) );
		System.out.println("valor impresso: " + nb.format(d2) );
		
		double d3 = 567.123456;
		System.out.println("valor impresso: " + nb.format(d3) );
		
		double d4 = 560.5;
		//depois da virgula diferente de 5: Se menor, arredonda pra baixo, senao arredonda pra cima
		//se for cinco depois da virgula, ai , olha posicao anterior da virgula 
		
		//Ultimo Antes da virgula: Se for par, arredonda pra baixo
		System.out.println("valor impresso: " + nb.format(d4) );
		
		double d5 = 2.512345;
		System.out.println("valor impresso: " + nb.format(d5) );
		
		nb.setMaximumFractionDigits(5);
		
		double d6 = 2.312345;
		System.out.println("valor impresso: " + nb.format(d6) );
		
		double d7 = 2.500001000;
		System.out.println("valor impresso: " + nb.format(d7) );		
		
	}
	
}
