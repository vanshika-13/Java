package Recursion;

class Power{

    //  Using Stack Building appraoch
    static void power(int num , int power , int result){
        if(power == 0){
            System.out.println("Result appraoch 1: "+result);
            return;
        }

        result = result * num;
        power(num , power - 1 , result);
    }

    // Using Stack falling approach
    static int calcPower(int num , int power){
        if(power == 1){
            return num;
        }
        
        return num * calcPower(num, power - 1);
    }

    //   Stack Building Mediator method
    static void power(int num , int power){
        power(num , power , 1);            
    }
    public static void main(String[] args) {
        power(2, 4); 
        System.out.println("Result approach 2:"+calcPower(2,4));
    }
}