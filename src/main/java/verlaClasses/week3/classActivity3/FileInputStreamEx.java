package verlaClasses.week3.classActivity3;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileInputStreamEx {

    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileInputStream r = new FileInputStream(desktopPath + "/output1.csv");
            int data;

            while ((data = r.read()) != -1){
                System.out.print((char)  data);

            }

            r.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
