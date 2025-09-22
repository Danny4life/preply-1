package marayamFundamentals.week3Curriculum.classActivity2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {

        String desktop = System.getProperty("user.home") + "/Desktop";

        try{
            Reader r = new FileReader(desktop + "/output.csv");

            int readContent = r.read();

            while (readContent != -1){
                System.out.println((char) readContent);

                readContent = r.read();
            }

            r.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
