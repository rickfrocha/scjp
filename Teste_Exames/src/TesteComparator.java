import java.io.Console;
import java.util.Comparator;
import java.text.*;


public class TesteComparator {
	
	static String[] sa = { "d", "bbb", "aaaa" };
	
	public static void main(String[] args) {
		//Arrays.sort(sa);
//		char c = 'a';
//		for(String s : sa){ 	System.out.println(  s ); s.charAt(c); }
//		int i =  Arrays.binarySearch(sa, "c", new MyStringComparator());
//		System.out.println(i);
		One o = null;
	     Two t = new Two();
	     
	     Console c = System.console();
	     //c.writer()
	}

}


class A{  int a; }
class B extends A{ int a; }

class MyStringComparator implements Comparator
{
    public int compare(Object o1, Object o2)
    {
	int s1 = ((String) o1).length();
	int s2 = ((String) o2).length();
	return s1 - s2;
    }
    
    public int methodA(int a){  return a*2; } //1
    public long methodA(int a){  return a; } //2
}




class Super
{
  static{ System.out.print("super "); }
}
class One
{
  static {  System.out.print("one "); }
}
class Two extends Super
{
  static {  System.out.print("two "); }
}



class MinhaThread extends Thread{
	public void run(){
		
	}
}

