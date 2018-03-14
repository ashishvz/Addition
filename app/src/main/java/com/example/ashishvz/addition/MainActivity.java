package com.example.ashishvz.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstnumber;
    EditText secondnumber;
    Button add;
    TextView result;

    double num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber = findViewById(R.id.editText);
        secondnumber = findViewById(R.id.editText2);
        add = findViewById(R.id.button);
        result = findViewById(R.id.textView4);

        if (secondnumber.toString() == null) {

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    num1 = Double.parseDouble(firstnumber.getText().toString());
                    num2 = Double.parseDouble(secondnumber.getText().toString());

                    sum = num1 + num2;
                    result.setText(Double.toString(sum));
                }
            });
        }
    }
}
