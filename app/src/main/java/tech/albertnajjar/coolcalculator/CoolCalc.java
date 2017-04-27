package tech.albertnajjar.coolcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CoolCalc extends Activity {

	TextView result;

	String runningNumb = "0";
	String leftVal = "", rightVal = "";
	int res;
	private enum Operation {ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUAL}
	Operation currentOp;
	boolean zerodiv = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cool_calc);

		Button b0 = (Button) findViewById(R.id.button0);
		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);
		Button b3 = (Button) findViewById(R.id.button3);
		Button b4 = (Button) findViewById(R.id.button4);
		Button b5 = (Button) findViewById(R.id.button5);
		Button b6 = (Button) findViewById(R.id.button6);
		Button b7 = (Button) findViewById(R.id.button7);
		Button b8 = (Button) findViewById(R.id.button8);
		Button b9 = (Button) findViewById(R.id.button9);
		ImageButton div = (ImageButton) findViewById(R.id.divButton);
		ImageButton mult = (ImageButton) findViewById(R.id.multButton);
		ImageButton sub = (ImageButton) findViewById(R.id.subButton);
		ImageButton add = (ImageButton) findViewById(R.id.addButton);
		Button clr = (Button) findViewById(R.id.clearButton);
		ImageButton eq = (ImageButton) findViewById(R.id.equalsButton);
		result = (TextView) findViewById(R.id.resultsText);
		result.setText("0");

		b0.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(0);
			}
		});
		b1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(1);
			}
		});
		b2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(2);
			}
		});
		b3.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(3);
			}
		});
		b4.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(4);
			}
		});
		b5.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(5);
			}
		});
		b6.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(6);
			}
		});
		b7.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(7);
			}
		});
		b8.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(8);
			}
		});
		b9.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				press(9);
			}
		});
		clr.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				runningNumb = "";
				result.setText("0");
			}
		});
		add.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				process(Operation.ADD);
			}
		});
		sub.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				process(Operation.SUBTRACT);
			}
		});
		div.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				process(Operation.DIVIDE);
			}
		});
		mult.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				process(Operation.MULTIPLY);
			}
		});
		eq.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				process(Operation.EQUAL);
			}
		});
	}

	void press(int num){
		runningNumb+= String.valueOf(num);
		result.setText(runningNumb);
	}

	void process(Operation op){
		if(currentOp != null) {
			if (!runningNumb.equals("")) {
				rightVal = runningNumb;
				runningNumb = "";

				switch (currentOp) {
					case ADD:
						res = Integer.parseInt(leftVal) + Integer.parseInt(rightVal);
						break;
					case SUBTRACT:
						res = Integer.parseInt(leftVal) - Integer.parseInt(rightVal);
						break;
					case MULTIPLY:
						res = Integer.parseInt(leftVal) * Integer.parseInt(rightVal);
						break;
					case DIVIDE:
						if (!rightVal.equals("0")) {
							res = Integer.parseInt(leftVal) / Integer.parseInt(rightVal);
						} else {
							zerodiv = true;
						}
						break;
					case EQUAL:
						res = Integer.parseInt(rightVal);
						break;
				}
				leftVal = String.valueOf(res);
				if(zerodiv) {
					runningNumb = "0";
					leftVal = "";
					rightVal = "";
					currentOp = null;
					result.setText("ERROR");
					zerodiv = false;
				}
				else
					result.setText(leftVal);
			}
		}
		else{
			leftVal = runningNumb;
			runningNumb = "0";
		}
		currentOp = op;
	}
}