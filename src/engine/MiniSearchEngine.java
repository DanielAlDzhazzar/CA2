package engine;

import hashmap.HashMap;
import list.LinkedList;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Method to implement core search functionality
 */

public class MiniSearchEngine {
    private static HashMap<String, LinkedList<String>> invertedIndex;

    private String[] files = {
            "data/file1.txt",
            "data/file2.txt",
            "data/file3.txt",
            "data/file4.txt",
            "data/file5.txt",
            "data/file6.txt",
            "data/file7.txt",
            "data/file8.txt",
            "data/file9.txt",
            "data/file10.txt"
    };

    /**
     * Constructor for MiniSearchEngine
     */

    public MiniSearchEngine(){
        invertedIndex = new HashMap<>();
        buildIndex();
    }

    /**
     * Method to build an inverted index from all files
     */

    public void buildIndex(){
        for(String file : files){
            String text = FileProcessor.readFile(file);
            String[] words = Tokenizer.tokenize(text);

            for(String word : words){
                if(word.isBlank()){
                    continue;
                }

                LinkedList<String> fileList = invertedIndex.get(word);

                if(fileList == null){
                    fileList = new LinkedList<>();
                    fileList.add(file);
                    invertedIndex.put(word, fileList);
                }
                else if(!fileList.contains(file)){
                    fileList.add(file);
                }
            }
        }
    }

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

                    LinkedList<String> results = engine.invertedIndex.get(word);

                    if(results == null || results.isEmpty()){
                        throw new IllegalArgumentException("Word not found.");
                    }

                    System.out.println("Found in: ");
                    for(int i = 0; i < results.size(); i++){
                        System.out.println(results.get(i));
                    }
                    break;
                case 2:
                    Object[] keys = invertedIndex.getKeys();
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
