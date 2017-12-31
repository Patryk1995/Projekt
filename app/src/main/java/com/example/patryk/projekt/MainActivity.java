package com.example.patryk.projekt;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText imie, wiek, waga, wzrost, grupa_krwi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imie = (EditText)findViewById(R.id.etImie);
        wiek = (EditText)findViewById(R.id.etWiek);
        waga = (EditText)findViewById(R.id.etWaga);
        wzrost = (EditText)findViewById(R.id.etWzrost);
        grupa_krwi = (EditText)findViewById(R.id.etKrew);
    }

    public void OnLogin(View view) {

        String str_imie = imie.getText().toString();
        String str_wiek = wiek.getText().toString();
        String str_waga = waga.getText().toString();
        String str_wzrost = wzrost.getText().toString();
        String str_grupa_krwi = grupa_krwi.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, str_imie, str_wiek, str_waga, str_wzrost, str_grupa_krwi);

    }

}
