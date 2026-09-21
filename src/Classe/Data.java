package Classe;

public class Data {

    int dia;
    int mes;
    int ano;

    public void imprimirData() {
        System.out.println(this.dia + "/" + mes + "/" + ano);

    }

    Data () {
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970);
    }
    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}
