package com.example.nyan.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Created by NYAN on 08.01.2019.
 */

//public class Sudoku extends AppCompatActivity implements OnClickListener{
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        //Set up click listeners for all the buttons
//        View continueButton = findViewById(R.id.continue_button);
//        continueButton.setOnClickListener(this);
//        View newButton = findViewById(R.id.new_game_button);
//        newButton.setOnClickListener(this);
//        View aboutButton = findViewById(R.id.about_button);
//        aboutButton.setOnClickListener(this);
//        View exitButton = findViewById(R.id.exit_button);
//        exitButton.setOnClickListener(this);
//    }
//
//        public void onClick(View view){
//            switch(view.getId()){
//                case R.id.about_button:
//                    Intent i = new Intent(this,About.class);
//                    startActivity(i);
//                    break;
//            }
//        }
//        @Override
//        public boolean onCreateOptionsMenu(Menu menu){
//            super.onCreateOptionsMenu(menu);
//            MenuInflater inflater = getMenuInflater();
//            inflater.inflate(R.menu.menu,menu);
//            return true;
//        }
//        @Override
//        public boolean onOptionsItemSelected(MenuItem item){
//            switch (item.getItemId()){
//                case R.id.settings:
//                    startActivity(new Intent(this,Prefs.class));
//            }
//            return true;
//        }
//}

