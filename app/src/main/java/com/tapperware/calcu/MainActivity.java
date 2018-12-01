package com.tapperware.calcu;

import android.app.Notification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button satu;
    private Button dua;
    private Button tiga;
    private Button empat;
    private Button lima;
    private Button enam;
    private Button tujuh;
    private Button delapan;
    private Button sembilan;
    private Button nol;
    private Button plus;
    private Button minus;
    private Button bagi;
    private Button kali;
    private Button sama;
    private Button koma;
    private Button clear;
    private TextView info;
    private TextView result;
    private final char pertambahan = '+';
    private final char pengurangan = '-';
    private final char pembagian = '/';
    private final char perkalian = '*';
    private final char EQU = 0;
    private Double val1 = Double.NaN;
    private Double val2;
    private char ACTION;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUiViews();

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });

        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });

        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });

        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = pertambahan;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = pengurangan;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);

            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = pembagian;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);

            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = perkalian;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);

            }
        });

        sama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                info.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length() > 0){
                    CharSequence nama = info.getText().toString();
                    info.setText(nama.subSequence(0, nama.length()-1));

                }else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });
    }

    private void setupUiViews(){
        satu = (Button)findViewById(R.id.btn1);
        dua = (Button)findViewById(R.id.btn2);
        tiga = (Button)findViewById(R.id.btn3);
        empat = (Button)findViewById(R.id.btn4);
        lima = (Button)findViewById(R.id.btn5);
        enam = (Button)findViewById(R.id.btn6);
        tujuh = (Button)findViewById(R.id.btn7);
        delapan = (Button)findViewById(R.id.btn8);
        sembilan = (Button)findViewById(R.id.btn9);
        nol = (Button)findViewById(R.id.btn0);
        plus = (Button)findViewById(R.id.btnPlus);
        minus = (Button)findViewById(R.id.btnMinus);
        kali = (Button)findViewById(R.id.btnkali);
        bagi = (Button)findViewById(R.id.btnBagi);
        sama = (Button)findViewById(R.id.btnSama);
        info = (TextView)findViewById(R.id.tvControl);
        result = (TextView)findViewById(R.id.tvResult);
        clear = (Button)findViewById(R.id.btnClear);
    }
    private void compute(){
        if (!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());

            switch (ACTION){
                case pertambahan:
                    val1 = val1 + val2;
                    break;
                case pengurangan:
                    val1 = val1 - val2;
                    break;
                case pembagian:
                    val1 = val1 / val2;
                    break;
                case perkalian:
                    break;
                case EQU:
                    break;
            }

        }
        else {
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}
