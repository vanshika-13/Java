package Recursion;

public class Reverse {
    
    static String reverse(String str){
        if(str.length() == 1){
            return str;
        }

        String subString = reverse(str.substring(1));
        return subString + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Reverse of Moga "+reverse("Moga"));
    }
}
