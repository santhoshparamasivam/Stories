package com.example.sathya.stories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sathya.stories.Utilities.PrefManager;

public class Login extends AppCompatActivity {
EditText username,password;
Button login,register;
String uname,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.login);
        register=(Button)findViewById(R.id.register);

        if (!new PrefManager(this).isUserLogedOut()) {
            startHomeActivity();
        }
        login.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        uname = username.getText().toString();
        pass = password.getText().toString();
        if ((username.length() < 1 ))
        {
            username.setError("Please Enter Your Username");
        }
        else if((password.length()<6 || password.length()>10))
        {

            password.setError("Please Enter Valid Password");
        }
        else{
            saveLoginDetails();
        }
    }
});
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() < 6  || s.length()>10) {

                    password.setError("Password should be 6 to 10 character");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent S=new Intent(Login.this,Register.class);
                startActivity(S);
                finish();
            }
        });

    }

    private void saveLoginDetails() {
        new PrefManager(this).saveLoginDetails(uname, pass);
    }

    private void startHomeActivity() {

        Intent S=new Intent(Login.this,Mainpage.class);
        startActivity(S);
    }
}
