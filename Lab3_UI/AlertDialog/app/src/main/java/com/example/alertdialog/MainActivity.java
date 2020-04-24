package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.app.AlertDialog;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = findViewById(R.id.show);
    }
    public void customView(View source)
    {
        LinearLayout login = (LinearLayout) getLayoutInflater().inflate(R.layout.login, null);
        new AlertDialog.Builder(this)
                .setView(login)
                .setPositiveButton("Sign in", (dialog, which) -> {show.setText("单击了【登入】按钮！");
                })
                .setNegativeButton("Cancel", (dialog, which) -> {show.setText("单击了【取消】按钮！");
                })
                .create().show();
    }
}
