import java.util.*;
import java.io.*;

class Indexer {
    public Indexer() {

    }

    public void readExcludedWords() {

    }

    public void buildIndex() {

    }

    public void writeIndex() {

    }

    public static void main(String[] args) {
        String pages[] = { "Page1.txt", "Page2.txt", "Page3.txt" };
        String excludePage = "exclude-words.txt";
        String indexFile = "index.txt";

        Indexer indexer = new Indexer();
        try {
            indexer.readExcludedWords();
            indexer.buildIndex();
            indexer.writeIndex();
            System.out.println("Indexing Complete");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An error occured while Indexing");
        }
    }
}