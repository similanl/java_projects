package projects;

public class CheckOrderOfSymbols {
    public static void main(String[] args) {
        //check if (){}[] are in order

    }

    public static String solution(String str){
        str = str.trim();
        String newStr = "";
        for (String each: str.split("")){
            if (each.equals("(")){
                newStr += "(";
            }else if(each.equals(")")){
                newStr += "(";
            }else if(each.equals("[")){
                newStr += "(";
            } else if(each.equals("]")){
                newStr += "(";
            }else if(each.equals("{")){
                newStr += "(";
            }else if(each.equals("}")){
                newStr += "(";
            }
        }



    return "";
    }

}
