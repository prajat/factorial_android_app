package com.example.rajat.recursive_factorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class result extends AppCompatActivity {

    //StringBuilder sb=new StringBuilder();

    int t=0;

   double fact(long a) {




        if (a == 0) {
            return 1;

        } else {
            /*t++;
            if(t==1) sb.append(a);
            else sb.append("*"+a);*/

            return a * fact(a - 1);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        TextView t = findViewById(R.id.textView);
        t.setMovementMethod(new ScrollingMovementMethod());
        String str = getIntent().getStringExtra("number");
        long num = Long.parseLong(str);
        String s2 = Double.toString(fact(num));

        //sb.append("="+"\n"+s2);
        //t.setText(sb.toString());
        t.setText(s2);




    }
}
