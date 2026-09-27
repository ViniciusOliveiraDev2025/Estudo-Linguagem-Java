package EqualsHashcode;

public class TesteEquals {

    public class TesteEqualsHashcode {
        public static void main(String[] args) {
            Usuario u1 = new Usuario();
            u1.nome = "Rodrigo";
            u1.email = "teste@gmail.com";

            Usuario u2 = new Usuario();
            u2.nome = "Rodrigo";
            u2.email = "teste@gmail.com";

            System.out.println(u1 == u2);
            System.out.println(u1.equals(u2));
            System.out.println(u2.equals(u1));
        }
    }

}
