import java.util.Arrays;
import java.util.Scanner;

public class simpli {
    public static String lameDb(String db, String op, String id, String data) {
        String result = "";

        String[] words = db.split("#");
        String[] arrNew;
        int index = (Integer.parseInt(id)) - 1;

        if (op.equals("add")) {
            arrNew = new String[words.length + 1];
            int indexOfWords = 0;
            for (int i = 0; i < arrNew.length; i++) {
                if (i == index) {
                    arrNew[i] = id + data;
                } else {
                    arrNew[i] = words[indexOfWords++];
                }
                arrNew[i] = arrNew[i].replace(arrNew[i].substring(0, 1), "" + (i + 1));
                if (i != 0) {
                    arrNew[i] = "#" + arrNew[i];
                }
                result += arrNew[i];
            }
        } else if (op.equals("edit")) {
            arrNew = new String[words.length];
            for (int i = 0; i < arrNew.length; i++) {
                if (i == index) {
                    arrNew[i] = id + data;
                } else {
                    arrNew[i] = words[i];
                }
                arrNew[i] = arrNew[i].replace(arrNew[i].substring(0, 1), "" + (i + 1));
                if (i != 0) {
                    arrNew[i] = "#" + arrNew[i];
                }
                result += arrNew[i];
            }

        } else if (op.equals("delete")) {
            arrNew = new String[words.length - 1];
            int indexOfArr = 0;
            for (int i = 0; i < words.length; i++) {
                if (i == index) {
                    continue;
                } else {
                    arrNew[indexOfArr] = words[i];
                }
                if (arrNew[indexOfArr].charAt(0) != '1') {
                    arrNew[indexOfArr] = "#" + arrNew[indexOfArr];
                }
                result += arrNew[indexOfArr++];
            }
        } else {
            arrNew = new String[0];
            System.out.println("Invalid command");
        }

        return result;
    }//end lameDb



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}


/*
 int[] numbers = {10, 20, 30, 40, 50};

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }

            System.out.println("------------------------------------");

            for(int  each : numbers){
                System.out.println(each);


 */