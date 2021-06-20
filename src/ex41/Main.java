package ex41;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("exercise41_input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        ArrayList<String> names= new ArrayList<String>();

        Collections.sort(names);

        PrintStream out = new PrintStream(new FileOutputStream("exercise41_output.txt"));
        System.setOut(out);
    }
}
