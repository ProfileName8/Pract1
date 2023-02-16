package com.example.pr1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import com.example.pr1.databinding.ActivityMainBinding;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG= "MyLog";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.pr1.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate: Log.d");
        Log.e(TAG,"onCreate: Log.e");
        Log.w(TAG,"onCreate: Log.w");
        Log.i(TAG,"onCreate: Log.i");
        Log.v(TAG,"onCreate: log.v");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart: Log.d");
        Log.e(TAG,"onStart: Log.e");
        Log.w(TAG,"onStart: Log.w");
        Log.i(TAG,"onStart: Log.i");
        Log.v(TAG,"onStart: log.v");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop: Log.d");
        Log.e(TAG,"onStop: Log.e");
        Log.w(TAG,"onStop: Log.w");
        Log.i(TAG,"onStop: Log.i");
        Log.v(TAG,"onStop: log.v");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy: Log.d");
        Log.e(TAG,"onDestroy: Log.e");
        Log.w(TAG,"onDestroy: Log.w");
        Log.i(TAG,"onDestroy: Log.i");
        Log.v(TAG,"onDestroy: log.v");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause: Log.d");
        Log.e(TAG,"onPause: Log.e");
        Log.w(TAG,"onPause: Log.w");
        Log.i(TAG,"onPause: Log.i");
        Log.v(TAG,"onPause: log.v");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume: Log.d");
        Log.e(TAG,"onResume: Log.e");
        Log.w(TAG,"onResume: Log.w");
        Log.i(TAG,"onResume: Log.i");
        Log.v(TAG,"onResume: log.v");
    }
}