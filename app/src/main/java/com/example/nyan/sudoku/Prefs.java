package com.example.nyan.sudoku;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by NYAN on 08.01.2019.
 */

public class Prefs extends PreferenceActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);  //устаревший,заменить
    }
}
