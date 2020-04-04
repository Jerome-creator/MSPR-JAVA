package fr.epsi.demo.tp1;

import java.util.Random;
import java.util.Scanner;


public class TableFinder {



    public static void main(String... args) {
        int[] arr = new int[10];

        for(int index=0;index<arr.length;index++){
            arr[index] = index+1;
        }

        int sum = 0;
        for(int val : arr){
            sum += val;
        }

        System.out.println(sum);
        System.out.println("Formule : " + 10 *(10+1)/2);


        Random random = new Random();




        for(int index=0;index<arr.length;index++){
            arr[index] = random.nextInt();
        }

        System.out.print("Saisissez une valeur : ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        boolean found = false;
        int index;
        for(index=0;index<arr.length && !found;index++){
            System.out.println(arr[index]);
            if(arr[index] == value){
                found=true;
            };
        }

        if(found){
            System.out.println("Valeur trouvee à l'index " + (index-1) );
        }else{
            System.out.println("Valeur non trouvée");
        }
    }
}
