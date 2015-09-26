package testearquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TesteCriacaoArquivos {
	
	public static void main(String[] args) {
		File f = new File("d:/meu_arquivo.txt");
		verificaExiste(f);
		System.out.println("apagar arquivo? " + apagarArquivo(f));
		
		try{
		   FileWriter fw = new FileWriter(f);
		   verificaExiste(f);
		   
		   
		   fw.write("teste arquivo escrito....");
		   
		   fw.close();
		   
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	static void verificaExiste(File f){
		System.out.println("existe arquivo " + f.exists());
	}
	
	static boolean apagarArquivo(File f){
		return f.delete();
	}

}
