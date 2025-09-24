package nelioalves.section10.list;

import java.util.List;
import java.util.ArrayList;

public class Remove {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Jadson");
        list.add("Jhadyson");
        list.add("Teixeira");
        list.add("Martins");
        list.add(4, "Canadá");

        System.out.println("Tamanho da lista: " + list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------");

        // remove fazendo uma comparação
        list.remove("Martins");

        // remove pelo indice
        list.remove(3);

        // função lambda (predicado)
        // pega um elemento x tal que x inicia com 'J', isso retorna um true ou false
        list.removeIf(x -> x.charAt(0) == 'J');

        for (String x : list) {
            System.out.println(x);
        }

    }
}
