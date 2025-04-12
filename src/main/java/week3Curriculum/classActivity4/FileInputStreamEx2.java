package week3Curriculum.classActivity4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
    public static void main(String[] args) {
        //File file = new File("photo.jpeg");  // Ensure the image is in your project directory or use full path
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileInputStream fis = new FileInputStream(desktopPath + "/photo.jpeg");

            // Create a byte array with the same size as the file
            byte[] imageData = new byte[(int) fis.read()];

            // Read the image data into the byte array
            int bytesRead = fis.read(imageData);

            // Close the stream
            fis.close();

            // Display results
            System.out.println("Image read successfully!");
            System.out.println("Total bytes read: " + bytesRead);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the image.");
            e.printStackTrace();
        }
    }
}
