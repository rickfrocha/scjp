package testeWrappers;

public class TesteComparacao {
	
	public static void main(String[] args) {
		Integer i1 = 1000;
		Integer i2 = 1000;
		System.out.println("Diferentes ? " + (i1 != i2) );
		System.out.println("iguais ? " + (i1.equals(i2) ) );
		
		Integer i3 = 10;
		Integer i4 = 10;
		System.out.println("Diferentes ? " + (i3 != i4) );
		System.out.println("iguais ? " + (i3.equals(i4) ) );
		
	}

}
