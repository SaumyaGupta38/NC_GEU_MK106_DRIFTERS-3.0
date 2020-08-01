package com.example.true_mentor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EducationLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_level);


    }

    public void goToCareers (View view) {

        Intent intent = new Intent(this, CategoriesActivity.class);
        startActivity(intent);
    }

    public void postIntermediate (View view) {

        Intent intent = new Intent(this, PostIntermediate.class);
        startActivity(intent);
    }

    public void postGraduation (View view) {

        Intent intent = new Intent(this, PostGraduation.class);
        startActivity(intent);

    }


    public void professional (View view) {

        Intent intent = new Intent(this, Professional.class);
        startActivity(intent);
    }

}