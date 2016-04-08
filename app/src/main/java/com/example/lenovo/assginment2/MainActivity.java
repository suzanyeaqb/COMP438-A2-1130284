package com.example.lenovo.assginment2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //define all button between number 0-9
    Button zero, one, two, three, four, five, six, seven, eight, nine;
    Button equal, back;
    Button mr, nm, mc, mMinus, btnN, cBtn;
    Button add, multiply;
    TextView showNumber;//define text in screen
    double vlaueMemo;//define double number to set value in memory
    double stackingResult = 0.0;//the result after operation
    double number;//number in screen
    String lastOp = "";//the operation
    boolean multipleOps = false;//is many operation


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button) findViewById(R.id.btn6);
        seven = (Button) findViewById(R.id.btn7);
        eight = (Button) findViewById(R.id.btn8);
        nine = (Button) findViewById(R.id.btn9);
        zero = (Button) findViewById(R.id.btn0);
        equal = (Button) findViewById(R.id.btnEqual);
        back = (Button) findViewById(R.id.btnback);
        mr = (Button) findViewById(R.id.btnmr);
        mMinus = (Button) findViewById(R.id.btnMins);
        nm = (Button) findViewById(R.id.btnm);
        mc = (Button) findViewById(R.id.btnmc);
        add = (Button) findViewById(R.id.btnPlus);
        multiply = (Button) findViewById(R.id.btnx);
        cBtn = (Button) findViewById(R.id.cbtn);
        btnN = (Button) findViewById(R.id.btnn);
        showNumber = (TextView) findViewById(R.id.txtNumber);


    }

    //to append or set text in screen to 0-9 number
    public void numberZero(View view) {
        if (!showNumber.getText().equals("0")||!showNumber.getText().equals("0.0"))

            showNumber.append(0 + "");
    }

    public void numberOne(View view) {
        if (showNumber.getText().equals("0")||!showNumber.getText().equals("0.0")) {
            showNumber.setText(1 + "");

        } else {
            showNumber.append(1 + "");
        }
    }

    public void numberTwo(View view) {
        if (showNumber.getText().equals("0")||!showNumber.getText().equals("0.0")) {
            showNumber.setText(2 + "");

        } else
            showNumber.append(2 + "");
    }

    public void numberThree(View view) {
        if (showNumber.getText().equals("0")||!showNumber.getText().equals("0.0")) {
            showNumber.setText(3 + "");

        } else
            showNumber.append(3 + "");
    }

    public void numberFour(View view) {
        if (showNumber.getText().equals("0")||!showNumber.getText().equals("0.0")) {
            showNumber.setText(4 + "");

        } else
            showNumber.append(4 + "");
    }

    public void numberFive(View view) {
        if (showNumber.getText().equals("0")||!showNumber.getText().equals("0.0")) {
            showNumber.setText(5 + "");

        } else
            showNumber.append(5 + "");
    }

    public void numberSix(View view) {
        if (showNumber.getText().equals("0")||!showNumber.getText().equals("0.0")) {
            showNumber.setText(6 + "");

        } else
            showNumber.append(6 + "");
    }

    public void numberSeven(View view) {
        if (showNumber.getText().equals("0")||!showNumber.getText().equals("0.0")) {
            showNumber.setText(7 + "");

        } else
            showNumber.append(7 + "");
    }

    public void numberEight(View view) {
        if (showNumber.getText().equals("0")||!showNumber.getText().equals("0.0")) {
            showNumber.setText(8 + "");

        } else
            showNumber.append(8 + "");
    }

    public void numberNine(View view) {
        if (showNumber.getText().equals("0")||!showNumber.getText().equals("0.0")) {
            showNumber.setText(9 + "");
        } else
            showNumber.append(9 + "");
    }

    //if click sum button to summation number in text and after number and operation plus
    public void sum(View view) {
        if (!showNumber.getText().equals(null) || !showNumber.getText().equals("")) {
            number = Double.parseDouble(showNumber.getText() + "");//get number in text
            if (multipleOps)//is multi operation
                stackOperation();//call the method calculate in past operation
            else {//else  set the result in this number and set is multi operation true
                stackingResult = number;
                multipleOps = true;
            }
            lastOp = "plus";
            showNumber.setText("");
        }
    }
    //if click sub button to subtract number in text and after number and operation sub

    public void sub(View view) {
        if (!showNumber.getText().equals(null) || !showNumber.getText().equals("")) {
            number = Double.parseDouble(showNumber.getText() + "");
            if (multipleOps)//is sub operation
                stackOperation();//call the method calculate in past operation
            else {//else  set the result in this number and set is multi operation true
                stackingResult = number;
                multipleOps = true;
            }

        }

        lastOp = "sub";
        showNumber.setText("");
    }

    //if click div button to division number in text and after number and operation div

    public void div(View view) {
        if (!showNumber.getText().equals(null) || !showNumber.getText().equals("")) {
            number = Double.parseDouble(showNumber.getText() + "");
            if (multipleOps)//is div operation
                stackOperation();//call the method calculate in past operation
            else {//else  set the result in this number and set is multi operation true
                stackingResult = number;
                multipleOps = true;
            }
            lastOp = "div";
            showNumber.setText("");
        }
    }
    //if click multiply button to multiplied number in text and after number and operation div

    public void multiply(View view) {
        if (!showNumber.getText().equals(null) || !showNumber.getText().equals("")) {
            number = Double.parseDouble(showNumber.getText() + "");
            if (multipleOps)
                stackOperation();
            else {
                stackingResult = number;
                multipleOps = true;
            }
            lastOp = "mult";
            showNumber.setText("");
        }
    }

    //to remove last number
    public void back(View view) {
        if (!showNumber.getText().equals(null) || !showNumber.getText().equals("")) {
            showNumber.setText(showNumber.getText().subSequence(0, showNumber.getText().length() - 1));
        }
    }

    //set negative number  is positive
    public void negative(View view) {
        showNumber.setText(Double.parseDouble(showNumber.getText()+"")*-1+ "");
    }

    //to get in screen and set in memory
    public void saveToMemo(View view) {
        if(!showNumber.getText().equals("")||showNumber.getText().equals(null))
            this.vlaueMemo = Double.parseDouble(showNumber.getText() + "");
        showNumber.setText("");
        stackingResult = 0.0;
        multipleOps = false;
        lastOp = "";
    }

    //to get in memory value and set in screen
    public void recordToMemo(View view) {
            showNumber.setText(vlaueMemo + "");

    }

    //method to clear memory
    public void clearToMemo(View view) {
        this.vlaueMemo = 0;
    }

    //method to clear screen and memory
    public void clear(View view) {
        showNumber.setText("");
        stackingResult = 0.0;
        multipleOps = false;
        lastOp = "";

    }

    //method to calculate  number depend on operation
    private void stackOperation() {
        if (lastOp.equals("plus")) {
            stackingResult += number;
            showNumber.setText(stackingResult + "");
        } else if (lastOp.equals("mult")) {
            stackingResult *= number;
            showNumber.setText(stackingResult + "");

        } else if (lastOp.equals("sub")) {
            stackingResult -= number;
            showNumber.setText(stackingResult + "");


        } else if (lastOp.equals("div")) {
            stackingResult /= number;
            showNumber.setText(stackingResult + "");

        } else {
            stackingResult = stackingResult;
            showNumber.setText(stackingResult + "");

        }
    }

    //if click equal set he final result
    public void result(View view) {
        number = Double.parseDouble(showNumber.getText() + "");
        stackOperation();
        showNumber.setText(stackingResult + "");
        lastOp = "";
    }
}
