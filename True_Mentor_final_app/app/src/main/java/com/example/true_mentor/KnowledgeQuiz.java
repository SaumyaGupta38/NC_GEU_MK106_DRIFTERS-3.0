package com.example.true_mentor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class KnowledgeQuiz extends AppCompatActivity {

    private Button startbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge_quiz);

        startbtn = findViewById(R.id.start_btn);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent categoryIntent = new Intent(KnowledgeQuiz.this,EducationLevel.class);
                startActivity(categoryIntent);
            }
        });

    }

    public void webView2 (View view){

        Intent intent = new Intent(this,WebView2.class);
        startActivity(intent);

    }

}