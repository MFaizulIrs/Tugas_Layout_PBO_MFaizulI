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
import com.example.relativeactivityapp.databinding.ActivityRegisterBinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterRelative extends AppCompatActivity {
    Button masukregister, pindahkelogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        masukregister = (Button) findViewById(R.id.buttonregister);
        pindahkelogin = (Button) findViewById(R.id.buttonlogin);
        masukregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterRelative.this,
                        "Selamat Anda Sudah Berhasil Mendaftarkan akun", Toast.LENGTH_SHORT).show();
            }
        });
        pindahkelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahaja = new Intent(RegisterRelative.this, com.example.myapplication1.RelativeLayoutLogin.class);
                startActivity(pindahaja);
            }
        });
    }
}
        });
    }
}