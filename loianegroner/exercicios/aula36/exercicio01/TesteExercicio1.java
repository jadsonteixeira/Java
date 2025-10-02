package loianegroner.exercicios.aula36.exercicio01;

import java.util.Scanner;
import java.util.Locale;

public class TesteExercicio1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da Agenda: ");
        String nomeAgenda = sc.nextLine();
        Agenda agenda = new Agenda();
        agenda.setNome(nomeAgenda);

        Contato contato;
        Contato[] contatos = new Contato[2];

        System.out.println("Adiciona contato na agenda");
        for (int i = 0; i < contatos.length; i++) {
            contato = new Contato();
            System.out.println("Contato " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            contato.setNome(nome);
            System.out.print("Telefone: ");
            String telefone = sc.nextLine();
            contato.setTelefone(telefone);
            System.out.print("Email: ");
            String email = sc.nextLine();
            contato.setEmail(email);
            contatos[i] = contato;
        }
        System.out.println();

        System.out.println("Nome da Agenda: " + agenda.getNome());

        System.out.println();
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Contato " + (i + 1));
            System.out.println("Nome: " + contatos[i].getNome());
            System.out.println("Telefone: " + contatos[i].getTelefone());
            System.out.println("Email: " + contatos[i].getEmail());
            System.out.println();
        }

        sc.close();
    }
}
