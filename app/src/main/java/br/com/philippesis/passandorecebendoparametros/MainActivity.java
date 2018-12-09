package br.com.philippesis.passandorecebendoparametros;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText txtNumber1, txtNumber2;
    private Button btnEnviar, btnEnviarReceber, btnEnviarObjeto;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumber1 = (EditText) findViewById(R.id.idEditNumber1);
        txtNumber2 = (EditText) findViewById(R.id.idEditNumber2);

        btnEnviar = (Button) findViewById(R.id.idBtnEnviar);
        btnEnviarReceber = (Button) findViewById(R.id.idBtnEnviarReceber);
        btnEnviarObjeto = (Button) findViewById(R.id.idBtnEnviarObjeto);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Long number1 = Long.parseLong(txtNumber1.getText().toString());
                Long number2 = Long.parseLong(txtNumber2.getText().toString());

                if ( number1 != null || number2 != null ) {

                    Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                    intent.putExtra("num1", number1);
                    intent.putExtra("num2", number2);
                    startActivity(intent);

                } else Toast.makeText(getApplicationContext(), "Você deve preencher ambos valres.", Toast.LENGTH_SHORT);

            }
        });

    }
}
