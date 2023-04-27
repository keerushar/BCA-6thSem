package com.kccsbca6thsem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton calcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        calcBtn = findViewById(R.id.calculateBtn);

//        calcBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                showDialog();
//            }
//        });
    }

//    private void showDialog(){
//        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//        builder.setTitle("Calculate Number");
//
//        LayoutInflater inflater = getLayoutInflater();
//        View view = inflater.inflate(R.layout.custom_layout, null);
//        builder.setView(view);
//
//        EditText firstEt = view.findViewById(R.id.firstEt);
//        EditText secondEt = view.findViewById(R.id.secondEt);
//        MaterialButton calcBtn = view.findViewById(R.id.calcBtn);
//        TextView resultTv = view.findViewById(R.id.resultTv);
//
//        calcBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int first, second, result;
//                first = Integer.parseInt(firstEt.getText().toString());
//                second = Integer.parseInt(secondEt.getText().toString());
//                result = first + second;
//
//                resultTv.setText(String.valueOf(result));
//            }
//        });
//
//        AlertDialog alert = builder.create();
//        alert.show();
//    }

}