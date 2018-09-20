package com.example.user.myapplication;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "StartActivity";
    private Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
    }
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
        resetUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }

    public void onClickBtnAddStudents(View view){
        counter++;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        Toast.makeText(this,"onClickBtnAddStudents", Toast.LENGTH_LONG).show();
    }
    public void onClickNullStudents(View view){
        counter = 0;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
        Log.d(TAG, "onClickBtnAddStudents");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
        Log.d(TAG, "onSaveInstanceState");
        Toast.makeText(this, "onSaveInstanceState", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onRestoreInstanceState(Bundle saveInstanseState){
        super.onRestoreInstanceState(saveInstanseState);
        if (saveInstanseState != null &&  saveInstanseState.containsKey("counter")){
            counter = saveInstanseState.getInt("counter");
            Log.d(TAG, "onRestoreInstanceState");
            Toast.makeText(this, "onRestoreInstanceState", Toast.LENGTH_LONG).show();
        }
    }


    private void resetUI(){
        ((TextView) findViewById(R.id.txt_counter)).setText(counter.toString());
        Log.d(TAG, "resetUI");

    }
}
