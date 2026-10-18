package com.example.helloconstraint;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toast = findViewById(R.id.button_toast);
        Button count = findViewById(R.id.button_count);
        Button zero = findViewById(R.id.button_zero);
        TextView st = findViewById(R.id.show_count);

        st.setText("0");
        zero.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show();
            }
        });

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int stevilo = Integer.parseInt(st.getText().toString());
                stevilo++;

                st.setText(String.valueOf(stevilo));

                if (stevilo % 2 == 0) {
                    v.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                } else {
                    v.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                }

                zero.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                st.setText("0");

                v.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                count.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
            }
        });
    }
}