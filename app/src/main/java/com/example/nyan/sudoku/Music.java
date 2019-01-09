package com.example.nyan.sudoku;

import android.content.Context;
import android.media.MediaPlayer;

//import static android.support.v4.media.session.MediaControllerCompatApi21.TransportControls.stop;

/**
 * Created by NYAN on 09.01.2019.
 */

public class Music {
    private static MediaPlayer mp = null;

    public static void play(Context context,int resource){
        stop(context);
        mp = MediaPlayer.create(context,resource);
        mp.setLooping(true);
        mp.start();
    }

    public static void stop(Context context){
        if(mp!=null){
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
