package com.nurita.quizku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText username, password;
    Button login;
    String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        login=(Button) findViewById(R.id.btnlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=username.getText().toString();
                b=password.getText().toString();
                if (a.equals("")){
                    username.setError("Username kosong");
                }
                else if (b.equals("")){
                    password.setError("Password kosong");
                }
                else if ((a.equals("nurita"))&&(b.equals("1234"))) {
                    Intent i;
                    i=new Intent(MainActivity.this, KuisActivity.class);
                    i.putExtra("username",username.getText().toString());
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this,"Login Gagal Brooo...",Toast.LENGTH_LONG).show();

                }
            }
        });



    }
}
