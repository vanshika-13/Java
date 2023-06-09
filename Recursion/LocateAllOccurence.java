package Recursion;
public class LocateAllOccurence {
    
    static int locs = 0;

    static void printArr(int arrOfIndexes [] , int indexNo){
        if( arrOfIndexes.length == indexNo){
            return;
        }
        System.out.print(arrOfIndexes[indexNo]+" ");
        printArr(  arrOfIndexes ,indexNo + 1);
    }

    // Stack building Approach

    static void locateAllOccurence(int arr[] , int index, int search ){
        if(index < 0){
            return;
        }

        if(arr[index] == search){
            // arrOfIndexes[locs] = index;            
            // ++locs;     
            System.out.print(index+" ");       
        }

        locateAllOccurence(arr, index - 1, search );
    }

    static void locateAllOccurence(int arr[] , int search){
        locateAllOccurence(arr, arr.length - 1, search );
    }

    // Stack Falling Apporach
    static int [] locateAllOccurences(int arr[] , int index, int countOccur,  int search ){
        if(index < 0){
            int result[] = new int[countOccur];
            return result;
        }

        if(arr[index] == search){
            ++countOccur;            
        }

     int result [] =  locateAllOccurences(arr, index - 1 , countOccur ,   search );
        if(arr[index] == search){
            result[countOccur - 1] = index;
        }

        return result;
    }

    static int []  locateAllOccurences(int arr[] , int search){
       return  locateAllOccurences(arr , arr.length - 1 , 0 , search);
    }

    public static void main(String[] args) {
        int arr_1 [] = {1, 1, 6 , 7 , 1, 4, 10};
        int arr_2 [] = {1, 1, 6 , 6 , 1, 6, 10};
        int arr_3 [] ;
        locateAllOccurence(arr_1, 1);        
        System.out.println();
         arr_3 =  locateAllOccurences(arr_2, 6);
         printArr(arr_3, 0);
       
    }
}
