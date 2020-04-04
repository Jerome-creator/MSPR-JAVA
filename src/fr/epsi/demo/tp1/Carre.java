package fr.epsi.demo.tp1;

import java.util.Scanner;

public class Carre {

    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Taille du carré :");
        short size = sc.nextShort();


        for(int row = 0; row < size; row++){

            for(int col = 0; col < size; col++){
                System.out.print("# ");
            }
            System.out.println("");
        }



    }
}
