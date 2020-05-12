package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
//commit
public class MainActivity extends AppCompatActivity {

    private Button btn9;
    private Button btn8;
    private Button btn7;
    private Button btn6;
    private Button btn5;
    private Button btn4;
    private Button btn3;
    private Button btn2;
    private Button btn1;
    private Button btn0;
    private Button btnMul;
    private Button btnDiv;
    private Button btnAdd;
    private Button btnSub;
    private Button btnClr;
    private Button btnDec;
    private Button btnBra;
    private Button btnPer;
    private Button btnOut;
    private TextView txtV;
    private EditText edtT;
    float num1,num2;
    boolean ADD,SUB,DIV,MUL,PER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn9 = (Button) findViewById(R.id.button_9);
        Button btn8 = (Button) findViewById(R.id.button_8);
        Button btn7 = (Button) findViewById(R.id.button_7);
        Button btn6 = (Button) findViewById(R.id.button_6);
        Button btn5 = (Button) findViewById(R.id.button_5);
        Button btn4 = (Button) findViewById(R.id.button_4);
        Button btn3 = (Button) findViewById(R.id.button_3);
        Button btn2 = (Button) findViewById(R.id.button_2);
        Button btn1 = (Button) findViewById(R.id.button_1);
        Button btn0 = (Button) findViewById(R.id.button_zero);
        Button btnMul = (Button) findViewById(R.id.button_multiplication);
        Button btnDiv = (Button) findViewById(R.id.button_division);
        Button btnAdd = (Button) findViewById(R.id.button_addition);
        Button btnSub = (Button) findViewById(R.id.button_subtraction);
        Button btnClr = (Button) findViewById(R.id.button_clear);
        Button btnDel = (Button)findViewById(R.id.button_delete);
        Button btnDec = (Button) findViewById(R.id.button_decimal);
        Button btnBra = (Button) findViewById(R.id.button_braces);
        Button btnPer = (Button) findViewById(R.id.button_percent);
        Button btnOut = (Button) findViewById(R.id.button_output);
        final TextView txtV = (TextView) findViewById(R.id.textView);
        final EditText edtT = (EditText) findViewById(R.id.editText);

        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "9");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "8");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "7");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "6");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "5");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "4");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "3");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "2");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "1");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText() + "0");
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {          edtT.setText(edtT.getText() + ".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (edtT == null){
                    edtT.setText("");
                }else {
                    num1 = Float.parseFloat(edtT.getText() + "");
                    ADD = true;
                    edtT.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                num1 = Float.parseFloat(edtT.getText() + "");
                MUL = true ;
                txtV.setText((num1)+"*");
                edtT.setText(null);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                num1 = Float.parseFloat(edtT.getText() + "");
                DIV = true ;
                edtT.setText(null);
            }

        });
        btnSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(edtT.getText() + "");
                SUB = true ;
                edtT.setText(null);
            }
        });
        ///percentage
        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                num1 = Float.parseFloat(edtT.getText() + "");
                PER = true ;
                edtT.setText(null);
            }
        });

        btnOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(edtT.getText() + "");
                if (ADD == true) {

                    edtT.setText(num1 + num2 + "");
                    ADD = false;
                }


                if (SUB == true) {
                    edtT.setText(num1 - num2 + "");
                    SUB = false;
                }

                if (MUL == true) {
                    edtT.setText(num1 * num2 + "");
                    MUL = false;
                }

                if (DIV == true) {
                    edtT.setText(num1 / num2 + "");
                    DIV = false;
                }
                if (PER == true) {
                    edtT.setText(num1 / 100 + "");
                    PER = false;
                }
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtT.getText().length() > 0) {
                    CharSequence name = edtT.getText().toString();
                    edtT.setText((name.subSequence(0, name.length() - 1)));
                } else {
                    num1 = Float.NaN;
                    num2 = Float.NaN;
                    edtT.setText(null);
                    txtV.setText(null);
                }
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtV.setText("");
                edtT.setText("");
            }
        });
    }

}