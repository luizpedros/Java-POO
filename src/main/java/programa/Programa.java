package programa;

import classes.Conta;

public class Programa {
    public static void main(String[] args){
       Conta cliente01 = new Conta();

       cliente01.abriConta("CC");
       cliente01.setNumConta(2002);
       cliente01.setDono("Euzebia");

       Conta cliente02 = new Conta();
       cliente02.abriConta("CP");
       cliente02.setNumConta(2003);
       cliente02.setDono("Julielo");
       cliente02.sacar(50);


       cliente01.estadoAtual();
       cliente02.estadoAtual();

    }
}
