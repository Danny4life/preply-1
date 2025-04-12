package week3Curriculum.classActivity2;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            Reader r = new FileReader(desktopPath + "/output.csv");
            int readContent = r.read();
            while(readContent != -1){ // keep reading until the end of the file
                System.out.println((char) readContent);
                readContent = r.read();
            }
            r.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
