
import java.*;
import br.*;


public class TesteComparacaoString {
	
	String str1  = "RICARDO";
	
	ClasseTeste t;
	
	public static void main(String[] args) {
		String str2 = "RICARDO";
		TesteComparacaoString t = new TesteComparacaoString();
		Pessoa p = t.new Pessoa();
		
		
		System.out.println( t.str1 == str2 );
		System.out.println( p.str1 == str2 );
		System.out.println( p.str1 == t.str1 );
		System.out.println( p.str1 == "RIC" + "ARDO" );
		System.out.println( p.str1 == new String("RICARDO")  );
		comparacaoExercicioEnthuware();
		
	}
	
	static void comparacaoExercicioEnthuware(){
		System.out.println("======================= EXERCICIO ENTHUWARE");
		 String hello = "Hello", lo = "lo";
	      System.out.print((Other.hello == hello) + " ");    //line 1
	      System.out.print((Other.hello == hello) + " ");   //line 2
	      System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
	      System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
	      System.out.println(hello == ("Hel"+lo).intern());          //line 5	
	      
	      int a = 10, b1 = 5;
	      System.out.println( a + b1);
	      
	      String[] xx = "name:john;;sex:m;;".split(";");
	      for(String s : xx){
	      System.out.println( s );
	      int value = 0;
	      assert value == 10 : null;
	      }
	      
	      int ia[][] = { {1, 2}, null };
	      Float f = Float.NaN;
	      System.out.println( f );
	      unsigned byte b = 0;
	}
	
	
	
	class Pessoa{
		String str1 = "RICARDO";
	}

}


class Other { public static String hello = "Hello"; }