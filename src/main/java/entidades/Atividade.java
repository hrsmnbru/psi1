package entidades;

public class Atividade {
    private String descricao;
    private int limiteMaxHoras;
    private Modalidade modalidade;

    public Atividade(String descricao, int limiteMaxHoras) {
        this.descricao = descricao;
        this.limiteMaxHoras = limiteMaxHoras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    public Modalidade modalidade() {
        return modalidade;
    }
    
    public double percentualMaximo() {
        return modalidade.percentualMaximo();
    }

    public int limiteMaxHoras() {
        return limiteMaxHoras;
    }
}