package EqualsHashcode.Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> Livros = new ArrayDeque<>();

        Livros.add("Livro1");
        Livros.push("Livro2");
        Livros.push("Livro3");

        System.out.println(Livros.peek());
        System.out.println(Livros.element());
        System.out.println();

        for (String l: Livros) {
            System.out.println(l);
        }

        System.out.println();
        System.out.println(Livros.pop());
        System.out.println(Livros.pop());
        System.out.println(Livros.pop());
        System.out.println(Livros.remove());
    }
}
