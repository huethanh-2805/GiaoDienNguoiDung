package com.example.giaodiennguoidung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername;
    EditText txtPassword;
    EditText txtRetype;
    Button btnReset;
    RadioButton chkMale, chkFemale;
    CheckBox chkTennis, chkFootball, chkOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsername = (EditText) findViewById(R.id.txtUsername);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        txtRetype = (EditText) findViewById(R.id.txtRetype);
        chkMale = (RadioButton) findViewById(R.id.chkMale);
        chkFemale = (RadioButton) findViewById(R.id.chkFemale);
        chkTennis = (CheckBox) findViewById(R.id.chkTennis);
        chkFootball = (CheckBox) findViewById(R.id.chkFootball);
        chkOthers = (CheckBox) findViewById(R.id.chkOthers);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtUsername.setText("");
                txtPassword.setText("");
                txtRetype.setText("");
                chkMale.setChecked(false);
                chkFemale.setChecked(false);
                chkTennis.setChecked(false);
                chkFootball.setChecked(false);
                chkOthers.setChecked(false);
            }
        });
    }
}