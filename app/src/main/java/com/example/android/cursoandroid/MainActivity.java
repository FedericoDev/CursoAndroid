package com.example.android.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.name);
        TextView textView1 = findViewById(R.id.univ);
        TextView textView2 = findViewById(R.id.quote);

        textView.setText("Federico Rafael David Matos Hernández.");
        textView1.setText("Universidad Católica Tecnológica de Barahona (UCATEBA).");
        textView2.setText("'God's love never ends.'");
    }

    public void clickText1(View v){
        Toast.makeText(this, "Este es tu nombre!", Toast.LENGTH_SHORT).show();
    }

    public void clickText2(View v){
        Toast.makeText(this, "Este es tu lugar de trabajo!", Toast.LENGTH_SHORT).show();
    }

    public void clickText3(View v){
        Toast.makeText(this, "Este es tu frase!", Toast.LENGTH_SHORT).show();
    }
}
