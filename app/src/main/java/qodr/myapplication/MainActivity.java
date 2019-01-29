package qodr.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnMove;
    //variable kosong

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMove = findViewById(R.id.btnPindah);

        btnMove.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.btnPindah) {

            Intent i = new Intent(this, Main2Activity.class);
            startActivity(i);
        }
    }
}
