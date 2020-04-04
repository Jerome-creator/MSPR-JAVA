package fr.epsi.demo.tp1;

import java.util.Scanner;

public class Franchise {

    private final static int PLAFOND = 300;

    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vos dommages  : ");
        double dommage = sc.nextDouble();

        System.out.println("Dommages : " + dommage);


        // Version if
        double franchise;
        if(dommage * 0.2 < PLAFOND){
            franchise = dommage * 0.2;
        }else{
            franchise = PLAFOND;
        }


        //version ternaire
        franchise = dommage * 0.2 < PLAFOND ? dommage * 0.2 : PLAFOND;

        System.out.println("Montant de la franchise : " + franchise);
        System.out.println("Montant remboursé :" + (dommage - franchise));


    }
}
