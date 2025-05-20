package verlaClasses.week3.classActivity7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

    public static void main(String[] args) throws IOException {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        FileReader fr = new FileReader(desktopPath + "/output.csv");

        BufferedReader br = new BufferedReader(fr);

        int i;

        while ((i = br.read()) != -1){
            System.out.println((char)i);

        }
        br.close();
        fr.close();
    }
}
