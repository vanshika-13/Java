package Recursion;

public class Prime {
    // Using Stack Building Approach
    static void prime(int num , int counter){
        if(counter == num){
            System.out.println("Result approach a: "+num+" is a prime number");
            return;
        }

        if(num % counter == 0){
            System.out.println("Result approach a: "+num+" is not a prime number");
            return;
        }

        prime(num, counter + 1);
    }

    // Using Stack falling approach
    static boolean primeNum(int num , int counter){
        if(counter == 2){
            return num % counter == 0;
        }

        boolean result = primeNum(num, counter - 1);
        if(result){
            return result;
        }
        return num % counter == 0;
    }


    //  Stack building mediator method
    static void prime(int num){
        prime(num , 2);
    }


    // Stack Falling mediator method
    static boolean primeNum(int num){
        return primeNum( num , num - 1);
    }

    public static void main(String[] args) {
        prime(42);  
        System.out.println(primeNum(11)?" not prime" : "a prime number");
    }
}
