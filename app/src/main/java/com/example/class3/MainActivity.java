package com.example.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText main_EDT_input;
    private TextView main_LBL_info;
    private Button main_BTN_check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        main_EDT_input = findViewById(R.id.main_EDT_input);
        main_LBL_info = findViewById(R.id.main_LBL_info);
        main_BTN_check = findViewById(R.id.main_BTN_check);


        main_BTN_check.setOnClickListener(myListener);
        Log.d("", "");

    }

    View.OnClickListener myListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            start();
        }
    };

    private void start() {
        String input = main_EDT_input.getText().toString();
        boolean result = MyLogic.buttonCheck(input);

        main_LBL_info.setText("Result= " + result);
    }

}
