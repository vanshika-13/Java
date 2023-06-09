package Recursion;

public class ReplaceAllOccurence {
    // Printing of array using stack building apporach
    static void printArr(int arr[] , int index){
        if(index == arr.length - 1){
            return;
        }
        System.out.print(arr[index]+" ");
        printArr( arr , index + 1);
    }

    static void replaceAllOccurence(int arr[] , int index, int search, int replacement ){
        if(index < 0){
            return;
        }

        if(arr[index] == search){
            arr[index] = replacement;             
        }

        replaceAllOccurence(arr, index - 1, search ,  replacement);
    }

    static void replaceAllOccurence(int arr[] , int search , int replacement){
        replaceAllOccurence(arr, arr.length - 1, search , replacement);
    }

    // Stack Falling Apporach
    static void replaceAllOccurences(int arr[] , int index, int search , int replacement){
        if(index < 0){
            return;
        }

        replaceAllOccurences(arr, index - 1 , search , replacement);
        if(arr[index] == search){
            arr[index] = replacement;
            // System.out.print(arr[index]+" ");
        }
        return;
    }
    // Stack Fallind mediator
    static void replaceAllOccurences(int arr[] , int search, int replacement){
        replaceAllOccurences(arr, arr.length - 1 , search, replacement);

    }

    public static void main(String[] args) {
        int arr_1 [] = {1, 1, 6 , 7 , 1, 4, 10};
        int arr_2 [] = {4, 5, 6, 6 , 9 , 4, 6};
        replaceAllOccurence(arr_1, 1, 2);
        printArr(arr_1, 0);
        System.out.println();
        replaceAllOccurences(arr_2, 6, 7);
        printArr(arr_2, 0);    
    }
}
