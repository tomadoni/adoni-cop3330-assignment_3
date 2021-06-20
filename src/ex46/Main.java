package ex46;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws IOException {
        String badger="";
        String mushroom="";
        String snake="";

        File input = new File("exercise41_input.txt");

        BufferedReader b = new BufferedReader(new FileReader(input));

        File output = new File("exercise45_output.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        for(int i=0;i<input.length();i++) {
            String line;

            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("the_file_name"), Charset.forName("UTF-8")))) {
                while ((line = br.readLine()) != null) {
                    if(line.equals("badger")){
                        badger+="*";
                    }
                    else if(line.equals("mushroom")){
                        mushroom+="*";
                    }
                    else{
                        snake+="*";
                    }
                }
            }
        }
        if(badger.length()>mushroom.length() && badger.length()>snake.length()){
            writer.write("Badger: "+badger);
            if(mushroom.length()>snake.length()){
                writer.write("Mushroom: "+mushroom);
                writer.write("Snake: "+snake);
            }
            else{
                writer.write("Snake: "+snake);
                writer.write("Mushroom: "+mushroom);
            }
        }
        else if(mushroom.length()>badger.length() && mushroom.length()>snake.length()){
            writer.write("Mushroom: "+mushroom);
            if(badger.length()>snake.length()){
                writer.write("Badger: "+badger);
                writer.write("Snake: "+snake);
            }
            else{
                writer.write("Snake: "+snake);
                writer.write("Badger: "+badger);
            }
        }
        else{
            writer.write("Snake: "+snake);
            if(mushroom.length()>badger.length()){
                writer.write("Mushroom: "+mushroom);
                writer.write("Badger: "+badger);
            }
            else{
                writer.write("Badger: "+badger);
                writer.write("Mushroom: "+mushroom);
            }
        }
        writer.close();
    }
}
