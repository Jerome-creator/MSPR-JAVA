package fr.epsi.demo.tp2;

import java.util.StringJoiner;

public class StringExample {


    public static int countVowels(String sentence){
        String sentenceLowCase = sentence.toLowerCase();
        char[] vowels = {'a','e','i','o','u', 'y'};
        int count = 0;
        for(int index = 0; index<sentence.length(); index++){
            char c = sentence.charAt(index);
            for(char vowel:vowels){
                if(vowel == c){
                    count++;
                    break;
                }
            }
        }
        /*
        for(char c : sentenceLowCase.toCharArray()){
            for(char vowel:vowels){
                if(vowel == c){
                    count++;
                    break;
                }
            }
        }*/

        //autre solution
        String stringWithoutVowels = sentenceLowCase.replaceAll("a|e|i|o|u|y", "");
        count = sentence.length() - stringWithoutVowels.length();


        return count ;
    }

    public static String replaceEachFirstLetter(String sentence){
        String[] strings = sentence.split(" ");
       StringBuilder builder = new StringBuilder();
        for(String st :strings){
            builder.append(st.substring(0,1).toUpperCase()+ st.substring(1)).append(" ");
        }

        return builder.toString();

        /*
        StringJoiner joiner = new StringJoiner(" ");
        for(String st :strings){
            joiner.add(st.substring(0,1).toUpperCase()+ st.substring(1));
        }

        return joiner.toString();
*/

    }

    public static void main(String ... args){

        System.out.println(countVowels("Combien y a-t-il de voyelles ? "));
        System.out.println(replaceEachFirstLetter("Combien y a-t-il de voyelles ? "));

        String s =  "Java C'est sympa";

        String ret = s.replace("Java" , "JavaScript");

        String retUppercase = s.toUpperCase();



       // System.out.println(s);
        // System.out.println(ret);
        //System.out.println(retUppercase);


        StringBuilder builder = new StringBuilder();
        builder.append("Java")
                .append(" ")
                .append("C'est")
                .append(" ").append("sympa");

       // System.out.println(builder.toString());




    }
}
