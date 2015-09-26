public class TesteThreadYeld extends Thread {

	public static void main(String[] args) {
		Thread t1 = new TesteThreadYeld("AAA");
	       //t1.setPriority(Thread.MAX_PRIORITY);
	       Thread t2 = new TesteThreadYeld("BBB");
	       //t2.setPriority(Thread.MIN_PRIORITY);
	       t1.start(); t2.start();
	       
	}

	String id = "";

	public TesteThreadYeld(String s) {
		this.id = s;
	}

	public void run() {
		if (id.equals("AAA")) {
			yield();
		}
		System.out.println(id + " End");
	}

}
