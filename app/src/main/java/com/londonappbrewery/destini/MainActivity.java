package com.londonappbrewery.destini;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private int storyState = 1;
    private TextView storyTextView;
    private Button buttonTop;
    private Button buttonBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = findViewById(R.id.storyTextView);
        buttonTop = findViewById(R.id.buttonTop);
        buttonBottom = findViewById(R.id.buttonBottom);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("buttonTop", "Button Top Pressed!");
                updateStory(1);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("buttonTop", "Button Top Pressed!");
                updateStory(2);
            }
        });
    }

    private  void updateStory(int answerState) {
        if (storyState == 1) {
            if (answerState == 1) {
                storyState = 3;
                storyTextView.setText(R.string.T3_Story);
                buttonTop.setText(R.string.T3_Ans1);
                buttonBottom.setText(R.string.T3_Ans2);
            } else {
                storyState = 2;
                storyTextView.setText(R.string.T2_Story);
                buttonTop.setText(R.string.T2_Ans1);
                buttonBottom.setText(R.string.T2_Ans2);
            }
        } else if (storyState == 2) {
            if (answerState == 1) {
                storyState = 3;
                storyTextView.setText(R.string.T3_Story);
                buttonTop.setText(R.string.T3_Ans1);
                buttonBottom.setText(R.string.T3_Ans2);
            } else {
                storyState = 4;
                storyTextView.setText(R.string.T4_End);
            }
        } else if (storyState == 3) {
            if (answerState == 1) {
                storyState = 6;
                storyTextView.setText(R.string.T6_End);
            } else {
                storyState = 5;
                storyTextView.setText(R.string.T5_End);
            }
        }
    }
}
