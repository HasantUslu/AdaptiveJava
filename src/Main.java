public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();

        videoPlayer.play("mp4", "Yüzüklerin Efendisi - İki Kule.mp4");

        videoPlayer.play("mp4", "Matrix.mp4");

        videoPlayer.play("WebM", "Harry Potter Ateş Kadehi.webm");
        
        videoPlayer.play("mov", "Bilinmeyen Film.mov");
    }
}