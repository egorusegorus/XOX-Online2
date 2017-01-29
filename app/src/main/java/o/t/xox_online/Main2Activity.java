package o.t.xox_online;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;



import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        click_X();
        X_or_O();
        AI_win_prediction();





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
                b1.setEnabled(false);
                AI_win_prediction();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setText("X");
                b2.setEnabled(false);
                AI_win_prediction();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText("X");
                b3.setEnabled(false);
                AI_win_prediction();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setText("X");
                b4.setEnabled(false);
                AI_win_prediction();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setText("X");
                b5.setEnabled(false);
                AI_win_prediction();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setText("X");
                b6.setEnabled(false);
                AI_win_prediction();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setText("X");
                b7.setEnabled(false);
                AI_win_prediction();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setText("X");
                b8.setEnabled(false);
                AI_win_prediction();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setText("X");
                b9.setEnabled(false);
                AI_win_prediction();
            }
        });
    }
    void first_move_AI(){
        Button b0 =(Button)findViewById(R.id.button6);
        Button b2 =(Button)findViewById(R.id.button8);
        Button b6 =(Button)findViewById(R.id.button12);
        Button b8 =(Button)findViewById(R.id.button14);

        int b = 0;
        Random n = new Random();
        b = n.nextInt(4);
        if (b == 0) {
            b0.setText("O");
        } else if (b == 1) {
            b2.setText("O");
        } else if (b == 2) {
            b6.setText("O");
        } else if (b == 3) {
            b8.setText("O");
        }
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
                AI_win_prediction();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setText("O");
                AI_win_prediction();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText("O");
                AI_win_prediction();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setText("O");
                AI_win_prediction();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setText("O");
                AI_win_prediction();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setText("O");
                AI_win_prediction();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setText("O");
                AI_win_prediction();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setText("O");
                AI_win_prediction();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setText("O");
                AI_win_prediction();
            }
        });
    }
    void AI_win_prediction() {
        Button b0 = (Button) findViewById(R.id.button6);
        Button b1 = (Button) findViewById(R.id.button7);
        Button b2 = (Button) findViewById(R.id.button8);
        Button b3 = (Button) findViewById(R.id.button9);
        Button b4 = (Button) findViewById(R.id.button10);
        Button b5 = (Button) findViewById(R.id.button11);
        Button b6 = (Button) findViewById(R.id.button12);
        Button b7 = (Button) findViewById(R.id.button13);
        Button b8 = (Button) findViewById(R.id.button14);
        String tab[] = {"", "", "", "", "", "", "", "", ""};
        tab[0] = b0.getText().toString();
        tab[1] = b1.getText().toString();
        tab[2] = b2.getText().toString();
        tab[3] = b3.getText().toString();
        tab[4] = b4.getText().toString();
        tab[5] = b5.getText().toString();
        tab[6] = b6.getText().toString();
        tab[7] = b7.getText().toString();
        tab[8] = b8.getText().toString();
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        if (switch1.isChecked()) {
            if (tab[0] == "O" && tab[1] == "O" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
            } else if (tab[2] == "O" && tab[1] == "O" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
            } else if (tab[2] == "O" && tab[0] == "O" && tab[1] == "") {
                b1.setText("O");
                b1.setEnabled(false);
            } else if (tab[3] == "O" && tab[4] == "O" && tab[5] == "") {
                b5.setText("O");
                b5.setEnabled(false);
            } else if (tab[4] == "O" && tab[5] == "O" && tab[3] == "") {
                b3.setText("O");
                b3.setEnabled(false);
            } else if (tab[3] == "O" && tab[5] == "O" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
            } else if (tab[6] == "O" && tab[7] == "O" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
            } else if (tab[7] == "O" && tab[8] == "O" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
            } else if (tab[6] == "O" && tab[8] == "O" && tab[7] == "") {
                b7.setText("O");
                b7.setEnabled(false);
            } else if (tab[0] == "O" && tab[3] == "O" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
            } else if (tab[0] == "O" && tab[6] == "O" && tab[3] == "") {
                b3.setText("O");
                b3.setEnabled(false);
            } else if (tab[3] == "O" && tab[6] == "O" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
            } else if (tab[1] == "O" && tab[4] == "O" && tab[7] == "") {
                b7.setText("O");
                b7.setEnabled(false);
            } else if (tab[4] == "O" && tab[7] == "O" && tab[1] == "") {
                b1.setText("O");
                b1.setEnabled(false);
            } else if (tab[1] == "O" && tab[7] == "O" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
            } else if (tab[2] == "O" && tab[5] == "O" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
            } else if (tab[2] == "O" && tab[8] == "O" && tab[5] == "") {
                b5.setText("O");
                b5.setEnabled(false);
            } else if (tab[5] == "O" && tab[8] == "O" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
            } else if (tab[0] == "O" && tab[4] == "O" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
            } else if (tab[0] == "O" && tab[8] == "O" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
            } else if (tab[4] == "O" && tab[8] == "O" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
            } else if (tab[2] == "O" && tab[4] == "O" && tab[6] == "") {
                b6.setText("O");
                b0.setEnabled(false);
            } else if (tab[2] == "O" && tab[6] == "O" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
            } else if (tab[4] == "O" && tab[6] == "O" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
            } else if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "") {
                Random random = new Random();
                int b = random.nextInt(4);
                if (b == 0) {
                    b0.setText("O");
                    b0.setEnabled(false);
                } else if (b == 1) {
                    b2.setText("O");
                    b2.setEnabled(false);
                } else if (b == 2) {
                    b6.setText("O");
                    b6.setEnabled(false);
                } else if (b == 3) {
                    b8.setText("O");
                    b8.setEnabled(false);
                }
            }else  if (tab[0] == "O" && tab[1] == "X" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "X" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "X" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "X" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b8.setText("O");
                b8.setEnabled(false);}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "X" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "X" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "X" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "X")
            {b6.setText("O");
                b6.setEnabled(false);}

            else  if (tab[0] == "" && tab[1] == "X" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b8.setText("O");
                b8.setEnabled(false);}
            else  if (tab[0] == "X" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b8.setText("O");
                b8.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "X" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "X" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "X" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "X" && tab[7] == "" && tab[8] == "")
            {b0.setText("O");
                b0.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "X" && tab[8] == "")
            {b0.setText("X");
                b0.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "X")
            {b0.setText("O");
                b0.setEnabled(false);}

            else  if (tab[0] == "" && tab[1] == "X" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b0.setText("O");
                b0.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "X" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "X" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "X" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "X" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);}
            else  if (tab[0] == "X" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b8.setText("O");
                b8.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "X" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "X")
            {b2.setText("O");
                b2.setEnabled(false);}

            else  if (tab[0] == "" && tab[1] == "X" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b6.setText("O");
                b6.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "X" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b6.setText("O");
                b6.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "X" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b0.setText("O");
                b0.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "X" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b0.setText("O");
                b0.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "X" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b2.setText("O");
                b2.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "X" && tab[7] == "" && tab[8] == "O")
            {b6.setText("O");
                b6.setEnabled(false);}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "X" && tab[8] == "O")
            {b2.setText("X");
                b2.setEnabled(false);}
            else  if (tab[0] == "X" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b2.setText("O");
                b2.setEnabled(false);}
            else if (tab[0] == "X" && tab[1] == "X" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
            } else if (tab[2] == "X" && tab[1] == "X" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
            } else if (tab[2] == "X" && tab[0] == "X" && tab[1] == "") {
                b1.setText("O");
                b1.setEnabled(false);
            } else if (tab[3] == "X" && tab[4] == "X" && tab[5] == "") {
                b5.setText("O");
                b5.setEnabled(false);
            } else if (tab[4] == "X" && tab[5] == "X" && tab[3] == "") {
                b3.setText("O");
                b3.setEnabled(false);
            } else if (tab[3] == "X" && tab[5] == "X" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
            } else if (tab[6] == "X" && tab[7] == "X" && tab[8] == "") {
                b8.setText("8");
                b8.setEnabled(false);
            } else if (tab[7] == "X" && tab[8] == "X" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
            } else if (tab[6] == "X" && tab[8] == "X" && tab[7] == "") {
                b7.setText("O");
                b7.setEnabled(false);
            } else if (tab[0] == "X" && tab[3] == "X" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
            } else if (tab[0] == "X" && tab[6] == "X" && tab[3] == "") {
                b3.setText("O");
                b3.setEnabled(false);
            } else if (tab[3] == "X" && tab[6] == "X" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
            } else if (tab[1] == "X" && tab[4] == "X" && tab[7] == "") {
                b7.setText("O");
                b7.setEnabled(false);
            } else if (tab[4] == "X" && tab[7] == "X" && tab[1] == "") {
                b1.setText("O");
                b1.setEnabled(false);
            } else if (tab[1] == "X" && tab[7] == "X" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
            } else if (tab[2] == "X" && tab[5] == "X" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
            } else if (tab[2] == "X" && tab[8] == "X" && tab[5] == "") {
                b5.setText("O");
                b5.setEnabled(false);
            } else if (tab[5] == "X" && tab[8] == "X" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
            } else if (tab[0] == "X" && tab[4] == "X" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
            } else if (tab[0] == "X" && tab[8] == "X" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
            } else if (tab[4] == "X" && tab[8] == "X" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
            } else if (tab[2] == "X" && tab[4] == "X" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
            } else if (tab[2] == "X" && tab[6] == "X" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
            } else if (tab[4] == "X" && tab[6] == "X" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
            }
            else if (tab[0]==""){b0.setText("O");
                b0.setEnabled(false);}
            else if (tab[1]==""){b1.setText("O");
                b1.setEnabled(false);}
            else if (tab[2]==""){b2.setText("O");
                b2.setEnabled(false);}
            else if (tab[3]==""){b3.setText("O");
                b3.setEnabled(false);}
            else if (tab[4]==""){b4.setText("O");
                b4.setEnabled(false);}
            else if (tab[5]==""){b5.setText("O");
                b5.setEnabled(false);}
            else if (tab[6]==""){b6.setText("O");
                b6.setEnabled(false);}
            else if (tab[7]==""){b7.setText("O");
                b7.setEnabled(false);}
            else if (tab[8]==""){b8.setText("O");
                b8.setEnabled(false);}
        } else {
                                                                     //DO ZROBIENIA : Sprawdz mozliwosc wygranej
            if (tab[0] == "X" && tab[1] == "X" && tab[2] == "") {      // Sprawdz mozliwosc blokady wygranej
                                                                        // Postaw X tam gdzie jest miejsce (losoj)
            } else if (tab[2] == "X" && tab[1] == "X" && tab[0] == "") {

            } else if (tab[2] == "X" && tab[0] == "X" && tab[1] == "") {

            } else if (tab[3] == "X" && tab[4] == "X" && tab[5] == "") {

            } else if (tab[4] == "X" && tab[5] == "X" && tab[3] == "") {

            } else if (tab[3] == "X" && tab[5] == "X" && tab[4] == "") {

            } else if (tab[6] == "X" && tab[7] == "X" && tab[8] == "") {

            } else if (tab[7] == "X" && tab[8] == "X" && tab[6] == "") {

            } else if (tab[6] == "X" && tab[8] == "X" && tab[7] == "") {

            } else if (tab[0] == "X" && tab[3] == "X" && tab[6] == "") {

            } else if (tab[0] == "X" && tab[6] == "X" && tab[3] == "") {

            } else if (tab[3] == "X" && tab[6] == "X" && tab[0] == "") {

            } else if (tab[1] == "X" && tab[4] == "X" && tab[7] == "") {

            } else if (tab[4] == "X" && tab[7] == "X" && tab[1] == "") {

            } else if (tab[1] == "X" && tab[7] == "X" && tab[4] == "") {

            } else if (tab[2] == "X" && tab[5] == "X" && tab[8] == "") {

            } else if (tab[2] == "X" && tab[8] == "X" && tab[5] == "") {

            } else if (tab[5] == "X" && tab[8] == "X" && tab[2] == "") {

            } else if (tab[0] == "X" && tab[4] == "X" && tab[8] == "") {

            } else if (tab[0] == "X" && tab[8] == "X" && tab[4] == "") {

            } else if (tab[4] == "X" && tab[8] == "X" && tab[0] == "") {

            } else if (tab[2] == "X" && tab[4] == "X" && tab[6] == "") {

            } else if (tab[2] == "X" && tab[6] == "X" && tab[4] == "") {

            } else if (tab[4] == "X" && tab[6] == "X" && tab[2] == "") {

            }
        }
    }
    void reset_for_human(){
        Button b0= (Button)findViewById(R.id.button6);
        Button b1= (Button)findViewById(R.id.button7);
        Button b2= (Button)findViewById(R.id.button8);
        Button b3= (Button)findViewById(R.id.button9);
        Button b4= (Button)findViewById(R.id.button10);
        Button b5= (Button)findViewById(R.id.button11);
        Button b6= (Button)findViewById(R.id.button12);
        Button b7= (Button)findViewById(R.id.button13);
        Button b8= (Button)findViewById(R.id.button14);

        b0.setText("");
        b0.setEnabled(true);
        b1.setText("");
        b1.setEnabled(true);
        b2.setText("");
        b2.setEnabled(true);
        b3.setText("");
        b3.setEnabled(true);
        b4.setText("");
        b4.setEnabled(true);
        b5.setText("");
        b5.setEnabled(true);
        b6.setText("");
        b6.setEnabled(true);
        b7.setText("");
        b7.setEnabled(true);
        b8.setText("");
        b8.setEnabled(true);

    }
    void X_or_O(){
        final Switch switch1=  (Switch) findViewById(R.id.switch1);
        switch1.setChecked(true);
        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switch1.isChecked()){
                    reset_for_human();
                    AI_win_prediction();
                    click_X();
                }else {
                    reset_for_human();
                    click_O();
                }
            }
        });

    }

}