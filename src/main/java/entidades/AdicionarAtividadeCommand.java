package entidades;

import entidades.AtividadeDeclarada;
import java.util.List;

public class AdicionarAtividadeCommand implements MenuCommand {
    private AtividadeDeclarada atividade;
    private List<AtividadeDeclarada> lista;
    
    public AdicionarAtividadeCommand(AtividadeDeclarada atividade, List<AtividadeDeclarada> lista) {
        this.atividade = atividade;
        this.lista = lista;
    }
    
    @Override
    public void executar() {
        lista.add(atividade);
        System.out.println("Atividade adicionada: " + atividade.descricao());
    }
}