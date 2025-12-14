import java.util.HashMap;
import java.util.Map;

public class VideoPlayer implements MediaPlayer {
    private Map<String, MediaAdapter> adapterCache = new HashMap<>();

    @Override
    public void play(String mediaType, String fileName) {

        if (mediaType.equalsIgnoreCase("mp3")) {
            System.out.println("VideoPlayer dahili olarak mp3 çalıyor: " + fileName);
        } 
        
        else if (mediaType.equalsIgnoreCase("mp4") || mediaType.equalsIgnoreCase("webm")) {
            
            MediaAdapter adapter = adapterCache.get(mediaType);

            if (adapter == null) {
                System.out.println("--- LOG: " + mediaType + " için ilk kez Adaptör oluşturuluyor ---\n");
                adapter = new MediaAdapter(mediaType);
                adapterCache.put(mediaType, adapter);
            }

            adapter.play(mediaType, fileName);
        } 

        else {
            System.out.println("Desteklenmeyen dosya biçimi: " + mediaType + " uzantılı dosya çalıştırılamadı.");
        }
    }
}