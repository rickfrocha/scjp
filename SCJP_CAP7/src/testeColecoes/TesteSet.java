package testeColecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
	
	
	static Set<String>  hashSetString = new HashSet<String>();
	static Set<Integer> hashSetInteger = new HashSet<Integer>();
	
	static Set<Integer> treeSetInteger = new TreeSet<Integer>();
	static Set<String>  treeSetString  = new TreeSet<String>();
	
	public static void main(String[] args) {
			
//		    //NAO TEM ORDENACAO DEFINIDA, ira ordenar de acordo com o hash/equals. É essencial ter o metodo hash implementado.
//		    hashSetString.add("A");
//			hashSetString.add("C");
//			hashSetString.add("F");
//			hashSetString.add("B");
//			hashSetString.add("E");
//			hashSetString.add("D");
//	        System.out.println(hashSetString);
//	     
//	        hashSetInteger.clear();
//	        hashSetInteger.add(6);
//	        hashSetInteger.add(7);
//	        hashSetInteger.add(4);
//	        hashSetInteger.add(3);
//	        hashSetInteger.add(0);
//	        hashSetInteger.add(2);
//	        System.out.println(hashSetInteger);
//	        
//	        //ORDENADO POR PADRAO.
//	        treeSetInteger.add(5);
//	        treeSetInteger.add(7);
//	        treeSetInteger.add(4);
//	        treeSetInteger.add(1);
//	        treeSetInteger.add(2);
//	        System.out.println(treeSetInteger);
//	        
//	        treeSetString.clear();
//	        treeSetString.add("G");
//	        treeSetString.add("A");
//	        treeSetString.add("C");
//	        treeSetString.add("B");
//	        treeSetString.add("F");
//	        System.out.println(treeSetString);
//	        
//	        TreeSet testeClasseOrdenada = new TreeSet();
//	        testeClasseOrdenada.add(  new ATeste("Ricardo") );
//	        testeClasseOrdenada.add(  new ATeste("Amanda") );
//	    //    testeClasseOrdenada.add(  new ATeste("Juliana") );
//	        System.out.println(testeClasseOrdenada);
	        
	        
	        Integer n1 = new Integer(200);
	        Set set = new HashSet();
	        set.add(n1);
	        System.out.println("existe " + set.contains(n1));
	        
	        n1 = new Integer(300); 
	        System.out.println("existe " + set.contains(n1));
	        
	        n1 = new Integer(200);
	        System.out.println("existe " + set.contains(n1));
	        
	        Integer n2 = new Integer(200);
	        List list = new ArrayList();
	        list.add(n2);
	        System.out.println("existe " + list.contains(n2));
	        
	        n2 = new Integer(300); 
	        System.out.println("existe " + list.contains(n2));
	        
	        n2 = new Integer(200);
	        System.out.println("existe " + list.contains(n2));
	        
	        
	        
	}

}

class ATeste{
	
	private String nome;
	
	ATeste(String aNome){
		this.nome = aNome;
	}
	public String toString(){
		return nome;
	}
}
