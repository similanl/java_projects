package projects;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfWords {

        public static void main(String[] args) {

            String str = "Geeks For Geeks";
            System.out.println(checkFrequency(str));


        }
        public static String checkFrequency(String str){

            str= str.trim();
            String info = "";

            if (!str.isEmpty()){ // Firstly, I check if String is empty or not if not it will go in this condition

                ArrayList<String> list = new ArrayList<>(); // I declare an arraylist so I can store String in here

                for (String each: str.split(" ")){ // I use for each loop to split each word into my arraylist by using split method
                    list.add(each); // here I use add method to add each word into my arraylist list
                }

                for (String each: list){ // I run another for each loop to check the frequency of each word for my arraylist list
                    if (info.contains(each)){ // if my info String already have a word in there I WONT ADD THE WORD

                    }else{
                        info += each + "" + Collections.frequency(list, each) + " "; // If my info String doesnt have each word in there I add the word and the frequency of each word
                    }

                }

            }else{
                return "NO FREQUENCY";
            }

            return info; // i return whatever I have in my String info
        }
    }

