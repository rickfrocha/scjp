import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteForArray {

	public static void main(String[] args) {
//		 int size = 10;
//	      int[] arr = new int[size];
//	      for (int i = 0 ; i < size ; i++) System.out.println(i);
//	      
//	      float f = Integer.MAX_VALUE;
//	      int i = (int) f;
//	      System.out.println( i == Integer.MAX_VALUE);
//	      
//	      System.out.println(luckyNumber(6));
//	      
//	      //String str = "String".replace('g','G');
//	      System.out.println(  "String".replace('g','g')=="String" );
//	      
//	      char a = '1';
//	      switch (a){
//	      case 10:
//	      case 11:	  
//	      }
//	      
//	      final byte b = (byte) 128;
//	      switch (1){
//		      case 'a':
//		      case b :	 
//	      }
//	      
//	      Integer i1 = new Integer(1) ;
//	      Long m = new Long(1);
//	      if( i1.equals(m)) System.out.println("equal");   // 1
//	      else System.out.println("not equal");	      
//	      
//	      boolean b1 = true;
//	      assert b1 = true;
//
//	      
//	      Map<Object, ?> m1 = new LinkedHashMap<Object, Object>();
//	      Map<Object, ? super ArrayList> m2 = new LinkedHashMap<Object, ArrayList>();
//
//	      String s = NumberFormat.getInstance().format(10);  
//	      
//	      Pattern p = Pattern.compile("0[xX][0-9a-fA-F]");
//	      Matcher ma = p.matcher("0x12 0x 0 x3abc ab23   0Xfm" );
//	      while(ma.find()){
//	    	  System.out.println( ma.group());	    	  
//	      }
//	      
//	      File f1 = new File("c:\\a\\b\\c");
//	      f1.mkdir();
	      
//	      StringBuffer sb = new StringBuffer("12345678");
//	      sb.setLength(5);
//	      sb.setLength(10);
//	      System.out.println(sb.length());
	      
		    String s = "blooper";
		    StringBuilder sb = new StringBuilder(s);
		    s.append("whopper");
		    sb.append("shopper");
			
		    System.out.println(s);
		    System.out.println(sb);
		    String String = "a";
		    
		    Locale l = new Locale("pt","BR");
		    Arrays.b
	  	
	}
	
	static public int luckyNumber(int seed)
	{
		if(seed > 10) return seed%10;
		int x = 0;
		try
		{
			if(seed%2 == 0) throw new Exception("No Even no.");
			else return x;
		}
		catch(Exception e)
		{
			return 3;
		}
		finally
		{
			return 7;
		}
	}	
}



class BookList extends ArrayList<Object>
{
    public int count = 0;
    public boolean add(Object o)
    {
	if(o instanceof Object ) return super.add((Object) o);
	else return count++ == -1;
    }
}
