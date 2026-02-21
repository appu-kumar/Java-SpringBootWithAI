import java.util.Arrays;

public class ArrayLearn {
    public static void main(String[] args){
        System.out.println("hi");
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };



        // matrix[2][2]  out of bound run time error.
        // int[] arr = {1,2,"appu"} // wrong we can store int type only okay check lhs.


        // enhanced loop.
       /* for(int[] row : matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }*/

        // Array has the fixed size
        // Do not have built-in helper methods
        // So Java gives us Arrays class to:

        int[] arr = {1,6,3,5,4,2};
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        Arrays.fill(arr,-1);
        System.out.print(Arrays.toString(arr));
        // many more methods use according to ur requirement.
    }
}

/*
Array in Java is:
A fixed-size container that stores elements of same type in continuous memory
and allows fast access using index.

    int[] arr;          // declaration
    arr = new int[5];  // initialization
    int[] arr2 = new int[5]  // declaration and initialization at same time
    int[] arr3 = {10, 20, 30, 40};  // Direct Initialization
    arr.length  // to calculate the size of the array

    # Default values:
    int → 0
    double → 0.0
    boolean → false
    String → null


    # Looping Through Array
    for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);  }

    Using Enhanced for loop (For-Each)
    for(int num : arr) {
    System.out.println(num);}

    # Types of Arrays in Java
      int[] arr = {1,2,3};  // if values are known okay.
      int[] arr = new int[3]; // vice versa but default value of each block is 0 because it is int type array.

      int[][] matrix = {
            {1,2,3},
            {4,5,6}
        };
      int[][] matrix = new int[3][3];

      🔷 When NOT to Use Array?
       ❌ When size changes frequently
       ❌ When inserting/deleting from middle often
       Use:
        ArrayList
        LinkedList

      Note:: Array is part of the core java, ArrayList and LinkedList both are the part of the collection java framework(To use them we need to import lib)



      🚀 Why is Arrays Class Important?
        Because arrays in Java are:
        Fixed size
        Basic data structure
        Do not have built-in helper methods
        So Java gives us Arrays class to:

        ✔ Sort
        ✔ Search
        ✔ Compare
        ✔ Convert
        ✔ Fill
        ✔ Copy
        ✔ Print
        Without it, you'd write everything manually.
 */
