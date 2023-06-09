package Recursion;

    class LastIndexOf {

        
    static void lastIndexOf(int [] arr , int index , int target){

        if(index < 0){
            System.out.println("Not Found");
        }

        if(arr[index] == target){
            System.out.println(index);
            return ;
        }

        lastIndexOf(arr, index - 1, target);
    }


    public static void main(String[] args) {
        int arr [] = {2, 1, 6 , 7 , 1, 4, 10};
        lastIndexOf(arr , arr.length - 1, 1);
    }
}
