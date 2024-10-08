package com.example.practicesession2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RadioButtonActivity extends AppCompatActivity {
    RadioGroup radio;
    TextView textView2,textView3;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton genderButton;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_radio_button);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        radio =(RadioGroup) findViewById(R.id.radio);
        radioButton7 =(RadioButton) findViewById(R.id.radioButton7);
        radioButton8 =(RadioButton) findViewById(R.id.radioButton8);
        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radio.getCheckedRadioButtonId();
                genderButton =(RadioButton) findViewById(selectedId);
                String value = genderButton.getText().toString();
                textView3.setText("Your are a: "+value);

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RadioButtonActivity.this,CheckboxActivity.class);
                startActivity(intent);
            }
        });

    }
}