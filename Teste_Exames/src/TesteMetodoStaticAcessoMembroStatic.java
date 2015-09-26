import java.util.Map;


public class TesteMetodoStaticAcessoMembroStatic {
	
	static String name = "RICARDO";
	
	public static TesteMetodoStaticAcessoMembroStatic acessarMembro(){
		System.out.println("ACESSOU METODO");
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(acessarMembro().name);
		System.out.println("entrou aqui");
		System.out.println(1 + 2 +  "3");
		System.out.println("3" + 1 + 2 );
		
		Thread t = new Thread();
		t.yield();
		
		//t.sleep(1000);
		//t.join();
		//t.wait();
		
		String str1 = "a", str2 = "b", str3 = "c";
		String str4 = "a", str5 = "b", str6 = "c";
		
		System.out.println(  (str1 + str2 + str3).equals( str4 + str5 + str6 )      );
		
		Map map ;
		System.out.println(  "hello world".compareTo("Hello world")  );
		
		boolean flag = false;
		int i = 0;
		switch(i){
		   
		}
		
		double d = 1;
		if(d > .5 ){
			
		}
		
		//System.out.println(null + null);
		//System.out.println(true + null);
		//System.out.println(null + true);
		int x = 0;
		switch (x){
		case 3:
		case 1:
		case 2:
			
		}
		
		System.out.println("a " + null);
	}

}
