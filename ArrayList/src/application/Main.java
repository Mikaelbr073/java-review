package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Mikael");
        list.add("Luis");
        list.add("Matheus");
        list.add("Jão");
        list.add(1, "Lucas");
        System.out.println(list);
        //old list
        list.removeIf(x -> x.charAt(0) == 'L');

        for(String nome: list){
            System.out.println(nome);
        }
        // list update
        System.out.println(list.size());

        // creating new list with filter
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        System.out.println(result);


        // find the first word start letter M
        String name = result.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);




    }
}

