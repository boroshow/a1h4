package com.example.a1h4;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class  secondactivity extends AppCompatActivity {

    TextView textView,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        textView = findViewById(R.id.textt);
        text2 = findViewById(R.id.text23);
        User model = (User) getIntent().getSerializableExtra("text");

        if (model != null) {
            textView.setText(model.getName());
            text2.setText(model.getSinger());
        }else {
            Toast.makeText(this, "FAILURE", Toast.LENGTH_SHORT).show();
        }
    }
}