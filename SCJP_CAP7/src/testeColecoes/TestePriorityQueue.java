package testeColecoes;

import java.util.PriorityQueue;

import java.util.Collections;
import java.util.Queue;

public class TestePriorityQueue {
	
	static class A{
		
	}
	
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.add( 1 );
		pq.add( 2 );
		pq.add( 7 );
		pq.add( 9 );
		pq.add( 3 );
		pq.add( 8 );
		pq.add( 4 );
		pq.add( 10 );
		pq.offer( 6 );
		pq.offer(5);
		Integer i ;

		//PEGA ITEM DE MAIOR PRIORIDADE NA FILA, SEM REMOVE-LO
		while(  (i = (Integer) pq.poll()) != null ){
			System.out.println("valor de i --> " + i);
		}

		System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.");
		
		
		//PEGA ITEM DE MAIOR PRIORIDADE NA FILA, REMOVENDO		
		while(  (i = (Integer) pq.poll()) != null ){
			System.out.println("valor de i --> " + i);
		}
		System.out.println("tamanho da fila " + pq.size());
		
		Queue pq2 = new PriorityQueue();
		pq.offer( new A() );
		//pq.offer( new A() );
		//pq.offer( new A() );
		System.out.println("tamanho da fila " + pq2.size());
		
		Object obj = String.class;
		
		int iv %= 10;
	}
	
	void crazyLoop()
	{
		int c = 0;
		JACK: while (c < 8)
		{	
			JILL: System.out.println(c);
			if (c > 3) break JACK; else c++;
		}
	}

}
