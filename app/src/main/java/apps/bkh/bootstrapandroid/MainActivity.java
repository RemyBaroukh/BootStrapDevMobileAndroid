package apps.bkh.bootstrapandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btBootStrap;
    TextView tvBootStrap;
    Button btBootStrapKO;
    EditText etBoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btBootStrap = (Button) findViewById(R.id.btBootStrapOK);
        btBootStrapKO = (Button) findViewById(R.id.btBootStrapKO);
        tvBootStrap = (TextView) findViewById(R.id.tvBootStrap);
        etBoot = (EditText) findViewById(R.id.etPlain);

        tvBootStrap.setText(R.string.app_name);

        btBootStrap.setOnClickListener(this);
        btBootStrapKO.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (view == btBootStrap)
            tvBootStrap.setText("HelloOK");
        else
        {
            startActivity(new Intent(this, TodoActivity.class));
        }
    }
}
