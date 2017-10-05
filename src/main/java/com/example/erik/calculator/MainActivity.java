package com.example.erik.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    String Operation = "";      // String that is displayed to the entry field
    float Number1, Number2 = 0; // Variables that hold the numbers being calculated with
    float Result = 0;           // Float to hold the result of the calculation
    String secondNumber = "";   // String to hold the number for the second user entry
    String Operator = "";       // String to hold the desired operator
    boolean operatorIn = false; // Boolean for if there is already an operator put in by the user
    boolean secondEntry = false;// Boolean to check if the user started entering a second entry

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
                if(!operatorIn)
                {
                    Operation = Operation + "0";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "0";
                    Operation = Operation + "0";
                    Entry.setText(Operation);
                }
            }
        });

        final Button Button1 = (Button) findViewById(R.id.One);
        Button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(!operatorIn)
                {
                    Operation = Operation + "1";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "1";
                    Operation = Operation + "1";
                    Entry.setText(Operation);
                }

            }
        });

        final Button Button2 = (Button) findViewById(R.id.Two);
        Button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(!operatorIn)
                {
                    Operation = Operation + "2";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "2";
                    Operation = Operation + "2";
                    Entry.setText(Operation);
                }
            }
        });

        final Button Button3 = (Button) findViewById(R.id.Three);
        Button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(!operatorIn)
                {
                    Operation = Operation + "3";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "3";
                    Operation = Operation + "3";
                    Entry.setText(Operation);
                }
            }
        });

        final Button Button4 = (Button) findViewById(R.id.Four);
        Button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(!operatorIn)
                {
                    Operation = Operation + "4";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "4";
                    Operation = Operation + "4";
                    Entry.setText(Operation);
                }
            }
        });

        final Button Button5 = (Button) findViewById(R.id.Five);
        Button5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(!operatorIn)
                {
                    Operation = Operation + "5";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "5";
                    Operation = Operation + "5";
                    Entry.setText(Operation);
                }
            }
        });

        final Button Button6 = (Button) findViewById(R.id.Six);
        Button6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(!operatorIn)
                {
                    Operation = Operation + "6";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "6";
                    Operation = Operation + "6";
                    Entry.setText(Operation);
                }
            }
        });

        final Button Button7 = (Button) findViewById(R.id.Seven);
        Button7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(!operatorIn)
                {
                    Operation = Operation + "7";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "7";
                    Operation = Operation + "7";
                    Entry.setText(Operation);
                }
            }
        });

        final Button Button8 = (Button) findViewById(R.id.Eight);
        Button8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(!operatorIn)
                {
                    Operation = Operation + "8";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "8";
                    Operation = Operation + "8";
                    Entry.setText(Operation);
                }
            }
        });

        final Button Button9 = (Button) findViewById(R.id.Nine);
        Button9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(!operatorIn)
                {
                    Operation = Operation + "9";
                    Entry.setText(Operation);
                }
                else if(operatorIn)
                {
                    secondEntry = true;
                    secondNumber = secondNumber + "9";
                    Operation = Operation + "9";
                    Entry.setText(Operation);
                }
            }
        });

        final Button ButtonClr = (Button) findViewById(R.id.Clear);
        ButtonClr.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Operation = "";
                Number1 = 0;
                Number2 = 0;
                secondEntry = false;
                secondNumber = "";
                operatorIn = false;
                Operator = "";
                Entry.setText(Operation);
            }
        });

        final Button ButtonAdd = (Button) findViewById(R.id.Add);
        ButtonAdd.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(Operation == "")
                {
                    Operation = "ERROR";
                    operatorIn = false;
                    Number1 = 0;
                    Number2 = 0;
                    secondEntry = false;
                    Entry.setText(Operation);
                    Operation = "";
                }
                else if(operatorIn && !secondEntry)
                {
                    Operation = "ERROR";
                    operatorIn = false;
                    Number1 = 0;
                    Number2 = 0;
                    secondEntry = false;
                    secondNumber = "";
                    Entry.setText(Operation);
                    Operation = "";
                }
                if(operatorIn && secondEntry)
                {
                    if(operatorIn && secondEntry)
                    {
                        Number2 = Float.parseFloat(secondNumber);
                        if(Operator == "+")
                        {
                            Result = Number1 + Number2;
                        }
                        else if(Operator == "-")
                        {
                            Result = Number1 - Number2;
                        }
                        else if(Operator == "*")
                        {
                            Result = Number1 * Number2;
                        }
                        else if(Operator == "/")
                        {
                            if(Number2 == 0)
                            {
                                Entry.setText("ERROR");
                                return;
                            }
                            else
                            {
                                Result = Number1 / Number2;
                                Operation = "" + Result;
                                Entry.setText(Operation);
                            }
                        }
                        Number1 = Result;
                        Number2 = 0;
                        secondEntry = false;
                        Operation = Number1 + " + ";
                        operatorIn = true;
                        secondNumber = "";
                        Operator = "+";
                        Entry.setText(Operation);
                    }
                }
                else if(!operatorIn)
                {
                    Number1 = Float.parseFloat(Operation);
                    Operator = "+";
                    operatorIn = true;
                    Operation = Operation + " + ";
                    Entry.setText(Operation);
                }

            }
        });

        final Button ButtonMinus = (Button) findViewById(R.id.Subtract);
        ButtonMinus.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(Operation == "")
                {
                    Operation = "ERROR";
                    operatorIn = false;
                    Number1 = 0;
                    Number2 = 0;
                    secondEntry = false;
                    Entry.setText(Operation);
                    Operation = "";
                }
                if(operatorIn && !secondEntry)
                {
                    Operation = "ERROR";
                    operatorIn = false;
                    Number1 = 0;
                    Number2 = 0;
                    secondEntry = false;
                    secondNumber = "";
                    Entry.setText(Operation);
                    Operation = "";
                }
                if(operatorIn && secondEntry)
                {
                    if(operatorIn && secondEntry)
                    {
                        Number2 = Float.parseFloat(secondNumber);
                        if(Operator == "+")
                        {
                            Result = Number1 + Number2;
                        }
                        else if(Operator == "-")
                        {
                            Result = Number1 - Number2;
                        }
                        else if(Operator == "*")
                        {
                            Result = Number1 * Number2;
                        }
                        else if(Operator == "/")
                        {
                            if(Number2 == 0)
                            {
                                Entry.setText("ERROR");
                                return;
                            }
                            else
                            {
                                Result = Number1 / Number2;
                                Operation = "" + Result;
                                Entry.setText(Operation);
                            }
                        }
                        Number1 = Result;
                        Number2 = 0;
                        secondEntry = false;
                        Operation = Number1 + " - ";
                        operatorIn = true;
                        secondNumber = "";
                        Operator = "-";
                        Entry.setText(Operation);
                    }
                }
                else if(!operatorIn)
                {
                    Number1 = Float.parseFloat(Operation);
                    Operator = "-";
                    operatorIn = true;
                    Operation = Operation + " - ";
                    Entry.setText(Operation);
                }
            }
        });

        final Button ButtonMultiply = (Button) findViewById(R.id.Multiply);
        ButtonMultiply.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(Operation == "")
                {
                    Operation = "ERROR";
                    operatorIn = false;
                    Number1 = 0;
                    Number2 = 0;
                    secondEntry = false;
                    Entry.setText(Operation);
                    Operation = "";
                }
                if(operatorIn && !secondEntry)
                {
                    Operation = "ERROR";
                    operatorIn = false;
                    Number1 = 0;
                    Number2 = 0;
                    secondEntry = false;
                    secondNumber = "";
                    Entry.setText(Operation);
                    Operation = "";
                }
                if(operatorIn && secondEntry)
                {
                    if(operatorIn && secondEntry)
                    {
                        Number2 = Float.parseFloat(secondNumber);
                        if(Operator == "+")
                        {
                            Result = Number1 + Number2;
                        }
                        else if(Operator == "-")
                        {
                            Result = Number1 - Number2;
                        }
                        else if(Operator == "x")
                        {
                            Result = Number1 * Number2;
                        }
                        else if(Operator == "/")
                        {
                            if(Number2 == 0)
                            {
                                Entry.setText("ERROR");
                                return;
                            }
                            else
                            {
                                Result = Number1 / Number2;
                                Operation = "" + Result;
                                Entry.setText(Operation);
                            }
                        }
                        Number1 = Result;
                        Number2 = 0;
                        secondEntry = false;
                        Operation = Number1 + " x ";
                        operatorIn = true;
                        secondNumber = "";
                        Operator = "x";
                        Entry.setText(Operation);
                    }
                }
                else if(!operatorIn)
                {
                    Number1 = Float.parseFloat(Operation);
                    Operator = "x";
                    operatorIn = true;
                    Operation = Operation + " x ";
                    Entry.setText(Operation);
                }
            }
        });

        final Button ButtonDivide = (Button) findViewById(R.id.Divide);
        ButtonDivide.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(Operation == "")
                {
                    Operation = "ERROR";
                    operatorIn = false;
                    Number1 = 0;
                    Number2 = 0;
                    secondEntry = false;
                    Entry.setText(Operation);
                    Operation = "";
                }
                if(operatorIn && !secondEntry)
                {
                    Operation = "ERROR";
                    operatorIn = false;
                    Number1 = 0;
                    Number2 = 0;
                    secondEntry = false;
                    secondNumber = "";
                    Entry.setText(Operation);
                    Operation = "";
                }
                if(operatorIn && secondEntry)
                {
                    Number2 = Float.parseFloat(secondNumber);
                    if(Operator == "+")
                    {
                        Result = Number1 + Number2;
                    }
                    else if(Operator == "-")
                    {
                        Result = Number1 - Number2;
                    }
                    else if(Operator == "*")
                    {
                        Result = Number1 * Number2;
                    }
                    else if(Operator == "/")
                    {
                        if(Number2 == 0)
                        {
                            Entry.setText("ERROR");
                            return;
                        }
                        else
                        {
                            Result = Number1 / Number2;
                            Operation = "" + Result;
                            Entry.setText(Operation);
                        }
                    }
                    Number1 = Result;
                    Number2 = 0;
                    secondEntry = false;
                    Operation = Number1 + " / ";
                    operatorIn = true;
                    secondNumber = "";
                    Operator = "/";
                    Entry.setText(Operation);
                }
                else if(!operatorIn)
                {
                    Number1 = Float.parseFloat(Operation);
                    Operator = "/";
                    operatorIn = true;
                    Operation = Operation + " / ";
                    Entry.setText(Operation);
                }
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

        final Button ButtonEnter = (Button) findViewById(R.id.Enter);
        ButtonEnter.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                if(Operator == "+")
                {
                    Number2 = Float.parseFloat(secondNumber);
                    Result = Number1 + Number2;
                    Operation = "" + Result;
                    Entry.setText(Operation);
                }
                else if(Operator == "/")
                {
                    Number2 = Float.parseFloat(secondNumber);
                    if(Number2 == 0)
                    {
                        Entry.setText("ERROR");
                    }
                    else
                    {
                        Result = Number1 / Number2;
                        Operation = "" + Result;
                        Entry.setText(Operation);
                    }

                }
                else if(Operator == "x")
                {
                    Number2 = Float.parseFloat(secondNumber);
                    Result = Number1 * Number2;
                    Operation = "" + Result;
                    Entry.setText(Operation);
                }
                else if(Operator == "-")
                {
                    Number2 = Float.parseFloat(secondNumber);
                    Result = Number1 - Number2;
                    Operation = "" + Result;
                    Entry.setText(Operation);
                }
                else if(!secondEntry && operatorIn)
                {
                    Operation = "ERROR";
                    Entry.setText(Operation);

                }
                Operation = "";
                operatorIn = false;
                Number1 = 0;
                Number2 = 0;
                secondEntry = false;
                secondNumber = "";

            }
        });

        final Button ButtonSetting = (Button) findViewById(R.id.Settings);
        ButtonSetting.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this ,Settings.class));
            }
        });
    }


}
