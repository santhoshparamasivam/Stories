package com.example.sathya.stories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class Register extends AppCompatActivity {
EditText username,password,Phone,Email;
Button login,register;
String uname,pass,email,phone;
    private EditText inputEmail, inputPassword;
    private Button btnSignIn, btnSignUp, btnResetPassword;
    private ProgressBar progressBar;
//    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
//        username=(EditText)findViewById(R.id.Username);
//        password=(EditText)findViewById(R.id.pass);
//        Phone=(EditText)findViewById(R.id.Phone);
//        Email=(EditText)findViewById(R.id.Email);
//        login=(Button)findViewById(R.id.login);
//        register=(Button)findViewById(R.id.register);
//
//        register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                uname = username.getText().toString();
//                pass = password.getText().toString();
//                email = Email.getText().toString();
//                phone = Phone.getText().toString();
//                if ((username.length() < 1 ))
//                {
//                    username.setError("Please Enter Your Username");
//                }
//                else if((password.length()<6 || password.length()>10))
//                {
//
//                    password.setError("Password should be 6 to 10 character");
//                }  else if((Email.length()<1 ))
//                {
//
//                    Email.setError("Please Enter Valid Email");
//                }  else if((Phone.length()<6 || Phone.length()>10))
//                {
//
//                    Phone.setError("Password should be 6 to 10 character");
//                }else{
//                    SaveRegister();
//                }
//            }
//        });
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent S=new Intent(Register.this,Login.class);
//                startActivity(S);
//                finish();
//            }
//        });
//        password.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (s.length() < 6  || s.length()>10) {
//
//                    password.setError("Password should be 6 to 10 character");
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//
//    }
//
//    private void SaveRegister() {
//
    }
}
