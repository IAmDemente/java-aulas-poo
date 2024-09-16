package br.sesi.gfd.file;

import java.io.IOException;

public class MainFile {
    public static void main(String args []) throws IOException {
        String path = "C:\\Gustavo Fernandes 3° DS\\Java\\java-aulas-poo\\file.txt";
        ManipuladorArquivo arquivo = new ManipuladorArquivo();
        arquivo.leitor(path);
    }
}
