package EqualsHashcode.Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("João", 25);
        pessoas.put("Maria", 32);
        pessoas.put("Pedro", 30);
        pessoas.put("Antonio", 30);

        System.out.println(pessoas.size());
        System.out.println(pessoas.isEmpty());
        System.out.println(pessoas.keySet());
        System.out.println(pessoas.values());
        System.out.println(pessoas.entrySet());
        System.out.println(pessoas.get("Maria"));

        for (String nome : pessoas.keySet()) {
            System.out.println(nome);
        }

        for (Integer idade : pessoas.values()) {
            System.out.println(idade);
        }

        for (Map.Entry<String, Integer> pessoa : pessoas.entrySet()) {
            System.out.println(pessoa.getKey() + " - " + pessoa.getValue());
        }
    }
}
