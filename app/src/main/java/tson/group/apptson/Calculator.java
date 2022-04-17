package tson.group.apptson;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import org.mozilla.javascript.Context;

@SuppressLint("SetTextI18n")
public class Calculator extends AppCompatActivity {
    TextView SuperInput;
    TextView SuperOutput;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnBackSpace;
    Button btnBracket;
    Button btnClear;
    Button btnDivision;
    Button btnEqual;
    Button btnFloat;
    Button btnMinus;
    Button btnMultiplication;
    Button btnPercent;
    Button btnPlus;
    Boolean checkBracket = false;
    String process;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        this.btn0 = (Button) findViewById(R.id.ButtonZero);
        this.btn1 = (Button) findViewById(R.id.ButtonOne);
        this.btn2 = (Button) findViewById(R.id.ButtonTwo);
        this.btn3 = (Button) findViewById(R.id.ButtonThree);
        this.btn4 = (Button) findViewById(R.id.ButtonFour);
        this.btn5 = (Button) findViewById(R.id.ButtonFive);
        this.btn6 = (Button) findViewById(R.id.ButtonSix);
        this.btn7 = (Button) findViewById(R.id.ButtonSeven);
        this.btn8 = (Button) findViewById(R.id.ButtonEight);
        this.btn9 = (Button) findViewById(R.id.ButtonNine);
        this.btnPlus = (Button) findViewById(R.id.ButtonPlus);
        this.btnMinus = (Button) findViewById(R.id.ButtonMinus);
        this.btnMultiplication = (Button) findViewById(R.id.ButtonMultiplication);
        this.btnDivision = (Button) findViewById(R.id.ButtonDivision);
        this.btnClear = (Button) findViewById(R.id.ButtonClear);
        this.btnBackSpace = (Button) findViewById(R.id.ButtonBackSpace);
        this.btnBracket = (Button) findViewById(R.id.ButtonBracket);
        this.btnFloat = (Button) findViewById(R.id.ButtonFloat);
        this.btnPercent = (Button) findViewById(R.id.ButtonPercent);
        this.btnEqual = (Button) findViewById(R.id.ButtonExactly);
        this.SuperOutput = (TextView) findViewById(R.id.Main_input);
        this.SuperInput = (TextView) findViewById(R.id.Mini_input);
        this.btnClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator.this.SuperOutput.setText((CharSequence) null);
                Calculator.this.SuperInput.setText((CharSequence) null);
                Calculator.this.checkBracket = false;
            }
        });
        this.btn0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "0");
            }
        });
        this.btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "1");
            }
        });
        this.btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "2");
            }
        });
        this.btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "3");
            }
        });
        this.btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "4");
            }
        });
        this.btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "5");
            }
        });
        this.btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "6");
            }
        });
        this.btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "7");
            }
        });
        this.btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "8");
            }
        });
        this.btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "9");
            }
        });
        this.btnPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "+");
            }
        });
        this.btnMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "-");
            }
        });
        this.btnMultiplication.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "×");
            }
        });
        this.btnDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "÷");
            }
        });
        this.btnFloat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + ".");
            }
        });
        this.btnPercent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                TextView textView = Calculator.this.SuperInput;
                textView.setText(Calculator.this.process + "%");
            }
        });
        this.btnBracket.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (Calculator.this.checkBracket.booleanValue()) {
                    Calculator calculator = Calculator.this;
                    calculator.process = calculator.SuperInput.getText().toString();
                    TextView textView = Calculator.this.SuperInput;
                    textView.setText(Calculator.this.process + ")");
                    Calculator.this.checkBracket = false;
                    return;
                }
                Calculator calculator2 = Calculator.this;
                calculator2.process = calculator2.SuperInput.getText().toString();
                TextView textView2 = Calculator.this.SuperInput;
                textView2.setText(Calculator.this.process + "(");
                Calculator.this.checkBracket = true;
            }
        });
        this.btnEqual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String finalResult;
                Calculator calculator = Calculator.this;
                calculator.process = calculator.SuperInput.getText().toString();
                Calculator calculator2 = Calculator.this;
                calculator2.process = calculator2.process.replaceAll("×", "*");
                Calculator calculator3 = Calculator.this;
                calculator3.process = calculator3.process.replaceAll("%", "/100");
                Calculator calculator4 = Calculator.this;
                calculator4.process = calculator4.process.replaceAll("÷", "/");
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                try {
                    finalResult = rhino.evaluateString(rhino.initStandardObjects(), Calculator.this.process, "javascript", 1, (Object) null).toString();
                } catch (Exception e) {
                    finalResult = Calculator.this.getString(R.string.Incorrect);
                }
                Calculator.this.SuperOutput.setText(finalResult);
            }
        });
    }

    public void Back(View view) {
        onBackPressed();
    }

    public void Menu(View view) {
        startActivity(new Intent(this, Menu.class));
    }
}
