package com.example.true_mentor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView scored,total;
    private Button doneBtn,suggestionBtn,tryAgainBtn;
    private TextView suggestionTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        scored = findViewById(R.id.scored);
        total = findViewById(R.id.total);
        doneBtn = findViewById(R.id.done_btn);
        suggestionBtn = findViewById(R.id.suggestion_btn);
        suggestionTV = findViewById(R.id.suggestion_tv);
        tryAgainBtn = findViewById(R.id.try_again);


        scored.setText(String.valueOf(getIntent().getIntExtra("score",0)));
        total.setText("Out of "+String.valueOf(getIntent().getIntExtra("total",0)));

        suggestionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer integer = Integer.parseInt(scored.getText().toString());
                if (integer <= 5 ){
                    suggestionTV.setText("You Need to explore more in your recommended career. \n You can take the test again of another set or you can visit our website to know more about your recommended career in detail.\n Thank You ! Happy Mentoring !!!");
                }else if (integer > 5 ){
                    suggestionTV.setText("You have the basic knowledge in your recommended career. \n You can take the test again of another set or you can visit our website to know more about your recommended career in detail.\n Thank You ! Happy Mentoring !!!");
                }
            }
        });

        tryAgainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this,CategoriesActivity.class);
                startActivity(intent);
            }
        });

        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScoreActivity.this,WebView2.class);
                startActivity(intent);
            }
        });
    }
}