package verlaClasses.week3.classActivity1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            Writer wr = new FileWriter(desktopPath + "/output.csv");
            String fileContent = "I am learning how to write into a CSV File";
            wr.write(fileContent);

            wr.close();

            System.out.println("Successfully write into a CSV File");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
