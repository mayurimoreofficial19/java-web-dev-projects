package org.launchcode;

import java.util.Scanner;

public class SearchSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        System.out.println("please enter the word you want to search");
        String searchWord = input.nextLine();

        String sentenceLower = sentence.toLowerCase();
        String searchWordLower = searchWord.toLowerCase();

        boolean found = sentenceLower.contains(searchWordLower);
        System.out.println("Found : " + found);

        int wordIndex = sentence.indexOf(searchWord);
        int wordLength = searchWord.length();

        System.out.println("The search word is at " + wordIndex + " position and the word length is " + wordLength );

        input.close();
    }
}
