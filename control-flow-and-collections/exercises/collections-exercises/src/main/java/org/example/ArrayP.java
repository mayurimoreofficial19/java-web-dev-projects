package org.example;
import java.util.Arrays;

public class ArrayP {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        System.out.println("All values:");
        for(int index: integerArray)
        {
            System.out.println(index);
        }

        System.out.println("Odd Values : ");
        for(int value : integerArray) {
            if(value % 2 == 1) {
                System.out.println(value);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentence = phrase.split("\\.");
        System.out.println(Arrays.toString(sentence));
    }
}
