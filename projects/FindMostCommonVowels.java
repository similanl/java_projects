package projects;

import java.util.Arrays;

public class FindMostCommonVowels {
    public static void main(String[] args) {
        //find the most common vowel(s)
        String s = "summer is here, I want to go to the beachoo";
        System.out.println(solution(s));
        //america


    }

    public static String solution(String s){

        int a = 0, e = 0, i = 0, o = 0, u = 0;


        for (String each: s.split("")){
            if (each.equalsIgnoreCase("a")){
                a++;
            } else if (each.equalsIgnoreCase("e")) {
                e++;
            } else if (each.equalsIgnoreCase("i")) {
                i++;
            } else if (each.equalsIgnoreCase("o")) {
                o++;
            } else if (each.equalsIgnoreCase("u")) {
                u++;
            }
        }

        int highestNum = 0;

        int [] list = {a, e, i, o, u}; // 2,5,2,3,1

        System.out.println(Arrays.toString(list));

        for (int b = 0; b < list.length ; b++ ){
            if (list[b] > highestNum){
                highestNum = list[b];
            }
        }

        System.out.println(highestNum);

        String info = "";
        if(a==highestNum){
            info += " a appear " + a + " time";
        }if(e == highestNum){
            info += " e appear " + e + " time";
        }if(i == highestNum){
            info += " i appear " + i + " time";
        }if(o == highestNum){
            info += " o appear " + o + " time";
        }if(u == highestNum){
            info += " u appear " + u + " time";
        }

        return info;
    }
}

