package ex45;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws IOException {
        File input = new File("exercise45_input.txt");

        BufferedReader b = new BufferedReader(new FileReader(input));


        File output = new File("exercise45_output.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        for(int i=0;i<input.length();i++) {
            String line;

            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("the_file_name"), Charset.forName("UTF-8")))) {
                while ((line = br.readLine()) != null) {
                    if(line.equals("utilize")){
                        writer.write("use");
                    }
                    else{
                        writer.write(line);
                    }
                }
            }

        }
        writer.close();
    }
}
