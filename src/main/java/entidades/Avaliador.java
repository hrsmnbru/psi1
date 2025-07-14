package entidades;

import java.util.Random;

public class Avaliador {
    private String nome, codigo;

    public Avaliador(String nome) {
        this.nome = nome;
        
        int tamanho = 8;
        Random random = new Random();
        int min = (int) Math.pow(10, tamanho - 1); // 10^(tamanho-1)
        int max = (int) Math.pow(10, tamanho) - 1; // 10^(tamanho) - 1
        int codigo = random.nextInt(max - min + 1) + min;
        this.codigo = Integer.toString(codigo);
    }

    public String codigo() {
        return codigo;
    }
    
    
}