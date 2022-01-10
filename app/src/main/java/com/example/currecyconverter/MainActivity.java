package com.example.currecyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView tvView;
    EditText edtMessage;
    Spinner spinTo,spinFrom;
    Button btnConvert;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvView=findViewById(R.id.tvView);
        edtMessage=findViewById(R.id.edtMessage);
        btnConvert=findViewById(R.id.btnConvert);
        spinTo=findViewById(R.id.spinTo);
        spinFrom=findViewById(R.id.spinFrom);

        String[] to={"USD"};
        ArrayAdapter ad=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,to);
        spinTo.setAdapter(ad);

        String[] from={"Indian Rupes","American Rupes"};
        ArrayAdapter ad1=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,from);
        spinFrom.setAdapter(ad1);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double total;
                Double amount= Double.valueOf(edtMessage.getText().toString());

                if(spinTo.getSelectedItem().toString() == "USD" && spinFrom.getSelectedItem().toString() == "Indian Rupes"){

                    total=amount * 70.00;
                    tvView.setText(total.toString());

                }
                if(spinTo.getSelectedItem().toString() == "USD" && spinFrom.getSelectedItem().toString() == "American Rupes"){

                    total=amount * 180.00;
                    tvView.setText(total.toString());

                }

            }
        });


    }
}