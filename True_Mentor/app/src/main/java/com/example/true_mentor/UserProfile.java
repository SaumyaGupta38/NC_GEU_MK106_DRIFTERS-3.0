package com.example.true_mentor;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UserProfile extends AppCompatActivity {

    TextInputLayout fullName,email,phoneNo,password;
    TextView fullNameLabel,usernameLabel;

    //Global variables to hold user data inside this activity
    String _USERNAME,_NAME,_EMAIL,_PASSWORD,_PHONENO;

    DatabaseReference reference;

    private Dialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_profile);

        reference = FirebaseDatabase.getInstance().getReference("users");

        //Hooks
        fullName = findViewById(R.id.full_name_profile);
        email = findViewById(R.id.email_profile);
        phoneNo = findViewById(R.id.phone_no_profile);
        password = findViewById(R.id.password_profile);
        fullNameLabel = findViewById(R.id.full_name_field);
        usernameLabel = findViewById(R.id.username_field);

        loadingDialog = new Dialog(this);
        loadingDialog.setContentView(R.layout.loading);
        loadingDialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.rounded_corners));
        loadingDialog.getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        loadingDialog.setCancelable(false);

        //ShowAllData

        showAllUserData();

    }

    private void showAllUserData() {

        Intent intent = getIntent();
        _NAME = intent.getStringExtra("name");
        _USERNAME = intent.getStringExtra("username");
        _EMAIL = intent.getStringExtra("email");
        _PHONENO = intent.getStringExtra("phoneNo");
        _PASSWORD = intent.getStringExtra("password");

        fullNameLabel.setText(_NAME);
        usernameLabel.setText(_USERNAME);
        fullName.getEditText().setText(_NAME);
        email.getEditText().setText(_EMAIL);
        phoneNo.getEditText().setText(_PHONENO);
        password.getEditText().setText(_PASSWORD);

    }

    public void startTest (View view){

        Intent intent = new Intent(this,WebView1.class);
        startActivity(intent);

    }

    public void update (View view){

        if( isNameChanged() || isPasswordChanged()){
            Toast.makeText(this, "Data has been updated", Toast.LENGTH_LONG).show();

        }
        else Toast.makeText(this, "Data  is same and can not be updated", Toast.LENGTH_LONG).show();

    }

    private boolean isPasswordChanged() {

        if(!_PASSWORD.equals(password.getEditText().getText().toString()))
        {
            reference.child(_USERNAME).child("password").setValue(password.getEditText().getText().toString());
            _PASSWORD = password.getEditText().getText().toString();
            return true;
        }else{
            return false;
        }

    }

    private boolean isNameChanged() {

        if(!_NAME.equals(fullName.getEditText().getText().toString())){
            reference.child(_USERNAME).child("name").setValue(fullName.getEditText().getText().toString());
            _NAME = fullName.getEditText().getText().toString();
            return true;
        }else{
            return false;
        }

    }

}