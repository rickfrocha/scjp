import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;


enum EnumA{ A, AA, AAA};  //1


class CorbaComponent
{
    String ior;
    CorbaComponent(){ startUp("IOR"); }
    void startUp(String s){
    	System.out.println("chamou pai");
    	ior  =  s; }
    void print(){ System.out.println(ior); }
}

class OrderManager extends CorbaComponent
{
   OrderManager(){  }
   void startUp(String s){  ior = getIORFromURL(s);   }
   String getIORFromURL(String s){
	   System.out.println("chamou filho");
	   return "URL://"+s; 
	}
}



public class TesteHashCodeEquals1 {
	
	
	static int i = 10;
	
	public TesteHashCodeEquals1() {
		System.out.println(this.i);
	}
	
	public static enum EnumC{ C, CC, CCC }; //4

	
	
	static void start(CorbaComponent cc){ cc.print(); }
	
	
	public static double getSwitch(String str)
	{
		return Double.parseDouble(str.substring(1, str.length()-1) );
	}

	
	public void ifTest(boolean flag)
	{
	   if (flag)   //1
		   if (flag)   //2
		   System .out.println("True False");
		   else        // 3
		   System.out.println("True True");
	   else        // 4
	   System.out.println("False False");
	   
	   
	}
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; System.out.println(i++));
		
		System.out.println(0 > -1);
		
		int sum = 0;
	      for (int i = 0, j = 10; sum > 20; ++i, --j)      // 1
	      {
	         sum = sum+ i + j;
	      }
	      System.out.println("Sum = " + sum);		
		
		 int i = 5;
	      float f = 5.5f;
	      double d = 3.8;
	      char c = 'a';
	      if (i == f) c++;
	      if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
	      System.out.println(c);
	      
	      long a1 = 10; int a2 = 10;
	      a1 = a2 + a1;
	      
	      String s = 'b'+63+"a";
	      
	      //String s2 = 63 + new Integer(10) + 'a';
	      

	      
		Info a = new Info("aa", "b", "c");
		Info b = new Info("a", "ab", "c");
		System.out.println( a.equals(b)  );
		System.out.println("hashCode " + "aa".hashCode());
		System.out.println("hashCode " + "a".hashCode());
		
		//Ok, mais nao permite adicionar itens
		List<?> lst = new ArrayList<Object>();
		
		//NAO OK. SO DO LADO DA DIREITA PODE TER INTERROGACAO
		//List<Object> lst2 = new ArrayList<?>();
		
		//NAO OK, SO DO LADO DA DIREITA PODE TER ?
		//Map<?,Object> map = new HashMap<?,Object>();
		
//		Map<Object, ? extends String> map = new HashMap<Object,String>();
//		map.put(new Object(), new String() );
//		for(Entry<Object, ? extends String> ident : map.entrySet()){
//			
//		}
		
		
		int i1 = 1, i2 = 2, i3 = 3;
		int i4 = i1 + (i2=i3 );
		System.out.println(i4);
		
		List l = new ArrayList();
		l.add("a");
		l.add("b");
		l.add(1,"c");
		System.out.println(l);
		
		List s2 = new LinkedList(  l.subList(1, 1) );
	      l.addAll(s2);
	      System.out.println(l);
		
	      
	      int ia[ ][ ] = { { 1 , 2}, null };
	      int ja[ ][ ] = (int[ ] [ ])ia.clone();
	      System.out.print((ia == ja) + " ");
	      System.out.println(ia[0] == ja[0] && ia[1] == ja[1]);	 
	      
	      int ix = 10;
	      ix: for(;;){
	    	  break;
	      }
	      
	      new TesteHashCodeEquals1();
	}
	

	public static void  doIt( String String )   // 1
	{
	   int i = 10;
	   i : for (int k = 0 ; k< 10; k++)    // 2
	   {
	      System.out.println( String + i); //3
	      if( k*k > 10) continue i;        //4
	   }
	}
	

	
	
	
}

class Info {
	String s1, s2, s3;

	public Info(String a, String b, String c) {
		s1 = a;
		s2 = b;
		s3 = c;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Info))
			return false;
		Info i = (Info) obj; 
		return (s1 + s2 + s3).equals(i.s1 + i.s2 + i.s3);
	}

	public int hashCode() {
		return s1.hashCode();
	}

	public static void main(String[] args) {
		HashMap map = new HashMap();
		Info i1 = new Info("aaa", "aaa", "aaa");
		Info i2 = new Info("aaa", "bbb", "ccc");
		map.put(i1, "hello"); // 1
		map.put(i2, "world"); // 2
	}
}
