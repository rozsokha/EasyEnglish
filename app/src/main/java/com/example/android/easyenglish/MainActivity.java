package com.example.android.easyenglish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	private RadioGroup radioGroupQ1, radioGroupQ2;
	private TextView txtResult;
	private EditText txtUsername;
	int quantity = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		radioGroupQ1 = (RadioGroup) findViewById(R.id.q1);
		radioGroupQ1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup radioGroup, int id) {
				if (id == R.id.q1a1) {
					quantity = quantity + 1;
				} else if (quantity !=0) {
					quantity = quantity - 1;
				}

			}
		});

		radioGroupQ2 = (RadioGroup) findViewById(R.id.q2);
		radioGroupQ2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup radioGroup, int id) {
				if (id == R.id.q2a2) {
					quantity = quantity + 1;
				} else if (quantity !=0) {
					quantity = quantity - 1;
				}

			}
		});

		txtResult = (TextView) findViewById(R.id.txtResult);
		txtUsername = (EditText) findViewById(R.id.txtUsername);
	}

	/** Called when the user touches the button */
	public void showResult(View view) {
		if (radioGroupQ1.getCheckedRadioButtonId()!= -1 && radioGroupQ2.getCheckedRadioButtonId()!= -1) {
		  txtResult.setText("Hey! " + txtUsername.getText() + ", your score is " + quantity + "/2!");}
	}

}

