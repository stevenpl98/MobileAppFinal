package edu.wit.mobileapp.mobileappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button calculate = findViewById(R.id.calc);
        Bundle bundle = this.getIntent().getExtras();

        EditText weight1 = findViewById(R.id.weight1);
        EditText weight2 = findViewById(R.id.weight2);
        EditText weight3 = findViewById(R.id.weight3);
        EditText weight4 = findViewById(R.id.weight4);
        EditText weight5 = findViewById(R.id.weight5);
        EditText weight6 = findViewById(R.id.weight6);
        EditText weight7 = findViewById(R.id.weight7);
        EditText weight8 = findViewById(R.id.weight8);
        EditText weight9 = findViewById(R.id.weight9);
        EditText weight10 = findViewById(R.id.weight10);

        EditText Name1 = findViewById(R.id.Name1);
        EditText Name2 = findViewById(R.id.Name2);
        EditText Name3 = findViewById(R.id.Name3);
        EditText Name4 = findViewById(R.id.Name4);
        EditText Name5 = findViewById(R.id.Name5);
        EditText Name6 = findViewById(R.id.Name6);
        EditText Name7 = findViewById(R.id.Name7);
        EditText Name8 = findViewById(R.id.Name8);
        EditText Name9 = findViewById(R.id.Name9);
        EditText Name10 = findViewById(R.id.Name10);

        String N1 = bundle.getString("n1");
        String N2 = bundle.getString("n2");
        String N3 = bundle.getString("n3");
        String N4 = bundle.getString("n4");
        String N5 = bundle.getString("n5");
        String N6 = bundle.getString("n6");
        String N7 = bundle.getString("n7");
        String N8 = bundle.getString("n8");
        String N9 = bundle.getString("n9");
        String N10 = bundle.getString("n10");

        Name1.setText(N1);
        Name2.setText(N2);
        Name3.setText(N3);
        Name4.setText(N4);
        Name5.setText(N5);
        Name6.setText(N6);
        Name7.setText(N7);
        Name8.setText(N8);
        Name9.setText(N9);
        Name10.setText(N10);

       /* calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }); */
    }
}
