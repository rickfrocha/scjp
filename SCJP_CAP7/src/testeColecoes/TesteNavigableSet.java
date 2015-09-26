package testeColecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteNavigableSet {
	
	public static void main(String[] args) {
		NavigableSet nav = new TreeSet();
		nav.add( new Integer(1) );
		nav.add( new Integer(2) );
		nav.add( new Integer(3) );
		nav.add( new Integer(4) );
		nav.add( new Integer(5) );
		nav.add( new Integer(6) );
		nav.add( new Integer(7) );
		nav.add( new Integer(8) );
		//nav.add( new Integer(9) );
		nav.add( new Integer(10) );
		
		Set subSet = nav.subSet(5, true, 10, true);
		System.out.println(  "nav : " + nav  );
		System.out.println(  "sub: " + subSet  );

		
		//nav.add( new Integer(9) );
		subSet.add( new Integer(9) );
		
		System.out.println(  "nav : " + nav  );
		System.out.println(  "sub: " + subSet  );
		
		
		System.out.println("Navigable FLOOR "+ nav.floor(5));
		System.out.println("Navigable LOWER "+ nav.lower(5));
		
		System.out.println("Navigable CEILLING "+ nav.ceiling(5));
		System.out.println("Navigable LOWER "+ nav.higher(5));
		
		Integer linha;
		while( (linha = (Integer) nav.pollFirst()) != null){
			System.out.println(linha);
		}
		System.out.println("nav count " + nav.size());
		
		//NavigableSet nav2 = new HashSet();      ///HashSet nao implementa NavigableSet
		//NavigableSet nav3 = new LinkedHashSet(); ////NavigableSet nao implementa NavigableSet

	}

}
