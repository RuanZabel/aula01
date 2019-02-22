package br.edu.ifsc.numerosaleatorios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void alteraTexto(View view) {

        Button b = (Button)view;
        TextView text=(TextView) findViewById(R.id.textView);
        EditText edit =(EditText)findViewById(R.id.editText);
        EditText edit2 =(EditText)findViewById(R.id.editText2);

        double n= Math.floor(Math.random() * (Integer.parseInt(edit2.getText().toString()) - Integer.parseInt(edit.getText().toString()))) + Integer.parseInt(edit.getText().toString());

            text.setText(String.valueOf((int)n));
    }
}
