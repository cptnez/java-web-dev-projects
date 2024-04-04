import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListPractice {
   /* public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println(sumEven(numbers));

    }*/

    public static String printWords (ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");

        int numChars = input.nextInt();

        ArrayList<String> total = new ArrayList<>();

        for (String word : arr) {
            if (word.length() == numChars) {
                total.add(word);
            }

    }
        return String.valueOf(total);
}
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();

        words.add("corn");
        words.add("corne");
        words.add("corn");
        words.add("cornf");
        words.add("corneee");
        words.add("corny");


        System.out.println(printWords(words));
    }
}
