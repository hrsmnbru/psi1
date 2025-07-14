package entidades;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCursos {
    public static final RepositorioCursos INSTANCE = new RepositorioCursos();
    private List<Curso> cursos = new ArrayList<>();
    
    private RepositorioCursos() {
        inicializaCursos();
    }
    
    public List<Curso> cursos (){
        return cursos;
    }

    private void inicializaCursos() {
        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas", 100);
        Curso pg = new Curso("Processos Gerenciais", 100);
        Curso se = new Curso("Sistemas Embarcados", 100);
        
        cursos.add(ads);
    }

    public StringBuilder menuCursos() {
            StringBuilder menuCursos = new StringBuilder("==Menu de Cursos==\n");                //adiciona item ao menu
            for (int i = 0; i < cursos.size(); i++) {                                       // monta o menu
                menuCursos.append((i + 1) + " - " + cursos.get(i).curso() + "\n");     //index + 1 resulta no numero correspondente ao menu para o usuario escolher
            }
            menuCursos.append("Escolha o curso: ");
        return menuCursos;
    }        
}