package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
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
    private double num1 = Double.NaN;
    private double num2;
    private char EXECUTE;
    private final char ADD ='+';
    private final char SUB ='-';
    private final char DIV ='/';
    private final char MUL ='*';
    private final char OUT ='=';
    private final char PER ='%';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"9");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"8");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"7");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"6");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"5");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"4");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"3");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"2");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"1");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtT.setText(edtT.getText().toString()+"0");
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EXECUTE =MUL;
                compute();
                txtV.setText(String.valueOf(num1)+"*");
                edtT.setText(null);
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EXECUTE =DIV;
                compute();
                txtV.setText(String.valueOf(num1)+"/");
                edtT.setText(null);
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EXECUTE =SUB;
                compute();
                txtV.setText(String.valueOf(num1)+"-");
                edtT.setText(null);
            }
        });
        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EXECUTE=PER;
                compute();
                txtV.setText(String.valueOf(num1));
                edtT.setText(null);
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EXECUTE = ADD;
                compute();
                txtV.setText(String.valueOf(num1)+"+");
                edtT.setText(null);
            }
        });
        btnOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                EXECUTE = OUT;
                txtV.setText(String.valueOf(num1));
                edtT.setText(null);
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtT.getText().length()>0){
                    CharSequence name = edtT.getText().toString();
                    edtT.setText((name.subSequence(0, name.length()-1)));
                }else{
                    num1 =Double.NaN;
                    num2=Double.NaN;
                    edtT.setText(null);
                    txtV.setText(null);
                }
            }
        });
    }
    private void setupUI() {
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
        Button btnDec = (Button) findViewById(R.id.button_decimal);
        Button btnBra = (Button) findViewById(R.id.button_braces);
        Button btnPer = (Button) findViewById(R.id.button_percent);
        Button btnOut = (Button) findViewById(R.id.button_output);
        TextView txtV = (TextView) findViewById(R.id.textView);
        EditText edtT = (EditText) findViewById(R.id.editText);
    }
    private void compute() {
        if (!Double.isNaN(num1)) {
            num2 = Double.parseDouble(edtT.getText().toString());
        }
        switch (EXECUTE) {
            case ADD:
                num1 = num1 + num2;
                break;
            case SUB:
                num1 = num1 - num2;
                break;
            case DIV:
                num1 = num1 / num2;
                break;
            case MUL:
                num1 = num1 * num2;
                break;
            case PER:
                num1 = num1/100;
                break;
            case OUT:
                break;

        }
    }


}
