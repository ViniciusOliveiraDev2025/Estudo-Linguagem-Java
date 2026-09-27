package EqualsHashcode.Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario1> lista = new ArrayList<>();

        Usuario1 u1 = new Usuario1("Alice");

        lista.add(u1);
        lista.add(new Usuario1("Bob"));
        lista.add(new Usuario1("Carlos"));
        lista.add(new Usuario1("Dave"));

        for (Usuario1 u : lista) {
            System.out.println(u.nome);
        }
        System.out.println(lista.get(3).nome);


    }
}
