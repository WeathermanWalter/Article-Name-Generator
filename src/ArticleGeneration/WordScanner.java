package ArticleGeneration;

import java.io.*;
import java.util.ArrayList;

public class WordScanner {
    ArrayList<String> arr;
    File file;

    WordScanner(String name) {
        file = new File("src\\ArticleGeneration\\Word Bank\\" + name);
        arr = new ArrayList<String>();
        readFile();
    }

    private void readFile() {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String i;
            while ((i = br.readLine()) != null) {
                arr.add(i);
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            System.out.println("File can not be found");
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("File can not be read");
        }
    }

    public String[] toArray() {
        String[] temp = new String[arr.size()];
        temp = arr.toArray(temp);
        return temp;
    }
}
