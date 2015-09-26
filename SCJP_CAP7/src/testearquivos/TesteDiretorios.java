package testearquivos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TesteDiretorios {
	
	public static void main(String[] args) {
		
		//criando diretorio.
		File f = new File("d:/diretorio_teste/");
		existeArquivo(f);
		f.mkdir();

		existeArquivo(f);
		
		File arquivo = new File(f,"arquivo.txt");
		existeArquivo(arquivo);
		try{
			arquivo.createNewFile();
			FileReader fr = new FileReader(arquivo);
			existeArquivo(arquivo);
			fr.close();
		} catch (IOException e){
			System.out.println("erro " + e.getMessage() );
		}
		existeArquivo(f);
		System.out.println("apagou arquivo.txt? " + arquivo.delete() );
		f.delete();		
		existeArquivo(f);
	}
	
	static void existeArquivo(File f){
		System.out.println("existe arquivo? " + f.exists());
	}

}
