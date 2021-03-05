import java.lang.Math;

public class Bogosort{
    public static boolean inOrder(int[]a){      // checks if the array is in order or not
        for (int i = 0; i < a.length - 1; i++){ // loop through the array except for the last index
            if (a[i] > a[i+1]) return false;    // if an item is larger than its following item, return false
        }
        return true;                            // function returns true if it can get through the for loop without returning
    }

    public static void swap(int[]a, int x, int y){  // swaps two indices in an integer array
            int temp = a[x];                        // set a[x] to a temporary integer variable
            a[x] = a[y];                            // set a[y] to a[x], losing a[x]'s value in the process
            a[y] = temp;                            // set a[x] to a[y] via the temporary variable
    }

    public static void bogoSort(int[]a){
        boolean flag = false;                               // create a boolean variable that keeps track of the sort status
        while (!flag){                                      // continue bogosort while the array is not sorted
            for (int i = 0; i < a.length; i++){             // loop through the array
                swap(a, i, (int)(Math.random()* a.length)); // swap each index with a random index
            }
            flag = inOrder(a);                              // set flag to the sort status
        }
    }

    public static void printArray(int[]a){                  // prints an array with commas separating items
        System.out.print("[");
        for (int i = 0; i < a.length; i++){
            if (i == a.length - 1) System.out.print(a[i]);
            else System.out.print(a[i] + ", ");
        }
        System.out.print("]");
    }

    public static void main(String[]args){
        int[]med = new int[10];                     // create an integer array of size 10
        for (int i = 0; i < med.length; i++){       // assign a random integer from 0-99 inclusive for every index
            med[i] = (int)(Math.random() * 100);    
        }
        bogoSort(med);
        printArray(med);
    }
}
