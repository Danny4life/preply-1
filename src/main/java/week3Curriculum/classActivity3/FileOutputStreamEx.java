package week3Curriculum.classActivity3;

import java.io.FileOutputStream;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        try{
            FileOutputStream out = new FileOutputStream(desktopPath + "/output.csv");
            String wr = "I am learning how to write to a file";
            byte[] bytes = wr.getBytes();
            out.write(bytes);
            out.close();
            System.out.println("Successfully write to a file");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
