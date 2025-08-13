package metodos;

import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            String resultadoValidacao = validarSenha(senha);

            if (resultadoValidacao.isEmpty()) {
                System.out.println("Senha aceita!");
                break;
            } else {
                System.out.println("Senha inválida. Verifique os seguintes erros: ");
                System.out.println(resultadoValidacao);
            }
        }

        sc.close();
    }

    private static String validarSenha(String senha) {
        StringBuilder erros = new StringBuilder(); // evita que você fique concatenando vários objetos do tipo String

        if (!temTamanhoValido(senha)) {
            erros.append("A senha deve ter no mínimo 8 caracteres\n");
        }

        if (!temLetraMaiuscula(senha)) {
            erros.append("A senha deve conter pelo menos uma letra maiuscula\n");
        }

        if (!temNumero(senha)) {
            erros.append("A senha deve conter pelo menos um número");
        }

        if (!temCaractereEspecial(senha)) {
            erros.append("A senha deve conter pelo menos um caractere especial");
        }
        return erros.toString();
    }

    private static boolean temTamanhoValido(String senha) {
        return senha.length() >= 8;
    }

    private static boolean temLetraMaiuscula(String senha) {
        for (char c : senha.toCharArray()) { // retorna um vetor de char da senha
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean temNumero(String senha) {
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean temCaractereEspecial(String senha) {boolean temCaractereEspecial = false;
        String especial = "!@#$%^&*()_+=-{}[]|:;<>,.?/~`";
        for (char c : senha.toCharArray()) {
            if (especial.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}
