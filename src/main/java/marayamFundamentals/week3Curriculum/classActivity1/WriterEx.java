package marayamFundamentals.week3Curriculum.classActivity1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {

    public static void main(String[] args) {

        String desktop = System.getProperty("user.home") + "/Desktop";

        try{
            Writer wr = new FileWriter(desktop + "/output1.csv");

            String fileContent = "I am learning to write to a CSV file again and again";
            wr.write(fileContent);
            wr.close();

            System.out.println("Successfully write into a CSV file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
