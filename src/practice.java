import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


    class practice {

        public static int getDup(String[] arr) {
            int dup = 0;

            for (int i = 0; i <arr.length; i++) {

                for (int j = 1; j < arr.length ; j++) {
                    if(arr[j].equals(arr[i])){
                        dup++;
                    }
                }
            }



            return dup;


        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String[] strs = new String[in.nextInt()];
            for (int i = 0; i < strs.length; i++) {
                strs[i] = in.next();
            }

            System.out.println(getDup(strs));

        }
    }
/*
int[] arr1 = {1,2,3,4};
        int[]  arr2 = {5,6,7};

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

        int k = 0 ; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { //i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { //i: for second array's index numbers
            arr3[k] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("--------------------------------------------------");
        int[] a1 = {10,20,30,40};
        int[]  a2 = {50,60,70,80};
        int[] a3=ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));
 */