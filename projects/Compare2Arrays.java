package projects;

import java.util.Arrays;

public class Compare2Arrays {
    public static void main(String[] args) {

        int[] list1 = {1,2,3,4};
        int[] list2 = {4,3,2,1};
        System.out.println(compareArrays(list1, list2));

    }
    public static boolean compareArrays(int[] listNum1, int[] listNum2){

        if (listNum1.length == listNum2.length){
            Arrays.sort(listNum1);
            Arrays.sort(listNum2);


            for (int i = 0; i< listNum1.length; i++){

                if (listNum1[i] != listNum2[i]){
                    return false;
                }
            }

            return true;
        }
        return false;
    }

}
