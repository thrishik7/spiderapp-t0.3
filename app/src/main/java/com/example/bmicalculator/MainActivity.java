package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

        public class MainActivity extends AppCompatActivity {


            private EditText wei;
            private EditText hei;
            private Button cal;
            private TextView bmi;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                wei=(EditText) findViewById(R.id.etW);
                hei=(EditText) findViewById(R.id.etH);
                cal=(Button) findViewById(R.id.btnC);
                bmi=(TextView)findViewById(R.id.tvB);
                cal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int a =Integer.parseInt(wei.getText().toString());
                        int b =Integer.parseInt(hei.getText().toString());
                        int c = a/(b*b);
                        bmi.setText("BMI:"+ c);

                    }
                });
    }
}
