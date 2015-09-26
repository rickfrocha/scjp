package testeScanner;

import java.util.Scanner;

public class TesteDelimitadores {
	
	public static void main(String[] args) {
		 String input = "1;2;3;4;5;6;7;8;9;0";
		
		 Scanner s = new Scanner(input);
		 s.useDelimiter(";");
		 
		 while(s.hasNext()){
			 System.out.println(">>" + s.next()+"<<");
		 }
		 
		 Integer i = Integer.parseInt("01010101",2);
		 System.out.println("bin --> int " + i);
		 
		 String s2 = Integer.toString(i.intValue(), 2);
		 System.out.println("int --> bin " + s2);
		 
		 Integer i2 = Integer.parseInt(s2,2);
		 System.out.println("bin --> int " + i);
		 
		 Integer ic = Integer.parseInt("10101010",2);
		 System.out.println("bin --> int " + ic);
		 
		 Integer ii = Integer.valueOf("10");
		 System.out.println("");
		 
	     s.close(); 
	}

}
