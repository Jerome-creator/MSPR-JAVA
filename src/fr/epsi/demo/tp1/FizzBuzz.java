package fr.epsi.demo.tp1;

public class FizzBuzz {

    public static void main(String... args){

        for(int index=1;index<200;index++){
            if(index%3 == 0 && index%5 == 0){
                System.out.print("FizzBuzz");
            }else if(index % 3 == 0){
                System.out.print("Fizz");
            }else if(index % 5 == 0){
                System.out.print("Buzz");
            }else{
                System.out.print(index);
            }
            System.out.print(" ");

        }
    }
}
