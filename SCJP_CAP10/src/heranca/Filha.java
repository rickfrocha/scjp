package heranca;

import padrao.Pai;

public class Filha extends Pai {
	
	public static void main(String[] args) {
//		new Filha().b;
//		new Pai().a;
//		new Pai().b;
		Filha f = new Filha();
//		new f.Inner();
		
//		System.out.println('b' + new Integer(63));
//		String a = "B" + '10 ' +  10;
//		String b = 'b' + 10;
//		
//		String str = new String("10") + "a";
		String str2 = "a".trim();
		String str3 = ("" + "");
		String str = "a" + new String("10") ;
		
	}
	
	public void calc(){
		System.out.println(b);
		
		String a = "lopes";
		System.out.printf("%s",a);
		
		Object o = new Object();
		try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Inner();
	}
	
	class Inner{
		
	}

}
