package edu.wit.mobileapp.mobileappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button definitions
        Button reset = findViewById(R.id.reset);
        Button next = findViewById(R.id.next);

        //method used to go to next activity
        next.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, MainActivity2.class);

                //category weight percentages edittext fields set
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

                //category name edittext fields set
                EditText name1 = findViewById(R.id.name1);
                EditText name2 = findViewById(R.id.name2);
                EditText name3 = findViewById(R.id.name3);
                EditText name4 = findViewById(R.id.name4);
                EditText name5 = findViewById(R.id.name5);
                EditText name6 = findViewById(R.id.name6);
                EditText name7 = findViewById(R.id.name7);
                EditText name8 = findViewById(R.id.name8);
                EditText name9 = findViewById(R.id.name9);
                EditText name10 = findViewById(R.id.name10);

                //weight percentages converted to string
                String w1 = weight1.getText().toString();
                String w2 = weight2.getText().toString();
                String w3 = weight3.getText().toString();
                String w4 = weight4.getText().toString();
                String w5 = weight5.getText().toString();
                String w6 = weight6.getText().toString();
                String w7 = weight7.getText().toString();
                String w8 = weight8.getText().toString();
                String w9 = weight9.getText().toString();
                String w10 = weight10.getText().toString();

                //category names converted to string
                String n1 = name1.getText().toString();
                String n2 = name2.getText().toString();
                String n3 = name3.getText().toString();
                String n4 = name4.getText().toString();
                String n5 = name5.getText().toString();
                String n6 = name6.getText().toString();
                String n7 = name7.getText().toString();
                String n8 = name8.getText().toString();
                String n9 = name9.getText().toString();
                String n10 = name10.getText().toString();

                //bundling takes place
                Bundle bundle = new Bundle();

                //bundling names
                bundle.putString("n1", n1);
                bundle.putString("n2", n2);
                bundle.putString("n3", n3);
                bundle.putString("n4", n4);
                bundle.putString("n5", n5);
                bundle.putString("n6", n6);
                bundle.putString("n7", n7);
                bundle.putString("n8", n8);
                bundle.putString("n9", n9);
                bundle.putString("n10", n10);

                //bundling weight percentages
                bundle.putString("w1", w1);
                bundle.putString("w2", w2);
                bundle.putString("w3", w3);
                bundle.putString("w4", w4);
                bundle.putString("w5", w5);
                bundle.putString("w6", w6);
                bundle.putString("w7", w7);
                bundle.putString("w8", w8);
                bundle.putString("w9", w9);
                bundle.putString("w10", w10);

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });

        //method used to reset
        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //category weight percentages edittext fields set
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

                //category name edittext fields set
                EditText name1 = findViewById(R.id.name1);
                EditText name2 = findViewById(R.id.name2);
                EditText name3 = findViewById(R.id.name3);
                EditText name4 = findViewById(R.id.name4);
                EditText name5 = findViewById(R.id.name5);
                EditText name6 = findViewById(R.id.name6);
                EditText name7 = findViewById(R.id.name7);
                EditText name8 = findViewById(R.id.name8);
                EditText name9 = findViewById(R.id.name9);
                EditText name10 = findViewById(R.id.name10);

                weight1.setText("");
                weight2.setText("");
                weight3.setText("");
                weight4.setText("");
                weight5.setText("");
                weight6.setText("");
                weight7.setText("");
                weight8.setText("");
                weight9.setText("");
                weight10.setText("");

                name1.setText("");
                name2.setText("");
                name3.setText("");
                name4.setText("");
                name5.setText("");
                name6.setText("");
                name7.setText("");
                name8.setText("");
                name9.setText("");
                name10.setText("");

            }
        });
    }
}
