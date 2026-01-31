//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Datatypes in java

        int x = 5;

        /*
           int ----> datatype
           x ----> variable(that stores some information)
           = ----> assignment operator
           5----> information or data


           with decimal  -> 5.5, 9.5, -5.1, 2.1
           without decimal----> -1,2,0,3,

           To store without decimal numbers we have following data types.
           int, long, short, byte

           byte ---> 8bits---> 1 1111101 ---> -2^(8-1) to 2^(8-1)-1 ---> -128 to 127

           short--->2bytes---->2*8----> 16bits---> 1 11111111111111111  ---> -2^(16-1) to 2^(16-1)-1 ---> -32768 to 32767

           int ---> 4bytes--->4*8----->32bits----> 1 11111111.....   ---> -2^(32-1) to 2^(32-1)-1

           long ---> 8bytes--->8*8---> 64bits--> 1 111111.......  --->


           General formulae to calculate the range of any datatype

           -2^(n-1) to 2^(n-1)-1 // n is number of bits.

         */

        // default data type to store non-decimal values is int

        byte y = 5;  // -128 to 127
        byte y1 = 127;

        //short m = 32768; out of range

        short m = 32767;
//        short m1 = -32769;


        int mt = 345346344;

        long xyt = 346346345999999999l;   ///3463











    }
}