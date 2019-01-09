package com.example.nyan.sudoku;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

/**
 * Created by NYAN on 08.01.2019.
 */

public class Prefs extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);  //устаревший,заменить
    }
    //Option names and default values
    private static final String OPT_MUSIC = "music";
    private static final boolean OPT_MUSIC_DEF = true;
    private static final String OPT_HINTS = "hints";
    private static final boolean OPT_HINTS_DEF = true;

    //Get the current value of the music option
    public static boolean getMusic(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(OPT_MUSIC,OPT_MUSIC_DEF);
    }
    //Get the current value of the hints option
    public static boolean getHints(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(OPT_HINTS,OPT_HINTS_DEF);
    }
}
