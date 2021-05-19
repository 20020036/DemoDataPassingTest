package sg.edu.rp.c346.id20020036.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvAnswer = findViewById(R.id.tvAnswer);

        tvAnswer.setText("In Second Activity");
        Intent receiveInt = getIntent();
        int valueInt = receiveInt.getIntExtra("value", -1);
        //char valueChar = receiveInt.getCharExtra("value", 'A');
        tvAnswer.setText("Integer value received is " + valueInt);

        //OR
        //tvAnswer.setText("Integer value received is " + valueInt + "\nChar value is " + valueChar);



    }
}