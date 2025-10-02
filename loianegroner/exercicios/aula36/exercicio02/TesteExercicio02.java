package loianegroner.exercicios.aula36.exercicio02;

import java.util.Scanner;
import java.util.Locale;

public class TesteExercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do Curso: ");
        String nomeCurso = sc.nextLine();
        System.out.print("Horário: ");
        String horarioCurso = sc.nextLine();
        System.out.println();

        System.out.println("Digite os dados do Professor: ");
        System.out.print("Nome: " );
        String nomeProfessor = sc.nextLine();
        System.out.print("Departamento: ");
        String departamentoProf = sc.nextLine();
        System.out.print("Email: ");
        String emailProf = sc.nextLine();
        Professor professor = new Professor(nomeProfessor, departamentoProf, emailProf);
        System.out.println();

        System.out.println("Digite os dados dos alunos: ");
        System.out.print("Nome: ");
        String nomeAluno = sc.nextLine();
        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();
        Aluno aluno = new Aluno(nomeAluno, matricula);
        System.out.println("Agora digite as notas dos alunos:");
        for (int i = 0; i < 1; i++) {
            System.out.print("Nota 1: ");
        }

        Curso curso = new Curso(nomeCurso,horarioCurso, professor, aluno);

        System.out.println("\n#####TESTE#####");
        System.out.println(curso.toString());

        sc.close();
    }
}
