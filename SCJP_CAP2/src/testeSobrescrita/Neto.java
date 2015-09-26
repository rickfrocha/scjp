package testeSobrescrita;

public class Neto extends Filho {
	
	public void metodoTres(){
		//System.out.println("executou neto");
		( (Pai) this).metodoTres();
	}
	
	
	public static void main(String[] args) {
		Neto n = new Neto();
		n.metodoTres();
	}

}
