package designPattern.adapterDesignPattern;

public class AdapterPatternDemo {

    public static void main(String[] args) {

        AdvancedMediaPlayer player = new AdvancedMediaPlayer();

        player.play("mp3", "song.mp3"); // Supported natively
        player.play("mp4", "song.mp4"); // Played via adapter
        player.play("vlc", "movie.vlc"); // Played via adapter
        player.play("avi", "clip.avi"); // Unsupported format
    }
}
