package fr.moi.app;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class inscription extends  AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscription);

        final EditText PSEUDO = findViewById(R.id.PSEUDO);
        final EditText Mail = findViewById(R.id.editTextTextEmailAddress2);
        final EditText MdP = findViewById(R.id.editTextTextPassword2);
        final EditText RMdp = findViewById(R.id.editTextTextPassword3);

        final Button Register = findViewById(R.id.INSCRIRE);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }}