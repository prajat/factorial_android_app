package com.example.rajat.recursive_factorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button b1= findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EditText e1=findViewById(R.id.editText3);
                String s1=e1.getText().toString();


                Intent i1= new Intent(MainActivity.this,result.class);
                i1.putExtra("number",s1);


                startActivity(i1);





            }
        });

    }
}
