package movilappproyecto.kevinintriago.facci.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView_registar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_registar = findViewById(R.id.tv_registrar);
        textView_registar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRegistrar = new Intent(MainActivity.this, Registro.class);
                MainActivity.this.startActivity(intentRegistrar);
            }
        });
    }
}
