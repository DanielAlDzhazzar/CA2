package engine;

import hashmap.HashMap;
import list.LinkedList;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Method to implement core search functionality
 */

public class MiniSearchEngine {
    private HashMap<String, LinkedList<String>> invertedIndex;

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

    public MiniSearchEngine(){
        invertedIndex = new HashMap<>();
        buildIndex();
    }


}
