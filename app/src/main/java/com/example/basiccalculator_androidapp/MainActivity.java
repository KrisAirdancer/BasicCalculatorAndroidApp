package com.example.basiccalculator_androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText calculation, result;
    private String curr, res; // calculation gets set equal to curr and result gets set equal to res during calculation operations
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDel, btnAC, btnDivision, btnMultiply, btnSubtract, btnAdd, btnDecimal, btnEquals;
    private boolean dot_inserted, operator_inserted;


    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculation = findViewById(R.id.calculation);
        result = (EditText) findViewById(R.id.result);

        curr = "";
        res = "";

        dot_inserted = false;
        operator_inserted = false;

        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnEquals = (Button) findViewById(R.id.btnEquals);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "0";
                displayOne();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "1";
                displayOne();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "2";
                displayOne();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "3";
                displayOne();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "4";
                displayOne();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "5";
                displayOne();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "6";
                displayOne();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "7";
                displayOne();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "8";
                displayOne();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curr = curr + "9";
                displayOne();
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspace();
                displayOne();
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set dot_inserted = false
                dot_inserted = false;

                // Check if curr is not empty
                if (!curr.isEmpty()) {
                    // Check if last digit is a dot. If so, remove it.
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        backspace();
                    }
                    // Check if operator_inserted is false. If so, append opeartor to current string
                    if (operator_inserted == false) {
                        curr = curr + " ÷ ";
                        operator_inserted = true;
                    }
                }
                // Call displayOne
                displayOne();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set dot_inserted = false
                dot_inserted = false;

                // Check if curr is not empty
                if (!curr.isEmpty()) {
                    // Check if last digit is a dot. If so, remove it.
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        backspace();
                    }
                    // Check if operator_inserted is false. If so, append opeartor to current string
                    if (operator_inserted == false) {
                        curr = curr + " x ";
                        operator_inserted = true;
                    }
                }
                // Call displayOne
                displayOne();
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set dot_inserted = false
                dot_inserted = false;

                // Check if curr is not empty
                if (!curr.isEmpty()) {
                    // Check if last digit is a dot. If so, remove it.
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        backspace();
                    }
                    // Check if operator_inserted is false. If so, append opeartor to current string
                    if (operator_inserted == false) {
                        curr = curr + " - ";
                        operator_inserted = true;
                    }
                }
                // Call displayOne
                displayOne();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Set dot_inserted = false
                dot_inserted = false;

                // Check if curr is not empty
                if (!curr.isEmpty()) {
                    // Check if last digit is a dot. If so, remove it.
                    if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                        backspace();
                    }
                    // Check if operator_inserted is false. If so, append opeartor to current string
                    if (operator_inserted == false) {
                        curr = curr + " + ";
                        operator_inserted = true;
                    }
                }
                // Call displayOne
                displayOne();
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if empty. If yes, append "0" and set dot_inserted variable to true
                if (curr.isEmpty()) {
                    curr = "0.";
                    dot_inserted = true;
                }

                // Check if dot_inserted is false. If yes, append "."
                if (dot_inserted == false) {
                    curr = curr + ".";
                    dot_inserted = true;
                }
                // Update display
                displayOne();
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Check that last digit is not an operator
                if (operator_inserted == true && !curr.substring(curr.length() - 1, curr.length()).equals(" ")) {
                    // Create a string array
                    String[] tokens = curr.split(" ");

                    switch (tokens[1].charAt(0)) {
                        case '+':
                            res = Double.toString(Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            res = Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case 'x':
                            res = Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '÷':
                            res = Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });
    }


    public void displayOne() {
        calculation.setText(curr);
    }

    public void displayTwo() {
        result.setText(res);
    }

    public void clear() {
        curr = "";
        res = "";
        dot_inserted = false;
        operator_inserted = false;
    }

    public void backspace() {

        // If curr is not empty, remove last char
        if (!curr.isEmpty()) {

            // Check if the dot is the last char in curr. If yes, set dot_inserted = false
            if (curr.substring(curr.length() - 1, curr.length()).equals(".")) {
                dot_inserted = false;
            }

            // If operator detected, delete three digits or characters from curr and set opeator inserted = false
            if (curr.substring(curr.length() - 1, curr.length()).equals(" ")) {
                curr = curr.substring(0, curr.length() - 3);
                operator_inserted = false;
            } else { // Otherwise, remove just last character
                curr = curr.substring(0, curr.length() - 1);
            }
        }
    }



}