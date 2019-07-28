package edu.wit.mobileapp.mobileappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity2 extends AppCompatActivity
{
    //weight percentages from previous activity defined as string for whole class to see
    static String w1;
    static String w2;
    static String w3;
    static String w4;
    static String w5;
    static String w6;
    static String w7;
    static String w8;
    static String w9;
    static String w10;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //calculator button
        Button calculate = findViewById(R.id.calc);

        //pull bundle from last activity
        Bundle bundle = this.getIntent().getExtras();

        ////category name edittext fields set
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

        //category names pulled from bundle
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

        //category names set from bundle
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

        //weight percentages pulled from bundle
        w1 = bundle.getString("w1");
        w2 = bundle.getString("w2");
        w3 = bundle.getString("w3");
        w4 = bundle.getString("w4");
        w5 = bundle.getString("w5");
        w6 = bundle.getString("w6");
        w7 = bundle.getString("w7");
        w8 = bundle.getString("w8");
        w9 = bundle.getString("w9");
        w10 = bundle.getString("w10");

        //this method calculates average weighted grade
       calculate.setOnClickListener(new View.OnClickListener()
       {
            @Override
            public void onClick(View v)
            {
                //edit textfields for set for grades inserted
                EditText grade1 = findViewById(R.id.grade1);
                EditText grade2 = findViewById(R.id.grade2);
                EditText grade3 = findViewById(R.id.grade3);
                EditText grade4 = findViewById(R.id.grade4);
                EditText grade5 = findViewById(R.id.grade5);
                EditText grade6 = findViewById(R.id.grade6);
                EditText grade7 = findViewById(R.id.grade7);
                EditText grade8 = findViewById(R.id.grade8);
                EditText grade9 = findViewById(R.id.grade9);
                EditText grade10 = findViewById(R.id.grade10);

                //grades converted to string
                String g1 = grade1.getText().toString();
                String g2 = grade2.getText().toString();
                String g3 = grade3.getText().toString();
                String g4 = grade4.getText().toString();
                String g5 = grade5.getText().toString();
                String g6 = grade6.getText().toString();
                String g7 = grade7.getText().toString();
                String g8 = grade8.getText().toString();
                String g9 = grade9.getText().toString();
                String g10 = grade10.getText().toString();

                //final course grade result
                EditText result = findViewById(R.id.Result);

                double average;

                /** Each statement checks if the current or following grade field is empty, if it is the...
                /* the app goes through, parses the weight and grade into a double value and calculates the average and sets the final course grade result at the end*/
                if (g1.equals(""))
                {
                    average= 0;
                    result.setText(Double.toString(average));
                }
                else if (g2.equals(""))
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    average = W1 * G1 / 100;
                    result.setText(Double.toString(average));
                }
                else if (g3.equals(""))
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    double G2 = Double.parseDouble(g2);
                    double W2 = Double.parseDouble(w2);
                    average = W1 * G1 / 100 + W2 * G2 / 100;
                    result.setText(Double.toString(average));
                }
                else if (g4.equals(""))
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    double G2 = Double.parseDouble(g2);
                    double W2 = Double.parseDouble(w2);
                    double G3 = Double.parseDouble(g3);
                    double W3 = Double.parseDouble(w3);
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100;
                    result.setText(Double.toString(average));
                }
                else if (g5.equals(""))
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    double G2 = Double.parseDouble(g2);
                    double W2 = Double.parseDouble(w2);
                    double G3 = Double.parseDouble(g3);
                    double W3 = Double.parseDouble(w3);
                    double G4 = Double.parseDouble(g4);
                    double W4 = Double.parseDouble(w4);
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100;
                    result.setText(Double.toString(average));
                }
                else if (g6.equals(""))
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    double G2 = Double.parseDouble(g2);
                    double W2 = Double.parseDouble(w2);
                    double G3 = Double.parseDouble(g3);
                    double W3 = Double.parseDouble(w3);
                    double G4 = Double.parseDouble(g4);
                    double W4 = Double.parseDouble(w4);
                    double G5 = Double.parseDouble(g5);
                    double W5 = Double.parseDouble(w5);
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100;
                    result.setText(Double.toString(average));
                }
                else if (g7.equals(""))
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    double G2 = Double.parseDouble(g2);
                    double W2 = Double.parseDouble(w2);
                    double G3 = Double.parseDouble(g3);
                    double W3 = Double.parseDouble(w3);
                    double G4 = Double.parseDouble(g4);
                    double W4 = Double.parseDouble(w4);
                    double G5 = Double.parseDouble(g5);
                    double W5 = Double.parseDouble(w5);
                    double G6 = Double.parseDouble(g6);
                    double W6 = Double.parseDouble(w6);
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100;
                    result.setText(Double.toString(average));
                }
                else if (g8.equals(""))
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    double G2 = Double.parseDouble(g2);
                    double W2 = Double.parseDouble(w2);
                    double G3 = Double.parseDouble(g3);
                    double W3 = Double.parseDouble(w3);
                    double G4 = Double.parseDouble(g4);
                    double W4 = Double.parseDouble(w4);
                    double G5 = Double.parseDouble(g5);
                    double W5 = Double.parseDouble(w5);
                    double G6 = Double.parseDouble(g6);
                    double W6 = Double.parseDouble(w7);
                    double G7 = Double.parseDouble(g7);
                    double W7 = Double.parseDouble(w7);
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100
                            + W7 * G7 / 100;
                    result.setText(Double.toString(average));
                }
                else if (g9.equals(""))
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    double G2 = Double.parseDouble(g2);
                    double W2 = Double.parseDouble(w2);
                    double G3 = Double.parseDouble(g3);
                    double W3 = Double.parseDouble(w3);
                    double G4 = Double.parseDouble(g4);
                    double W4 = Double.parseDouble(w4);
                    double G5 = Double.parseDouble(g5);
                    double W5 = Double.parseDouble(w5);
                    double G6 = Double.parseDouble(g6);
                    double W6 = Double.parseDouble(w6);
                    double G7 = Double.parseDouble(g7);
                    double W7 = Double.parseDouble(w7);
                    double G8 = Double.parseDouble(g8);
                    double W8 = Double.parseDouble(w8);
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100
                            + W7 * G7 / 100 + W8 * G8 / 100;
                    result.setText(Double.toString(average));
                }
                else if (g10.equals(""))
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    double G2 = Double.parseDouble(g2);
                    double W2 = Double.parseDouble(w2);
                    double G3 = Double.parseDouble(g3);
                    double W3 = Double.parseDouble(w3);
                    double G4 = Double.parseDouble(g4);
                    double W4 = Double.parseDouble(w4);
                    double G5 = Double.parseDouble(g5);
                    double W5 = Double.parseDouble(w5);
                    double G6 = Double.parseDouble(g6);
                    double W6 = Double.parseDouble(w6);
                    double G7 = Double.parseDouble(g7);
                    double W7 = Double.parseDouble(w7);
                    double G8 = Double.parseDouble(g8);
                    double W8 = Double.parseDouble(w8);
                    double G9 = Double.parseDouble(g9);
                    double W9 = Double.parseDouble(w9);
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100
                            + W7 * G7 / 100 + W8 * G8 / 100 + W9 * G9 / 100;
                    result.setText(Double.toString(average));
                }

                else
                {
                    double G1 = Double.parseDouble(g1);
                    double W1 = Double.parseDouble(w1);
                    double G2 = Double.parseDouble(g2);
                    double W2 = Double.parseDouble(w2);
                    double G3 = Double.parseDouble(g3);
                    double W3 = Double.parseDouble(w3);
                    double G4 = Double.parseDouble(g4);
                    double W4 = Double.parseDouble(w4);
                    double G5 = Double.parseDouble(g5);
                    double W5 = Double.parseDouble(w5);
                    double G6 = Double.parseDouble(g6);
                    double W6 = Double.parseDouble(w6);
                    double G7 = Double.parseDouble(g7);
                    double W7 = Double.parseDouble(w7);
                    double G8 = Double.parseDouble(g8);
                    double W8 = Double.parseDouble(w8);
                    double G9 = Double.parseDouble(g9);
                    double W9 = Double.parseDouble(w9);
                    double G10 = Double.parseDouble(g10);
                    double W10 = Double.parseDouble(w10);
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100
                            + W7 * G7 / 100 + W8 * G8 / 100 + W9 * G9 / 100 + W10 * G10 / 100;
                    result.setText(Double.toString(average));
                }
            }
        });
    }
}
