package com.example.hci_kidzzatm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KidzzLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kidzz_login);
    }

    public void onNext(View view){
        Intent i = new Intent(this,KidzzDashboard2.class);
        startActivity(i);
    }
}
