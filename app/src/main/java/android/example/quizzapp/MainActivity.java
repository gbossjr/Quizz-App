package android.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correctScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method makes a toast for question one and global variable @correctScore keeps correct score.
     *
     */

    public void displayTotal(View view) {
        RadioButton correctAnswerQuestion1 = findViewById(R.id.q1C);
        RadioButton correctAnswerQuestion2 = findViewById(R.id.q2D);
        CheckBox question3CorrectAnswer1 = findViewById(R.id. q3B);
        CheckBox question3CorrectAnswer2 = findViewById(R.id. q3C);
        CheckBox question3CorrectAnswer3 = findViewById(R.id. q3D);
        EditText question4Response = findViewById(R.id.yesNoResponse);
        String question4String = question4Response.getText().toString().toLowerCase();

        if (correctAnswerQuestion1.isChecked()){
            correctScore +=1;
        }

        if (correctAnswerQuestion2.isChecked()){
            correctScore +=1;
        }

        if (question3CorrectAnswer1.isChecked() && question3CorrectAnswer2.isChecked() && question3CorrectAnswer3.isChecked()) {
            correctScore +=1;
        }

        if (question4String.equals("yes")){
            correctScore +=1;
        }

        if (question4String.equals("no")){
            correctScore +=1;
        }

        Toast.makeText(this, "Total Score is " + correctScore + " out of ", Toast.LENGTH_SHORT).show();
        correctScore = 0;
    }
}


