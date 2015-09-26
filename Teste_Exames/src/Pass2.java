
public class Pass2 {
   public static void main(String[] args) {
	   int x = 6;
	   Pass2 p = new Pass2();
	   p.doStuff(x);
	   System.out.println("fim "+x);
   }
   
   void doStuff(int x){
	   System.out.println(" do stuff" +  x++);
   }
}

