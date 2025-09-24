package nelioalves.section10.list;

import java.util.ArrayList;
import java.util.List;

public class IndexOf {

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

        System.out.println("Index of Teixeira: " + list.indexOf("Teixeira"));
    }
}
