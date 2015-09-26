
public class TesteString {
	
	public static void main(String[] args) {
		
		
		String str = "12345";
		char ch = "12345".charAt(3);
		
		//ch = str.charAt(str.length());
		//System.out.println(ch);
		
		   Float f1 = new Float(Float.NaN);
		   Float f2 = new Float(Float.NaN);
		   System.out.println( ""+ (f1 == f2)+"  "+f1.equals(f2)+ "  "+(Float.NaN == Float.NaN) );
		   
		   float f = 1.0F/3.0F;
		    System.out.println(  (f * 3.0F) == 1.0F  );
		   
	}

}
