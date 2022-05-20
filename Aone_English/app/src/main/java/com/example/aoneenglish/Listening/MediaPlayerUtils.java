package com.example.aoneenglish.Listening;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class MediaPlayerUtils {
    public static final String URL_MEDIA_SAMPLE  = "https://github.com/Lap2000/songs/raw/main/Bay-Giua-Ngan-Ha-Nam-Cuong.mp3";

    public static final String LOG_TAG= "MediaPlayerTutorial";

    public static void playURLMedia(Context context, MediaPlayer mediaPlayer, String videoURL)  {
        try {
            Log.i(LOG_TAG, "Media URL: "+ videoURL);

            Uri uri= Uri.parse( videoURL );
            // Toast.makeText(context,"Select source: "+ uri,Toast.LENGTH_SHORT).show();
            mediaPlayer.setDataSource(context, uri);
            mediaPlayer.prepareAsync();

        } catch(Exception e) {
            Log.e(LOG_TAG, "Error Play URL Media: "+ e.getMessage());
            Toast.makeText(context,"Error Play URL Media: "+ e.getMessage(),Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
