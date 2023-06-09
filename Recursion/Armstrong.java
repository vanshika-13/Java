package Recursion;

public class Armstrong {
    
    //count digits
    static int countDigits(int num , int count){
        if( num == 0){
            return 0;
        }

        count = countDigits(num/10, count);
        return ++count;
    }
    // Stack Building Approach
    static void armstrong(int orgNum , int num , int result , int digits){
            
            if(num == 0){
                if(orgNum == result){
                    System.out.println(" Result approach a : An armstrong number");
                }

                else{
                    System.out.println("Result apporach b: A non-armstrong number ");
                }

                return;
            }
             result += (int)Math.pow((num % 10),digits);
            armstrong(orgNum , num/10, result, digits);
    }

    // Stack Building Mediator
    static void armstrong(int num){
        int digits = countDigits(num, 0);
        armstrong(num, num, 0, digits);
    }

    //using Stack falling approach

    static int armstrong_2(int num , int digits){
        if(num == 0){
            return 0;
        }

        int result = (armstrong_2(num/10, digits));
        result += (int)Math.pow(num % 10, digits);
        return result;
    }
    static boolean armstrong_2(int num){
        int digits = countDigits(num, 0);
        return num == armstrong_2(num, digits);
    }

    public static void main(String[] args) {
       armstrong(153);
       System.out.println("Result approach b: "+((armstrong_2(153)) ? "An armstrong number ": "A non-armstrong number"));
    }
}
