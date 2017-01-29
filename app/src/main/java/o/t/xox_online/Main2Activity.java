package o.t.xox_online;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import o.t.xox_online.check;


import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        click_X();
        X_or_O();



    }
    void click_X(){
        final Button b1 = (Button) findViewById(R.id.button6);
        final Button b2 = (Button) findViewById(R.id.button7);
        final Button b3 = (Button) findViewById(R.id.button8);
        final Button b4 = (Button) findViewById(R.id.button9);
        final Button b5 = (Button) findViewById(R.id.button10);
        final Button b6 = (Button) findViewById(R.id.button11);
        final Button b7 = (Button) findViewById(R.id.button12);
        final Button b8 = (Button) findViewById(R.id.button13);
        final Button b9 = (Button) findViewById(R.id.button14);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("X");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setText("X");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText("X");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setText("X");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setText("X");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setText("X");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setText("X");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setText("X");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setText("X");
            }
        });
    }
    void click_O(){
        final Button b1 = (Button) findViewById(R.id.button6);
        final Button b2 = (Button) findViewById(R.id.button7);
        final Button b3 = (Button) findViewById(R.id.button8);
        final Button b4 = (Button) findViewById(R.id.button9);
        final Button b5 = (Button) findViewById(R.id.button10);
        final Button b6 = (Button) findViewById(R.id.button11);
        final Button b7 = (Button) findViewById(R.id.button12);
        final Button b8 = (Button) findViewById(R.id.button13);
        final Button b9 = (Button) findViewById(R.id.button14);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            b1.setText("O");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setText("O");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText("O");

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setText("O");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setText("O");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setText("O");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setText("O");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setText("O");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setText("O");

            }
        });
    }
    void AI_win_prediction(){
        Button b1= (Button) findViewById(R.id.button);
        Button b2= (Button) findViewById(R.id.button2);
        Button b3= (Button) findViewById(R.id.button3);
        Button b4= (Button) findViewById(R.id.button4);
        Button b5= (Button) findViewById(R.id.button5);
        Button b6= (Button) findViewById(R.id.button6);
        Button b7= (Button) findViewById(R.id.button7);
        Button b8= (Button) findViewById(R.id.button8);
        Button b9= (Button) findViewById(R.id.button9);
        String tab[] = {"","","","","","","","",""};
        tab[0]=b1.getText().toString();
        tab[1]=b2.getText().toString();
        tab[2]=b3.getText().toString();
        tab[3]=b4.getText().toString();
        tab[4]=b5.getText().toString();
        tab[5]=b6.getText().toString();
        tab[6]=b7.getText().toString();
        tab[7]=b8.getText().toString();
        tab[8]=b9.getText().toString();
        Switch switch1=(Switch) findViewById(R.id.switch1);
        if(switch1.isChecked()){
        if (tab[0]=="X"&&tab[1]=="X"&&tab[2]==""){

        }else if (tab[2]=="X"&&tab[1]=="X"&&tab[0]==""){

        }
        else if (tab[2]=="X"&&tab[0]=="X"&&tab[1]==""){

        }
        else if (tab[3]=="X"&&tab[4]=="X"&&tab[5]==""){

        }else if (tab[4]=="X"&&tab[5]=="X"&&tab[3]==""){

        }
        else if (tab[3]=="X"&&tab[5]=="X"&&tab[4]==""){

        }
           else if (tab[6]=="X"&&tab[7]=="X"&&tab[8]==""){

            }else if (tab[7]=="X"&&tab[8]=="X"&&tab[6]==""){

            }
            else if (tab[6]=="X"&&tab[8]=="X"&&tab[7]==""){

            }
            else if (tab[0]=="X"&&tab[3]=="X"&&tab[6]==""){

            }else if (tab[0]=="X"&&tab[6]=="X"&&tab[3]==""){

            }
            else if (tab[3]=="X"&&tab[6]=="X"&&tab[0]==""){

            }

        else if (tab[1]=="X"&&tab[4]=="X"&&tab[7]==""){

        }else if (tab[4]=="X"&&tab[7]=="X"&&tab[1]==""){

        }
        else if (tab[1]=="X"&&tab[7]=="X"&&tab[4]==""){

        }
        else if (tab[2]=="X"&&tab[5]=="X"&&tab[8]==""){

        }else if (tab[2]=="X"&&tab[8]=="X"&&tab[5]==""){

        }
        else if (tab[5]=="X"&&tab[8]=="X"&&tab[2]==""){

        }
        else if (tab[0]=="X"&&tab[4]=="X"&&tab[8]==""){

        }else if (tab[0]=="X"&&tab[8]=="X"&&tab[4]==""){

        }
        else if (tab[4]=="X"&&tab[8]=="X"&&tab[0]==""){

        }
        else if (tab[2]=="X"&&tab[4]=="X"&&tab[6]==""){

        }else if (tab[2]=="X"&&tab[6]=="X"&&tab[4]==""){

        }
        else if (tab[4]=="X"&&tab[6]=="X"&&tab[2]==""){

        }
    }
    }
    void X_or_O(){
        final Switch switch1=  (Switch) findViewById(R.id.switch1);
        switch1.setChecked(true);
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch1.isChecked()){
                click_X();
                }else {
                    click_O();
                }
            }
        });

    }

}