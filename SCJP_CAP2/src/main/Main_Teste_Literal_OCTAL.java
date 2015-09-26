package main;

public class Main_Teste_Literal_OCTAL {
	
	public static void main(String[] args) {
		
		//literal octal comeca com 0+inteiro
	    //octal: vai de zero a 7, nao existe 7 e 9, 
		//continua 10 ate 17, (010 = 8, 011 = 9, 012 = 10 ...) 
		//20 ate 27
		//01 .. 07 == 1..7, 010 .. 017 = 8 ..  15, 020 .. 027 = 16..23
		
		int[] t = new int[23];
		t[0] = 01;
		t[1] = 02;
		t[2] = 03;
		t[3] = 04;
		t[4] = 05;
		t[5] = 06;
		t[6] = 07; 
		t[7] = 010;
		t[8] = 011;
		t[9] = 012;
		t[10] = 013;
		t[11] = 014;
		t[12] = 015;
		t[13] = 016;
		t[14] = 017;
		t[15] = 020;
		t[16] = 021;
		t[17] = 022;
		t[18] = 023;
		t[19] = 024;
		t[20] = 025;
		t[21] = 026;
		t[22] = 027;
        		
		for (int i = 0; i < t.length; i++) {
			System.out.println("t" + i + " valor " +  t[i]);
		}
		 
	}

}
