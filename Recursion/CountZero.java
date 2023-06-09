package Recursion;

public class CountZero {
    //Using Stack Building Approach
    static void countZero(int num , int count){
        if(num == 0){
            System.out.println("Count approach 1:"+count);
            return;
        }

        else{
            if(num % 10 == 0){
                count+=1;
            }    
            countZero(num/10, count);
        }
    }
    //   Stack Building Mediator method
    static void countZero(int num){
        countZero(num, 0);
    }

    // Using Stack falling approach
    static int countZeros(int num,int count){
        if(num == 0){
            return count;
        }
        
        int result = countZeros(num/10 , 0);
        if(num % 10 == 0){
            result+=1;
        }
        return result;
    }

    public static void main(String[] args) {
        countZero(102030);
        System.out.println("Count approach 2: "+countZeros(102030 , 0));
    }
}
