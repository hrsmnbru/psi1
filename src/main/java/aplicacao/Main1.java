package aplicacao;

import entidades.*;
import util.*;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a matricula do Aluno");
        Aluno aluno = new Aluno(scanner.next());
        
        
        aluno.definirCurso(RepositorioCursos.INSTANCE.cursos().getFirst());

        Menu menu = new Menu();
        List<AtividadeDeclarada> atividadesDeclaradas = menu.mostraMenuERetornaAtividadesDeclaradas();
        
        Requerimento requerimento = new RequerimentoBuilder()
                .setAluno(aluno)
                .setAtividadesDeclaradas(atividadesDeclaradas)
                .build();

        requerimento.atividadesAvaliadas = menu.mostraMenuAvaliadorERetornaAvaliadas(requerimento.atividadesDeclaradas);

        try {
            requerimento.valida();
            System.out.println("Horas validadas com sucesso");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
