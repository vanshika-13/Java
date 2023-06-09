package Recursion;

public class StringStar {

    // Using Stack Building Approach
    static void stringStar(StringBuilder targetString , int start , int end ){

        if(targetString.length() <= end){
            System.out.println("Updated : "+targetString);
            return;
        }

        if(targetString.charAt(start) == targetString.charAt(end)){
            targetString.insert(end,"*");            
        }

        if(targetString.charAt(start) != targetString.charAt(end) && targetString.charAt(end) != '*'){
            start = end;
            end -=1;            
        }

        stringStar(targetString, start, end+2);
        return;
    }


    public static void main(String[] args) {
        StringBuilder targetStringBuilder = new StringBuilder("aaabbbccc");
        System.out.println("original : "+targetStringBuilder);
        stringStar(targetStringBuilder, 0, 1);
    }
}
