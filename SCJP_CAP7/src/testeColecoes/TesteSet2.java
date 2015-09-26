package testeColecoes;

import java.util.HashSet;
import java.util.Set;



public class TesteSet2 {
	
	static class A{
		public String a;
		
		public int hashCode(){
			return 13;
		}
		
		public boolean equals(Object o){
			return false;
		}
	}
	public static void main(String[] args) {
		
		//TESTE COM INTEIRO ===> HASHCODE SOBRESCRITO
		Set set = new HashSet();
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Integer i3 = new Integer(1);
		
		set.add(i1); set.add(i2); set.add(i3);
		
		System.out.println("count " + set.size() );
		set.remove(new Integer(1));
		
		System.out.println("count " + set.size() );	
		
		//TESTE COM CLASSE A - sem hash code sobrescrito
		set.clear();		
		A a1 = new A(); A a2 = new A(); A a3 = new A();
		set.add(a1); set.add(a2); set.add(a3);
		System.out.println("count " + set.size() + " " + set );		
		
		//a1 = new A(); 
		a1.a="dadasdada";
		set.remove(a1);
		
		System.out.println("count " + set.size() + " " + set);
	}

}
