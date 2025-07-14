package entidades;

public class AtividadeAvaliada {

    public final AtividadeDeclarada atividadeDeclarada;
    public final double horasValidadas;

    public AtividadeAvaliada(AtividadeDeclarada atividadeDeclarada, double horasValidadas) {
        this.atividadeDeclarada = atividadeDeclarada;
        this.horasValidadas = Double.min(horasValidadas, atividadeDeclarada.atividade().limiteMaxHoras());
    }
}