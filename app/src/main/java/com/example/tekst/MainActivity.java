package com.example.tekst;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText email;
    private EditText password;
    private EditText passwordAgain;
    private Button buton;
    private TextView komunikat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        komunikat = findViewById(R.id.text);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        passwordAgain = findViewById(R.id.passwordAgain);
        buton = findViewById(R.id.buton);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mail = email.getText().toString().trim();
                String haslo = password.getText().toString().trim();
                String hasloAgain = passwordAgain.getText().toString().trim();

                if (!mail.contains("@")) {
                    komunikat.setText("zły adres email");
                } else if (!haslo.equals(hasloAgain)) {
                    komunikat.setText("hasła nie są takie same");
                }
                else {
                    komunikat.setText("poprawnie wysłano");
                }

            }
        });
    }
}