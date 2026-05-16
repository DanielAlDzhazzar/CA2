import engine.MiniSearchEngine;
import list.LinkedList;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Method to let user interact with a program
 */

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        MiniSearchEngine engine = new MiniSearchEngine();

        while (true){
            System.out.println("1. Search for a word");
            System.out.println("2. Display all indexed words");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter the words to search: ");
                    String word = scanner.nextLine().toLowerCase();

                    LinkedList<String> results = engine.getInvertedIndex().get(word);

                    if(results == null || results.isEmpty()){
                        throw new IllegalArgumentException("Word not found.");
                    }

                    System.out.println("Found in: ");
                    for(int i = 0; i < results.size(); i++){
                        System.out.println(results.get(i));
                    }
                    break;
                case 2:
                    Object[] keys = engine.getInvertedIndex().getKeys();
                    String[] words = new String[keys.length];

                    for (int i = 0; i < keys.length; i++){
                        words[i] = (String) keys[i];
                    }

                    Arrays.sort(words);

                    System.out.println("\nIndexed Words:");

                    for (String w : words){
                        System.out.println(w);
                    }
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
