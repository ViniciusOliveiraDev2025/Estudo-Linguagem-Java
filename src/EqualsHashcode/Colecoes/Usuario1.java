package EqualsHashcode.Colecoes;

import java.util.Objects;

public class Usuario1 {

    String nome;

    public Usuario1(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario1 usuario1 = (Usuario1) o;
        return Objects.equals(nome, usuario1.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}
