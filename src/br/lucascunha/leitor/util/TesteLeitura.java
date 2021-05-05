package br.lucascunha.leitor.util;

import java.io.IOException;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		Arquivo arquivo = new Arquivo();
		
		// nome do arquivo
		String arquivo1 = "lista.txt"; 
		String arquivo2 = "copia da lista.txt";
		
		// Apenas cria um arquivo vazio com o nome dado
		arquivo.criar(arquivo2);
		
		// Cria um cópia do arquivo
		arquivo.copiar(arquivo1, arquivo2);
		
		// Cria arquivos a partir de uma lista
		arquivo.criarEmMassa(arquivo1);
		
	}

}
