package designPattern.adapterDesignPattern;

public class AdvancedMediaPlayer implements MediaPlayer{


    private MediaAdapter mediaAdapter;


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing MP3 file: " + fileName);

        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {

            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);

        } else {
            System.out.println("Invalid media format! Cannot play: " + audioType);
        }

    }
}
