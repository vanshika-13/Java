package Recursion;

public class StringHash {
    // Using Stack Building Approach
    static void stringHashing(StringBuilder targetString , int start , int end ){

        if(targetString.length() == end){
            System.out.println("Updated : "+targetString);
            return;
        }

        if(targetString.charAt(start) == targetString.charAt(end)){
            targetString.replace(end,end+1,"#");            
        }

        if(targetString.charAt(start) != targetString.charAt(end) && targetString.charAt(end) != '#'){
            start = end;            
        }

        stringHashing(targetString, start, end+1);
        return;
    }


    public static void main(String[] args) {
        StringBuilder targetStringBuilder = new StringBuilder("aaabbbccc");
        System.out.println("original : "+targetStringBuilder);
        stringHashing(targetStringBuilder, 0, 1);
    }
}
