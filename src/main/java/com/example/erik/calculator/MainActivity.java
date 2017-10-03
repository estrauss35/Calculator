package com.example.erik.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    String Operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView Entry = (TextView) findViewById(R.id.BottomBanner);

        final Button Button0 = (Button) findViewById(R.id.Zero);
        Button0.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "0";
                Entry.setText(Operation);
            }
        });

        final Button Button1 = (Button) findViewById(R.id.One);
        Button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "1";
                Entry.setText(Operation);
            }
        });

        final Button Button2 = (Button) findViewById(R.id.Two);
        Button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "2";
                Entry.setText(Operation);
            }
        });

        final Button Button3 = (Button) findViewById(R.id.Three);
        Button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "3";
                Entry.setText(Operation);
            }
        });

        final Button Button4 = (Button) findViewById(R.id.Four);
        Button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "4";
                Entry.setText(Operation);
            }
        });

        final Button Button5 = (Button) findViewById(R.id.Five);
        Button5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "5";
                Entry.setText(Operation);
            }
        });

        final Button Button6 = (Button) findViewById(R.id.Six);
        Button6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "6";
                Entry.setText(Operation);
            }
        });

        final Button Button7 = (Button) findViewById(R.id.Seven);
        Button7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "7";
                Entry.setText(Operation);
            }
        });

        final Button Button8 = (Button) findViewById(R.id.Eight);
        Button8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "8";
                Entry.setText(Operation);
            }
        });

        final Button Button9 = (Button) findViewById(R.id.Nine);
        Button9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + "9";
                Entry.setText(Operation);
            }
        });

        final Button ButtonClr = (Button) findViewById(R.id.Clear);
        ButtonClr.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = "";
                Entry.setText(Operation);
            }
        });

        final Button ButtonAdd = (Button) findViewById(R.id.Add);
        ButtonAdd.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + " + ";
                Entry.setText(Operation);
            }
        });

        final Button ButtonMinus = (Button) findViewById(R.id.Subtract);
        ButtonMinus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + " - ";
                Entry.setText(Operation);
            }
        });

        final Button ButtonMultiply = (Button) findViewById(R.id.Multiply);
        ButtonMultiply.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + " x ";
                Entry.setText(Operation);
            }
        });

        final Button ButtonDivide = (Button) findViewById(R.id.Divide);
        ButtonDivide.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + " / ";
                Entry.setText(Operation);
            }
        });

        final Button ButtonDec = (Button) findViewById(R.id.Decimal);
        ButtonDec.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = Operation + ".";
                Entry.setText(Operation);
            }
        });

    }


}
