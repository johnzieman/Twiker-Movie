package com.example.twinkermovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private CheckBox checkBoxAgree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxAgree = findViewById(R.id.checkBoxAgree);
    }

    public void openMainActivity(View view) {
        if (checkBoxAgree.isChecked()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, R.string.ToastNotAgree, Toast.LENGTH_SHORT).show();
        }
    }
}
