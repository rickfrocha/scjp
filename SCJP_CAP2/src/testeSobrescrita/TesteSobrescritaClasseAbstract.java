package testeSobrescrita;



public class TesteSobrescritaClasseAbstract {
	
	public static void main(String[] args) {
		A a = new B();
		TesteSobrescritaClasseAbstract t = new TesteSobrescritaClasseAbstract();
		if(t instanceof Run) System.out.println("teste");
	}

}

interface Run{}

abstract class A implements Run{
    protected abstract void metodo();  	
}

class B extends A{
	//protected void metodo(){}
	public void metodo(){}
	
	public void teste(){
		int z = 0;
		lbl:
		z++;
		for(;;){
			if(true) break lbl;
		}
	}
}

