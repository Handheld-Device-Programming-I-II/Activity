package lk.jiat.activity.activity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import lk.jiat.activity.R;
import lk.jiat.activity.log.LogWriter;

public class HomeActivity extends AppCompatActivity {

    private Button homeBtn;

    //private static final String TAG = HomeActivity.class.getName();

    public HomeActivity(){
        super(R.layout.activity_home);  //only android x
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home);

        homeBtn = findViewById(R.id.homeBtn);

        /*homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printLogStatement();
            }
        });*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogWriter.writerInfoLog(this,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogWriter.writerInfoLog(this, "onResume()");
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                printLogStatement();
            }
        });
    }

    private void printLogStatement(){
        //System.out.println("INFO: My name is Kalhara");
        //Log.i(TAG, "My Name is Kalhara");
        LogWriter.writerInfoLog(this,"My name is Kalhara");
    }
}