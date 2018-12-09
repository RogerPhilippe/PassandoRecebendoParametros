package br.com.philippesis.passandorecebendoparametros;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    private Long number1, number2, result;
    private Button btnResultado, btnRetorno;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        number1 = getIntent().getExtras().getLong("num1");
        number2 = getIntent().getExtras().getLong("num2");

        btnResultado = (Button) findViewById(R.id.idBtnResultado);
        btnRetorno = (Button) findViewById(R.id.idBtnRetorno);
        textResultado = (TextView) findViewById(R.id.idTextResultado2);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textResultado.setText("Resultado soma: "+(number1+number2));

            }
        });

    }
}
