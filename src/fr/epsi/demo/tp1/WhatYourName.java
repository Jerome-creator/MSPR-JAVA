package fr.epsi.demo.tp1;

import java.util.Scanner;

public class WhatYourName {

    public static  void main(String... args){
        System.out.print("Votre Nom : ");

        //Création d'une instance de scanner
        Scanner sc = new Scanner(System.in);

        //récupération du nom dans la variable name
        var name = sc.next();

        //Affichage du nom
        System.out.println("Vous vous appelez : " + name);

        // demande de l'age
        System.out.print("Votre age : ");
        int age = sc.nextInt();

        //version if
        if(age < 18){
            System.out.println("Vous etes mineur");
        }else{
            System.out.println("Vous etes majeur");
        }

        // version ternaire
        String result = age < 18 ? "Vous etes mineur" : "Vous etes majeur";
        System.out.println(result);
    }
}
