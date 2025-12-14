public class MediaAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer;
    private WindowsMediaPlayer windowsMediaPlayer;

    public MediaAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("mp4")) {
            windowsMediaPlayer = new WindowsMediaPlayer();
        } else if (mediaType.equalsIgnoreCase("WebM")) {
            vlcPlayer = new VLCPlayer();
        }
    }

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("mp4")) {
            windowsMediaPlayer.playMediaPlayer(fileName);
        } else if (mediaType.equalsIgnoreCase("WebM")) {
            vlcPlayer.playVLCPlayer(fileName);
        }
    }
}