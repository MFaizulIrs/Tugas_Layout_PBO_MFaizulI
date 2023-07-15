package com.example.relativeactivityapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.relativeactivityapp.databinding.ActivityLinearBinding;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LinearLayout extends AppCompatActivity {
    EditText nama, alamat;
    Button tampilkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        tampilkan = (Button) findViewById(R.id.btntampilkan);
        nama = (EditText) findViewById(R.id.edtnama);
        alamat = (EditText) findViewById(R.id.edtalamat);
        hasil = (TextView) findViewById(R.id.txthasil);

        tampilkan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                hasil.setText("Halo Nama Saya " + nama.getText().toString()
                        + " dan saya tinggal di " + alamat.getText().toString());
            }
        });
    }
}