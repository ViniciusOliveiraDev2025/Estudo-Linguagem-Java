package EqualsHashcode.Colecoes;

import java.util.Queue;

public class fila {
    public static void main(String[] args) {
        Queue<String> fila = new java.util.LinkedList<>();
        fila.add("Pessoa 1");
        fila.offer("Pessoa 2");
        fila.add("Pessoa 3");
        fila.offer("Pessoa 4");

        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());
        System.out.println();
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

    }
}
