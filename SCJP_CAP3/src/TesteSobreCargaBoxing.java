public class TesteSobreCargaBoxing {

	public void metodo(Integer integer) {
		System.out.println("Integer Method Called");
	}

	public void metodo(Byte b) {
		System.out.println("Byte Method Called");
	}
	
	public static void main(String[] args) {
		byte b = 10;  
        byte c = 15;  
        Byte d = 10;
  
        new TesteSobreCargaBoxing().metodo(b);
        new TesteSobreCargaBoxing().metodo((byte) b+c);   
        new TesteSobreCargaBoxing().metodo(b += c);  
        new TesteSobreCargaBoxing().metodo(c++);  
        new TesteSobreCargaBoxing().metodo(b+c);
        new TesteSobreCargaBoxing().metodo(d+c);
	}

}
