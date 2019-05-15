package br.com.digitalhouse.androida3e2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextPrice;
    EditText editTextPercent;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextName = findViewById(R.id.editTextName);
        editTextPrice = findViewById(R.id.editTextPrice);
        editTextPercent = findViewById(R.id.editTextPercent);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                Double price = Double.parseDouble(editTextPrice.getText().toString());
                Double percent = Double.parseDouble(editTextPercent.getText().toString());
                Double total = 0.00;

                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha o campo nome", Toast.LENGTH_SHORT).show();
                } else if (price == 0) {
                    Toast.makeText(MainActivity.this, "Preencha o campo preço", Toast.LENGTH_SHORT).show();
                } else if (percent == 0) {
                    Toast.makeText(MainActivity.this, "Preencha o campo percentual", Toast.LENGTH_SHORT).show();
                } else {
                    total = price - ((price * percent) / 100);
                    Toast.makeText(MainActivity.this, "Total: "+total, Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
