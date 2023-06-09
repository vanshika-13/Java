package Recursion;

public class Fourth {
    
    // Using Stack Building Approach
    static void fourth(int num , double result){

        if(num == 0 ){
            System.out.println("The result approach 1: "+result);
            return;
        }
            double subResult = (double)num / (Math.pow(num,num));
            result  += subResult;
            fourth(num - 1 , result);
        
    }

    //   Stack Building Mediator method
        static void fourth(int num){
            fourth(num, 0);
        }

        // Using Stack Falling Approach
        static double fourth_2(int num){
            if(num == 1){
                return (double)num;
            }

            double subResult = (double)num / (Math.pow(num,num));
            double result = subResult + fourth_2(num - 1);
            return result;
        }
    public static void main(String[] args) {
        fourth(3);
        System.out.println("The result approach 2: "+fourth_2(3));
    }
}
