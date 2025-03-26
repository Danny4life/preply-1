package sriza.solidPrinciples.designPattern.adapterDesignPattern;

public class MP3Player implements MediaPlayer{


    @Override
    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("MP3")){
            System.out.println("Playing MP3 File: " + fileName);
        }else {
            System.out.println("Invalid media format! MP3 player only support MP3 files.");
        }

    }
}
