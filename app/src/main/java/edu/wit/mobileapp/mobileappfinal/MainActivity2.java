package edu.wit.mobileapp.mobileappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity
{

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
        Button calculate = findViewById(R.id.calc);
        Bundle bundle = this.getIntent().getExtras();

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

        Name1.setText(String.format("%.2f",N1));
        Name2.setText(String.format("%.2f",N2));
        Name3.setText(String.format("%.2f",N3));
        Name4.setText(String.format("%.2f",N4));
        Name5.setText(String.format("%.2f",N5));
        Name6.setText(String.format("%.2f",N6));
        Name7.setText(String.format("%.2f",N7));
        Name8.setText(String.format("%.2f",N8));
        Name9.setText(String.format("%.2f",N9));
        Name10.setText(String.format("%.2f",N10));

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

       calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                TextView grade = findViewById(R.id.grade);

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

                double G1 = Double.parseDouble(g1);
                double G2 = Double.parseDouble(g2);
                double G3 = Double.parseDouble(g3);
                double G4 = Double.parseDouble(g4);
                double G5 = Double.parseDouble(g5);
                double G6 = Double.parseDouble(g6);
                double G7 = Double.parseDouble(g7);
                double G8 = Double.parseDouble(g8);
                double G9 = Double.parseDouble(g9);
                double G10 = Double.parseDouble(g10);

                double W1 = Double.parseDouble(w1);
                double W2 = Double.parseDouble(w2);
                double W3 = Double.parseDouble(w3);
                double W4 = Double.parseDouble(w4);
                double W5 = Double.parseDouble(w5);
                double W6 = Double.parseDouble(w6);
                double W7 = Double.parseDouble(w7);
                double W8 = Double.parseDouble(w8);
                double W9 = Double.parseDouble(w9);
                double W10 = Double.parseDouble(w10);

                double average;
                if (grade1.getText().equals(""))
                {
                    grade.setText(Double.toString(0));
                }
                else if (grade2.getText().equals(""))
                {
                    average = W1 * G1 / 100;
                    grade.setText(Double.toString(average));
                }
                else if (grade3.getText().equals(""))
                {
                    average = W1 * G1 / 100 + W2 * G2 / 100;
                    grade.setText(Double.toString(average));
                }
                else if (grade4.getText().equals(""))
                {
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100;
                    grade.setText(Double.toString(average));
                }
                else if (grade5.getText().equals(""))
                {
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100;
                    grade.setText(Double.toString(average));
                }
                else if (grade6.getText().equals(""))
                {
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100;
                    grade.setText(Double.toString(average));
                }
                else if (grade7.getText().equals(""))
                {
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100;
                    grade.setText(Double.toString(average));
                }
                else if (grade8.getText().equals(""))
                {
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100
                            + W7 * G7 / 100;
                    grade.setText(Double.toString(average));
                }
                else if (grade9.getText().equals(""))
                {
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100
                            + W7 * G7 / 100 + W8 * G8 / 100;
                    grade.setText(Double.toString(average));
                }
                else if (grade10.getText().equals(""))
                {
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100
                            + W7 * G7 / 100 + W8 * G8 / 100 + W9 * G9 / 100;
                    grade.setText(Double.toString(average));
                }

                else
                {
                    average = W1 * G1 / 100 + W2 * G2 / 100 + W3 * G3 / 100 + W4 * G4 / 100 + W5 * G5 / 100 + W6 * G6 / 100
                            + W7 * G7 / 100 + W8 * G8 / 100 + W9 * G10 / 100 + W10 * G10 / 100;
                    grade.setText(Double.toString(average));
                }
            }
        });
    }
}
