package testeColecoes;

import java.util.Map;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.TreeMap;

public class TesteTreeSet {
	
	static class Pessoa{
		
	}
	
	public static void main(String[] args) {
	   TreeSet treeSet = new TreeSet();
	   treeSet.add( new Pessoa()  );
	   Iterator it = treeSet.iterator();
	   while(it.hasNext()){
		   Pessoa p = (Pessoa) it.next();
		   System.out.println("Pessoa " + p);
	   }
	   System.out.println("ola");
	   
	   
	   TreeMap treeMap = new TreeMap();
	   treeMap.put(new Pessoa(), new Pessoa()  );
	   treeMap.put(new Pessoa(), new Pessoa()  );
	   Iterator it2 = treeMap.entrySet().iterator();
	   while(it2.hasNext()){
		   Map.Entry entry =  (Map.Entry) it2.next();
		   Pessoa p = (Pessoa) entry.getValue();
		   System.out.println("Pessoa " + p);
	   }
	   System.out.println("ola");
	   
	}

}
