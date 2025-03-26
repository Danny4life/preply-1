package sriza.solidPrinciples.designPattern.adapterDesignPattern;

public class MediaMain {
    public static void main(String[] args) {

        AdvancedMediaPlayer player = new AdvancedMediaPlayer();

        player.play("mp3", "song.mp3"); // Supported natively
        player.play("mp4", "video.mp4"); // playing via media adapter
        player.play("vlc", "movie.vlc"); // playing via media adapter
        player.play("avi", "clip.avi"); // unsupported format
    }
}
