package engine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Method to handle file reading operations
 */

public class FileProcessor {

    /**
     * Method to read text from a file
     *
     * @param filename name of a file to read
     * @return file content
     */

    public static String readFile(String filename){
        StringBuilder builder = new StringBuilder();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            String line;

            while((line = reader.readLine()) != null){
                builder.append(line).append(" ");
            }

            reader.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        return builder.toString();
    }
}
