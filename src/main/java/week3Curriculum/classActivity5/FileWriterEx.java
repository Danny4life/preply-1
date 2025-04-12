package week3Curriculum.classActivity5;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileWriter fw = new FileWriter(desktopPath + "/output.csv");
            fw.write("I am learning how to write into a csv file");
            // omit the close method to show what will happen when it is not used
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        System.out.println("successfully written into a csv file");
    }
}
