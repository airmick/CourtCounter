package dev.airmick.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitFreeThrow(View view)
    {
        int freeThrow = 1;
        score += freeThrow;
        displayForTeamA(score);
    }

    public void submit3points(View view)
    {
        int threePoint = 3;
        score += threePoint;
        displayForTeamA(score);
    }

    public void submit2points(View view)
    {
        int twoPoints = 2;
        score += twoPoints;
        displayForTeamA(score);
    }

    public void addOnePointTeamB(View view)
    {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void addTwoPointsTeamB(View view)
    {
        scoreB += 2;
        displayForTeamB(scoreB);
    }
    public void addThreePointsTeamB(View view)
    {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void resetButton(View view){
        score = 0;
        scoreB = 0;
        displayForTeamA(score);
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}