package entidades;

import util.*;
import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    public static final Repositorio INSTANCE = new Repositorio(); //aqui esta sendo utilizado o padrao Singleton
    private List<Modalidade> modalidades = new ArrayList<>(4);
    private List<AtividadeDeclarada> atividadeDeclaradas = new ArrayList<>();
    //atividades avaliadas
    
    private Repositorio() {
        inicializarAtividadesExtensao();
        inicializarAtividadesComplementacao();
        inicializarAtividadesEnsino();
        inicializarAtividadesPesquisaEIinovacao();
    }

    public void addAtividadeDeclarada(AtividadeDeclarada atividadeDeclarada) {
        atividadeDeclaradas.add(atividadeDeclarada);
    }

    public List<AtividadeDeclarada> atividadesDeclaradas() {
        return atividadeDeclaradas;
    }

    public List<Modalidade> modalidades() {
        return modalidades;
    }
    
    private void inicializarAtividadesEnsino() {
        Modalidade ensino = new Modalidade("Ensino", 40);
        ensino.addAtividade(new Atividade("Disciplinas cursadas com aproveitamento, não previstas no currículo do curso", 80));
        ensino.addAtividade(new Atividade("Semana acadêmica dos cursos, quando não obrigatória", 40));
        ensino.addAtividade(new Atividade("Participação em atividades de monitoria", 70));
        ensino.addAtividade(new Atividade("Atividades realizadas em laboratórios e/ou oficinas do Instituto", 40));
        ensino.addAtividade(new Atividade("Visita Técnica relacionada à área", 40));
        ensino.addAtividade(new Atividade("Participação em cursos de qualificação na área afim do curso com certificado de aproveitamento", 80));
        ensino.addAtividade(new Atividade("Participação como ouvintes em bancas de projetos integradores de assuntos relacionados à área", 20));
        ensino.addAtividade(new Atividade("Participação como ouvintes em bancas de TCC, dissertações ou teses de assuntos relacionados à área", 20));
        ensino.addAtividade(new Atividade("Desenvolvimento de material didático ou instrucional", 30));
        ensino.addAtividade(new Atividade("Instrutor de cursos abertos à comunidade", 70));
        modalidades.add(ensino);
    }
    private void inicializarAtividadesExtensao() {
        Modalidade extensao = new Modalidade("Extensao", 40);
        extensao.addAtividade(new Atividade("Participação em programa ou projeto de extensão", 60));
        extensao.addAtividade(new Atividade("Apresentação de projeto de extensão", 20));
        extensao.addAtividade(new Atividade("Participação em ações sociais cívicas e comunitárias", 40));
        extensao.addAtividade(new Atividade("Texto em jornal ou revista da área", 40));
        extensao.addAtividade(new Atividade("Intercâmbio com instituições de ensino no Brasil ou no exterior", 100));
        extensao.addAtividade(new Atividade("Estágio não-obrigatório na área do curso, formalizado pelo IFSC", 100));
        extensao.addAtividade(new Atividade("Exercício profissional com vínculo empregatício, desde que na área do curso", 100));
        modalidades.add(extensao);
    }

    private void inicializarAtividadesPesquisaEIinovacao() {
        Modalidade pesquisaEInovacao = new Modalidade("Pesquisa e invoação", 40);
        pesquisaEInovacao.addAtividade(new Atividade("Participação em programa ou projeto de pesquisa relacionados à área", 60));
        pesquisaEInovacao.addAtividade(new Atividade("Apresentação de projeto de pesquisa relacionado à área", 20));
        pesquisaEInovacao.addAtividade(new Atividade("Autoria ou coautoria em artigo publicado em Periódico da área afim", 30));
        pesquisaEInovacao.addAtividade(new Atividade("Livro na área afim", 100));
        pesquisaEInovacao.addAtividade(new Atividade("Capítulo de livro na área afim", 30));
        pesquisaEInovacao.addAtividade(new Atividade("Publicação em Anais de Evento Técnico Científico", 30));
        pesquisaEInovacao.addAtividade(new Atividade("Apresentação de trabalho em Evento Técnico Científico", 20));
        pesquisaEInovacao.addAtividade(new Atividade("Participação de Programa de Iniciação Científica", 60));
        pesquisaEInovacao.addAtividade(new Atividade("Participação como palestrante, conferencista, integrante de mesa-redonda, ministrante de mini-curso em evento científico", 60));
        pesquisaEInovacao.addAtividade(new Atividade("Prêmios concedidos por instituições acadêmicas, científicas e profissionais", 60));
        pesquisaEInovacao.addAtividade(new Atividade("Participação na criação de Produto ou Processo Tecnológico com propriedade intelectual registrada", 200));
        pesquisaEInovacao.addAtividade(new Atividade("Participação em grupo de pesquisa na área", 60));
        modalidades.add(pesquisaEInovacao);
    }
    private void inicializarAtividadesComplementacao() {
        Modalidade complementacao = new Modalidade("Complementação", 40);
        complementacao.addAtividade(new Atividade("Participação em congressos, jornadas, simpósios, fóruns, seminários, encontros, palestras, festivais e similares, com certificado de aproveitamento e/ou frequência", 20));
        complementacao.addAtividade(new Atividade("Comissão organizadora de congressos, jornadas, simpósios, fóruns, seminários, encontros, palestras, festivais e similares", 20));
        complementacao.addAtividade(new Atividade("Premiação em eventos que tenham relação com os objetos de estudo do curso", 30));
        complementacao.addAtividade(new Atividade("Curso de língua estrangeira", 80));
        complementacao.addAtividade(new Atividade("Premiação em atividades esportivas como representante do Instituto", 60));
        complementacao.addAtividade(new Atividade("Representação estudantil em colegiado, grêmio estudantil, centro acadêmico, comissão de formatura, associação esportiva e afins", 40));
        complementacao.addAtividade(new Atividade("Representação de turma (inclui a participação em conselhos de classe)", 30));
        complementacao.addAtividade(new Atividade("Participação em Empresa Júnior", 40));
        complementacao.addAtividade(new Atividade("Classificação em concursos culturais", 20));
        complementacao.addAtividade(new Atividade("Participação em projetos sociais, trabalho voluntário em entidades vinculadas a compromissos sociopolíticos", 20));
        complementacao.addAtividade(new Atividade("Desenvolvimento de atividades socioculturais, artísticas e esportivas (coral, música, dança, bandas, vídeos, cinema, cineclubes, teatro, campeonatos esportivos etc)", 20));
        modalidades.add(complementacao);
    }
    
    public StringBuilder menuModalidades(){
        StringBuilder menuModalidades = new StringBuilder("==Menu de Modalidades==\n");                //adiciona item ao menu
        for (int i = 0; i < modalidades.size(); i++) {                                       // monta o menu
            menuModalidades.append(i + 1 + " - " + modalidades.get(i).getNome() + "\n");     //index + 1 resulta no numero correspondente ao menu para o usuario escolher
        }
        menuModalidades.append("0 - Finalizar e emitir parecer.\nEscolha uma das opções");
        
        return menuModalidades;
        
    }
}