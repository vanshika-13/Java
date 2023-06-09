package Recursion;

public class CountAllOccurence {
    // Stack Building Approach
    static void countAllOccurence(int arr[] , int index , int count , int search){
        if(index < 0){
            System.out.println("The total count "+count);
            return ;
        }

        if(arr[index]  == search){
            count+=1;
        }

        countAllOccurence(arr, index - 1 , count, search);
    }

    // Stack Building Mediator Method
    static void countAllOccurence(int arr[] , int search){
        countAllOccurence(arr, arr.length - 1, 0, search);
    }

    // Stack falling Approach
    static int countAllOccurences(int arr[] , int index ,  int search ){
        if(index < 0){
            return 0;
        }

         int count =  countAllOccurences(arr, index - 1  , search);
        if(arr[index] == search){
            return count+=1;
        }

        return count;
    }

    // Stack falling mediator method
    static int countAllOccurences(int arr[] , int search){
        return countAllOccurences(arr, arr.length - 1, search);
    }

    public static void main(String[] args) {
        int arr [] = {1, 1, 6 , 7 , 1, 4, 10};
        countAllOccurence(arr, 1);
        System.out.println("The total occurences of 1: "+countAllOccurences(arr, 1));
    }
}
