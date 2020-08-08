package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textMsg2 = findViewById(R.id.tvmsg2);
        textMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle","oncreate called..");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle", "on start called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle", "on resume called..");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i( "lifecycle","onpause called ..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i( "Lifecycle","onstop called..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i( "Lifecycle","on Restart called..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","on destroy called..");
    }

}