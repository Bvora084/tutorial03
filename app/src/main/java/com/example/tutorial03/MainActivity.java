package com.example.tutorial03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtusername ,edtpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtusername =findViewById(R.id.edtusername);
        edtpassword =findViewById(R.id.edtpassword);
        btnlogin =findViewById(R.id.btnlogin);



    }

    public void fun1(View view) {
        if(edtusername.equals("admin007@gmail.com") && edtpassword.equals("1234567")) {
            Intent a1 = new Intent(this, MainActivity2.class);
            startActivity(a1);
            finish();
        }else{
            Toast.makeText(this, "Username or Password is wrong", Toast.LENGTH_SHORT).show();
        }
    }
}