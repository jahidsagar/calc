package com.example.sagar.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonAdd,
            buttonMinus, buttonMul, buttonDivide, buttonEqual, buttonClear, buttonParcent, buttonDecimal;

    TextView textView1 , textView2;

    int operation = 0;
    float num1, num2, result;
    boolean dot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.txtView1);
        textView2 = findViewById(R.id.txtView2);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button0 = findViewById(R.id.btn0);
        buttonDecimal = findViewById(R.id.btnDecimal);

        buttonAdd = findViewById(R.id.btnAdd);
        buttonMinus = findViewById(R.id.btnMinus);
        buttonMul = findViewById(R.id.btnMul);
        buttonDivide = findViewById(R.id.btnDivide);
        buttonEqual = findViewById(R.id.btnEqual);

        buttonClear = findViewById(R.id.btnClear);
        buttonParcent = findViewById(R.id.btnParcent);

//        operation = 0;

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "2");
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "3");
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "4");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "5");
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "6");
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "7");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "8");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "9");
                }
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    textView1.setText(textView1.getText() + "0");
                }
            }
        });
        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.length() < 6) {
                    if (dot == false) {
                        textView1.setText(textView1.getText() + ".");
                        dot = true;
                    }
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    num1 = Float.parseFloat(textView1.getText().toString());
                    textView1.setText("");
//                    textView2.setText(""+String.valueOf(num1) + "+");
                    dot = false;
                    operation = 1;
                } else {
                    num1 = storeValue(operation);
                    result = 0;
                }

            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    num1 = Float.parseFloat(textView1.getText().toString());
                    textView1.setText("");
//                    textView2.setText(""+String.valueOf(num1) + "+");
                    dot = false;
                    operation = 2;
                }else {
                    num1 = storeValue(operation);
                    result = 0;
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    num1 = Float.parseFloat(textView1.getText().toString());
                    textView1.setText("");
//                    textView2.setText(""+String.valueOf(num1) + "+");
                    dot = false;
                    operation = 3;
                }else{
                    num1 = storeValue(operation);
                    result = 0;
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    num1 = Float.parseFloat(textView1.getText().toString());
                    textView1.setText("");
//                    textView2.setText(""+String.valueOf(num1) + "+");
                    dot = false;
                    operation = 4;
                }else {
                    num1 = storeValue(operation);
                    result = 0;
                }

            }
        });

        buttonParcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operation == 0) {
                    num1 = Float.parseFloat(textView1.getText().toString());
                    textView1.setText("");
//                    textView2.setText(""+String.valueOf(num1) + "+");
                    dot = false;
                    operation = 5;
                }else {
                    num1 = storeValue(operation);
                    result = 0;
                }
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = textView1.getText().toString();
                if (s.length() > 0) {
                    s = s.substring(0, s.length() - 1);
                    textView1.setText(s);
                }
            }
        });

        buttonClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                textView1.setText("");
                Toast toast = Toast.makeText(MainActivity.this, "value cleared", Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    num2 = Float.parseFloat(textView1.getText().toString());
                    switch (operation) {
                        case 0:
//                            Log.d("value1",String.valueOf(num1));
//                            Log.d("value2",String.valueOf(num2));
                            result = num2;
                            dot = false;
                            operation = 0;
                            break;
                        case 1:
                            result = num1 + num2;
//                            textView2.setText(""+String.valueOf(num1) + "+" + num2);
                            dot = false;
                            operation = 0;
                            break;
                        case 2:
                            result = num1 - num2;
//                            textView2.setText(""+String.valueOf(num1) + "-" + num2);
                            dot = false;
                            operation = 0;
                            break;
                        case 3:
                            result = num1 * num2;
//                            textView2.setText(""+String.valueOf(num1) + "*" + num2);
                            dot = false;
                            operation = 0;
                            break;
                        case 4:
                            result = num1 / num2;
//                            textView2.setText(""+String.valueOf(num1) + "/" + num2);
                            dot = false;
                            operation = 0;
                            break;
                        case 5:
                            result = num1 - ((num2 / 100) * num1);
//                            textView2.setText(""+String.valueOf(num1) + "%" + num2);
                            dot = false;
                            operation = 0;
                            break;
                        default:

                    }
                } catch (Exception e) {
                    dot = false;
                    operation = 0;
                    textView1.setText("");
                }
                try {
                    if (String.valueOf(result) == null) {

                    } else {
                        textView1.setText(String.valueOf(result));
                    }
                    num2 = num1 = 0;
                    dot = false;
                } catch (Exception e) {
                    dot = false;
                    operation = 0;
                    textView1.setText("");
                }


            }
        });

    }

    public float storeValue(int value) {
        switch (value) {
            case 1:
                result = num1 + Float.parseFloat(textView1.getText().toString());
//                textView2.setText(""+String.valueOf(num1) + "+" + textView1.getText().toString());
                textView1.setText("");
                dot = false;
                break;
            case 2:
                result = num1 - Float.parseFloat(textView1.getText().toString());
//                textView2.setText(""+String.valueOf(num1) + "-" + textView1.getText().toString());
                textView1.setText("");
                dot = false;
                break;
            case 3:
                result = num1 * Float.parseFloat(textView1.getText().toString());
//                textView2.setText(""+String.valueOf(num1) + "*" + textView1.getText().toString());
                textView1.setText("");
                dot = false;
                break;
            case 4:
                result = num1 / Float.parseFloat(textView1.getText().toString());
//                textView2.setText(""+String.valueOf(num1) + "/" + textView1.getText().toString());
                textView1.setText("");
                dot = false;
                break;
            case 5:
                result = num1 - ((Float.parseFloat(textView1.getText().toString()) / 100) * num1);
//                textView2.setText(""+String.valueOf(num1) + "%" + textView1.getText().toString());
                textView1.setText("");
                dot = false;
                break;
        }
        return result;
    }

    public void setTextView2(String string){
        textView2.setText(string);
    }

}
