package com.example.useoftogglebutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    TextView txtStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.tooglebutton);
        txtStatus = findViewById(R.id.txt_status);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.tooglebutton)
            validar();
    }

    private void validar() {
        if (toggleButton.isChecked())
            txtStatus.setText("State ON");
        else {
            txtStatus.setText("State OF");
        }
    }
}
