package lk.jiat.activity.activity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import lk.jiat.activity.R;

public class HomeActivity extends AppCompatActivity {

    //private static final String TAG = HomeActivity.class.getName();

    public HomeActivity(){
        super(R.layout.activity_home);  //only android x
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_home);

        Button homeBtn = findViewById(R.id.homeBtn);
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
    }
}