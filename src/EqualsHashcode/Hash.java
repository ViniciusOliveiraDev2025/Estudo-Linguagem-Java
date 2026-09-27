package EqualsHashcode;

import EqualsHashcode.Colecoes.Usuario1;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario1> usuarios = new HashSet<>();

        usuarios.add(new Usuario1("Rodrigo"));
        usuarios.add(new Usuario1("Pedro"));
        usuarios.add(new Usuario1("Antonio"));

        // Testando se o HashSet contém um usuário
        boolean resultado = usuarios.contains(new Usuario1("Rodrigo"));
        System.out.println(resultado);

        // Testando com um nome que não está na coleção
        boolean resultado2 = usuarios.contains(new Usuario1("Outro"));
        System.out.println(resultado2);
    }
}
