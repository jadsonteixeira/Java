package nelioalves.section10.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

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
        System.out.println("-----------------");

        System.out.println("Nomes que começam com J: ");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("-----------------");

        // encontrando o primeiro elemento que começa com determinada letra
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println("Nome: " + name);
    }
}

// stream() aceita operações com expressões lambda

// findFirst() pega o primeiro elemento da lista que atenda ao predicado passado
