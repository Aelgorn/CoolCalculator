package tech.albertnajjar.coolcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CoolCalc extends Activity {

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
	    TextView result = (TextView) findViewById(R.id.resultsText);

	    b0.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    b1.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    b2.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    b3.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    b4.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    b5.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    b6.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    b7.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    b8.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    b9.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    clr.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    add.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    sub.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    div.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    mult.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
	    eq.setOnClickListener(new View.OnClickListener(){
		    @Override
		    public void onClick(View v) {

		    }
	    });
    }
}
