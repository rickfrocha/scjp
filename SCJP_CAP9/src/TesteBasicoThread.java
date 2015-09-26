
public class TesteBasicoThread {
	
	class MyThreadExtends extends Thread{
		public void run(){
			for(int iX = 0; iX < 400; iX++){				
				System.out.println("executando thread " + 
			                       Thread.currentThread().getName() + 
			                       " item " + iX );
			}
		}
	}
	
	class MyTreadImplementsRunnAble implements Runnable{
		private static final int tempo = 500;
		public void run(){
			for(int iX = 0; iX < 400; iX++){				
				System.out.println("executando imp thread " + 
			                       Thread.currentThread().getName() + 
			                       " item " + iX );
			}			
		}
	}
	
	private int a;
	
	private MyThreadExtends ex;
	
	public void teste(){
		synchronized(ex){
			
		}
	}
	
	public static void main(String[] args) {
		TesteBasicoThread.MyTreadImplementsRunnAble imp = new TesteBasicoThread().new MyTreadImplementsRunnAble();

		Thread impX = new Thread(imp);
		impX.setName("ricardo");
		
		Thread impY = new Thread(imp);
		impY.setName("ricardo1");
		impY.start();
		
		try {
			impY.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("cheguei ao fim da linha do main");
		
	}

}
