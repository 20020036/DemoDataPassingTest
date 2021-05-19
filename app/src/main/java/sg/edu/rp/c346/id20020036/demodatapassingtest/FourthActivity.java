package sg.edu.rp.c346.id20020036.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer = findViewById(R.id.tvAnswer);
        tvAnswer.setText("In Fourth Activty");

        Intent receiveInt = getIntent();
        double valueDouble = receiveInt.getDoubleExtra("value", 0.0);
        tvAnswer.setText("Double value received is " + valueDouble);
    }
}