package br.lucascunha.arquivos.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
public class Arquivo {

	public BufferedReader ler (String arquivo) throws IOException {
		InputStream fis = new FileInputStream(arquivo);
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		return br;
	}
	
	public void criar(String arquivo) throws IOException {
		FileOutputStream fos = new FileOutputStream(arquivo);
	}

	public BufferedWriter escrever(String arquivo) throws IOException {
		FileOutputStream fos = new FileOutputStream(arquivo);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		return bw;
	}

	public void copiar(String arquivo1, String arquivo2) throws IOException {
		BufferedReader br = this.ler(arquivo1);
		BufferedWriter bw = this.escrever(arquivo2);
		
		String linha = br.readLine();
		
		while( !(linha == null || linha.isEmpty()) ) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
	
		br.close();
		bw.close();
	}

	public void criarEmMassa(String arquivo) throws IOException {
		BufferedReader br = this.ler(arquivo);		
		
String linha = br.readLine();
		
		while( !(linha == null || linha.isEmpty()) ) {
			this.criar(linha);
			linha = br.readLine();
		}
	
		br.close();
	}
}
