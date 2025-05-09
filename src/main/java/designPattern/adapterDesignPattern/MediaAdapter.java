package designPattern.adapterDesignPattern;

public class MediaAdapter implements MediaPlayer{

    private MP4Player mp4Player;
    private VLCPlayer vlcPlayer;


    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("mp4")){
            mp4Player = new MP4Player();

        } else if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer = new VLCPlayer();

        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            mp4Player.playMp4(fileName);

        } else if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVLC(fileName);

        }

    }
}
