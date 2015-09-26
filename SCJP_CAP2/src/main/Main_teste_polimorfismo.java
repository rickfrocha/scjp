package main;
import Bixos.Macaco;
import Bixos_outro_pcte.Leao;


public class Main_teste_polimorfismo {
	
	public static void main(String[] args) {
		
		/* TESTE DE POLIFORMISMO, VERIFICAR QUAL METODO É EXECUTADO */
	    Animal animal = new Macaco();
	    imprimirAnimal(animal);
	    
	    
	    Animal animal2 = new Leao();
	    System.out.println( animal2.teste() );
	}
	
	public static void imprimirAnimal(Animal animal){
	    //animal.a = "abcd";
		System.out.println("Valor de animal a "+ animal.a);
	}
	
	/**
	 * 1 - Eu posso declarar uma variavel "a" na classe Animal e uma variavel "a" na classe macaco. Sao variaveis diferentes, nao existe sobrescrita de variaveis nem metodos static.
	 *     Se eu tiver um metodo imprimirAnimal(Animal a), instanciar uma classe Macaco e atribuir á uma variavel Animal
	 *     quando eu imprimir saira o valor da classe receptora, isso é, animal.
	 *     
	 * 2 - Eu posso Atribuir uma classe Macaco numa variavel Animal ==> Animal a = new Macaco(); O inverso nao é verdade.      
	 * 3 - Se eu fazer polimorfismo numa classe Macaco atribuindo a uma classe Animal, e macaco sobrescrever um metodo de animal,
	 *     ao invocar animal.imprimirMetodoSobrescrito() devera ser invocado metodo sobrescrito da classe filha, embora, esteja
	 *     usando uma variavel do tipo da classe mae. 
	 */
	

}
