
public class TesteSynchronized {

	class MyThread extends Thread{
		
		TesteSynchronized controle;
		
		public MyThread(TesteSynchronized teste) {
			this.controle = teste;
		}
		
		public void run(){
			for(int ix = 0; ix < 500; ix++){
			   controle.decrement();
			}
		}
	}

	
	private Integer contador = 1000;
	
	public void decrement(){		
		synchronized(contador){
			if(contador.intValue() <= 0){
				System.out.println("chegou ao fim.. sem decrementar.");
				return;
			}		
			contador--;
			System.out.println("decrement executado. Valor: "+ contador + " thread: "+ Thread.currentThread().getName());
			try{
			   //Thread.sleep(500);
			} catch (Exception e){
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		TesteSynchronized controle = new TesteSynchronized();
		
		TesteSynchronized.MyThread tarefa = new TesteSynchronized().new MyThread(controle);
		
		Thread t1 = new Thread(tarefa);
		Thread t2 = new Thread(tarefa);
		
		t1.start();
		t2.start();
	}

}
