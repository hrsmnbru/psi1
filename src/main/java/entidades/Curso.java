package entidades;

public class Curso {
    private String nome;
    private int horasComplementares;

    public Curso(String nome, int horasComplementares) {
        this.nome = nome;
        this.horasComplementares = horasComplementares;
    }

    public String curso() {
        return nome;
    }

    public int horasComplementares() {
        return horasComplementares;
    }
}