package android.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void answer(View view) {
        CheckBox answerTwoQuestionOne = findViewById(R.id.q1A2);
        boolean correctAnswerQuestionOne = answerTwoQuestionOne.isChecked();
        questionOneAnswer(correctAnswerQuestionOne);



    }

    /**
     * This method makes a toast for question one and global variable @correctScore keeps correct score.
     */
    public void questionOneAnswer(boolean correctAnswer){
        CheckBox answerOneQuestionOne = findViewById(R.id.q1A1);
        boolean questionOneWrongAnswerOne = answerOneQuestionOne.isChecked();
        CheckBox answerThreeQuestionOne = findViewById(R.id.q1A3);
        boolean questionOneWrongAnswerThree = answerThreeQuestionOne.isChecked();
        CheckBox answerFourQuestionOne = findViewById(R.id.q1A4);
        boolean questionOneWrongAnswerFour = answerFourQuestionOne.isChecked();

        if (correctAnswer == true){
        Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        correctScore +=1;
        displayScore(correctScore);
        }

        if (questionOneWrongAnswerOne || questionOneWrongAnswerThree || questionOneWrongAnswerFour == true){
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }

    }


    private void displayScore(int Score){
        TextView scoreTotal = findViewById(R.id.score);
        scoreTotal.setText(Score);
    }
}

