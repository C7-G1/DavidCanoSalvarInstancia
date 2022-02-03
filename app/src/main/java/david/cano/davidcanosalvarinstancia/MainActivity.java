package david.cano.davidcanosalvarinstancia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int valor = 0;
    TextView texto;
    private final static String VALOR_GUARDADO = "valor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.tvNum);

        if (savedInstanceState != null) {
            valor = savedInstanceState.getInt(VALOR_GUARDADO);
            texto.setText(String.valueOf(valor));

        } else {
            texto.setText(R.string.mostrado);
        }

    }
    @Override
    public void onSaveInstanceState (Bundle estado){
        super.onSaveInstanceState(estado);
        estado.putInt(VALOR_GUARDADO, valor);
    }
    public void suma(View v){
        valor++;
        texto.setText(String.valueOf(valor));
    }

    public void resta (View v){
        valor--;
        texto.setText(String.valueOf(valor));
    }

}