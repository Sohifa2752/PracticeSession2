package com.example.practicesession2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button2;
    TextInputLayout textInputLayout, textInputLayout2, textInputLayout3;
    TextInputEditText textInputEditText,text2,text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView =(TextView) findViewById(R.id.textView);
        button2 =(Button) findViewById(R.id.button2);
        textInputLayout =(TextInputLayout) findViewById(R.id.textInputLayout);
        textInputLayout2 =(TextInputLayout) findViewById(R.id.textInputLayout2);
        textInputLayout3 =(TextInputLayout) findViewById(R.id.textInputLayout3);
        textInputEditText = (TextInputEditText) findViewById(R.id.textInputEditText);
        text2 = (TextInputEditText)findViewById(R.id.text2);
        text3 = (TextInputEditText) findViewById(R.id.text3);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = textInputEditText.getText().toString();
                String password = text2.getText().toString();
                String phonenumber = text3.getText().toString();
                boolean check = validateinfo (Email,password,phonenumber);
                if(check==true){
                    Toast.makeText(getApplicationContext(),"data is valid",Toast.LENGTH_SHORT).show();
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                startActivity(intent);
            }
        });
    }
    private boolean validateinfo(String Email,String password,String phonenumber) {
        if (Email.length() == 0) {
            textInputEditText.requestFocus();
            textInputEditText.setError("Field cannot be empty");
            return false;

        } else if (Email.matches("[a-zA-Z0-9.-_]+@[a-z]+\\.+[a-z]")) {
            textInputEditText.requestFocus();
            textInputEditText.setError("enter valid email");
            return false;

        }

        else {
            return true;
        }
    }
}