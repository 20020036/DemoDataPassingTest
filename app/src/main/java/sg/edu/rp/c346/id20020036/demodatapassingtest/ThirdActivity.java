package sg.edu.rp.c346.id20020036.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer = findViewById(R.id.tvAnswer);
        tvAnswer.setText("In Third Activity");

        Intent receiveInt = getIntent();
        char valueChar = receiveInt.getCharExtra("value", 'A');
        tvAnswer.setText("Char value received is " + valueChar);
    }
}