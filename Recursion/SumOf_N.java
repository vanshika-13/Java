package Recursion;

public class SumOf_N {
    // Using Stack Building Approach

  static  void sumOf_N(int n , int result){
        if(n == 0){
            System.out.println("Sum of n naturals approach 1: "+result);
            return;
        }

        result = result + n;
        sumOf_N(n-1, result);
    }

    // Stack Building Mediator Method
  static  void sumOf_N(int n){
        sumOf_N(n , 0);
    }

    static int sumOf_N_Nums(int n){
        if(n == 0){
            return n;
        }

        return n + sumOf_N_Nums(n-1);
    }

    public static void main(String[] args) {
        sumOf_N(5);
        System.out.println("Sum of n naturals approach 2 :"+sumOf_N_Nums(5));
    }
}

