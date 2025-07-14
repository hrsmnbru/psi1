package entidades;

import entidades.Aluno;
import entidades.AtividadeDeclarada;
import entidades.Requerimento;
import java.util.ArrayList;
import java.util.List;

public class RequerimentoBuilder {
    private Aluno aluno;
    private List<AtividadeDeclarada> atividadesDeclaradas = new ArrayList<>();
    
    public RequerimentoBuilder setAluno(Aluno aluno) {
        this.aluno = aluno;
        return this;
    }
    
    public RequerimentoBuilder addAtividadeDeclarada(AtividadeDeclarada atividade) {
        this.atividadesDeclaradas.add(atividade);
        return this;
    }
    
    public RequerimentoBuilder setAtividadesDeclaradas(List<AtividadeDeclarada> atividades) {
        this.atividadesDeclaradas = atividades;
        return this;
    }
    
    public Requerimento build() {
        if (aluno == null) {
            throw new IllegalStateException("Aluno é obrigatório para criar um requerimento");
        }
        return new Requerimento(aluno, atividadesDeclaradas);
    }
}