package o.t.xox_online;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        click_X();
        X_or_O();
        AI_win_prediction();
        i_tell_you_what_is_your_symbol();
        block();





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
                i_tell_you_what_is_your_symbol();
                b1.setText("X");
                b1.setEnabled(false);
                AI_win_prediction();
                inf();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i_tell_you_what_is_your_symbol();
                b2.setText("X");
                b2.setEnabled(false);
                AI_win_prediction();
                inf();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i_tell_you_what_is_your_symbol();
                b3.setText("X");
                b3.setEnabled(false);
                AI_win_prediction();
                inf();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i_tell_you_what_is_your_symbol();
                b4.setText("X");
                b4.setEnabled(false);
                AI_win_prediction();
                inf();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i_tell_you_what_is_your_symbol();
                b5.setText("X");
                b5.setEnabled(false);
                AI_win_prediction();
                inf();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i_tell_you_what_is_your_symbol();
                b6.setText("X");
                b6.setEnabled(false);
                AI_win_prediction();
                inf();
                }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i_tell_you_what_is_your_symbol();
                b7.setText("X");
                b7.setEnabled(false);
                AI_win_prediction();
                inf();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i_tell_you_what_is_your_symbol();
                b8.setText("X");
                b8.setEnabled(false);
                AI_win_prediction();
                inf();

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i_tell_you_what_is_your_symbol();
                b9.setText("X");
                b9.setEnabled(false);
                AI_win_prediction();
                inf();

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
                inf();
                i_tell_you_what_is_your_symbol();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b2.setText("O");
                AI_win_prediction();
                inf();
                i_tell_you_what_is_your_symbol();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b3.setText("O");
                AI_win_prediction();
                inf();
                i_tell_you_what_is_your_symbol();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b4.setText("O");
                AI_win_prediction();
                inf();
                i_tell_you_what_is_your_symbol();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b5.setText("O");
                AI_win_prediction();
                inf();
                i_tell_you_what_is_your_symbol();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b6.setText("O");
                AI_win_prediction();
                inf();
                i_tell_you_what_is_your_symbol();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b7.setText("O");
                AI_win_prediction();
                inf();
                i_tell_you_what_is_your_symbol();

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b8.setText("O");
                AI_win_prediction();
                inf();
                i_tell_you_what_is_your_symbol();

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b9.setText("O");
                AI_win_prediction();
                inf();
                i_tell_you_what_is_your_symbol();

            }
        });
    }
    void AI_win_prediction() {
        i_tell_you_what_is_your_symbol();
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
                inf();
            } else if (tab[2] == "O" && tab[1] == "O" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[0] == "O" && tab[1] == "") {
                b1.setText("O");
                b1.setEnabled(false);
                inf();
            } else if (tab[3] == "O" && tab[4] == "O" && tab[5] == "") {
                b5.setText("O");
                b5.setEnabled(false);
                inf();
            } else if (tab[4] == "O" && tab[5] == "O" && tab[3] == "") {
                b3.setText("O");
                b3.setEnabled(false);
                inf();
            } else if (tab[3] == "O" && tab[5] == "O" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
                inf();
            } else if (tab[6] == "O" && tab[7] == "O" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
                inf();
            } else if (tab[7] == "O" && tab[8] == "O" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
                inf();
            } else if (tab[6] == "O" && tab[8] == "O" && tab[7] == "") {
                b7.setText("O");
                b7.setEnabled(false);
                inf();
            } else if (tab[0] == "O" && tab[3] == "O" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
                inf();
            } else if (tab[0] == "O" && tab[6] == "O" && tab[3] == "") {
                b3.setText("O");
                b3.setEnabled(false);
                inf();
            } else if (tab[3] == "O" && tab[6] == "O" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
                inf();
            } else if (tab[1] == "O" && tab[4] == "O" && tab[7] == "") {
                b7.setText("O");
                b7.setEnabled(false);
                inf();
            } else if (tab[4] == "O" && tab[7] == "O" && tab[1] == "") {
                b1.setText("O");
                b1.setEnabled(false);
                inf();
            } else if (tab[1] == "O" && tab[7] == "O" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[5] == "O" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[8] == "O" && tab[5] == "") {
                b5.setText("O");
                b5.setEnabled(false);
                inf();
            } else if (tab[5] == "O" && tab[8] == "O" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
                inf();
            } else if (tab[0] == "O" && tab[4] == "O" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
                inf();
            } else if (tab[0] == "O" && tab[8] == "O" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
                inf();
            } else if (tab[4] == "O" && tab[8] == "O" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[4] == "O" && tab[6] == "") {
                b6.setText("O");
                b0.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[6] == "O" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
                inf();
            } else if (tab[4] == "O" && tab[6] == "O" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
                inf();
            } else if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "") {
                Random random = new Random();
                int b = random.nextInt(4);
                if (b == 0) {
                    b0.setText("O");
                    b0.setEnabled(false);
                    inf();
                } else if (b == 1) {
                    b2.setText("O");
                    b2.setEnabled(false);
                    inf();
                } else if (b == 2) {
                    b6.setText("O");
                    b6.setEnabled(false);
                    inf();
                } else if (b == 3) {
                    b8.setText("O");
                    b8.setEnabled(false);
                    inf();
                }
            }else  if (tab[0] == "O" && tab[1] == "X" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);
                inf();}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "X" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);
                inf();}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "X" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "X" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b8.setText("O");
                b8.setEnabled(false);
                inf();}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "X" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);
                inf();}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "X" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "X" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else  if (tab[0] == "O" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "X")
            {b6.setText("O");
                b6.setEnabled(false);
                inf();}

            else  if (tab[0] == "" && tab[1] == "X" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b8.setText("O");
                b8.setEnabled(false);
                inf();}
            else  if (tab[0] == "X" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b8.setText("O");
                b8.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "X" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "X" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "X" && tab[6] == "" && tab[7] == "" && tab[8] == "")
            {b6.setText("O");
                b6.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "X" && tab[7] == "" && tab[8] == "")
            {b0.setText("O");
                b0.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "X" && tab[8] == "")
            {b0.setText("O");
                b0.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "O" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "X")
            {b0.setText("O");
                b0.setEnabled(false);
                inf();}

            else  if (tab[0] == "" && tab[1] == "X" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b0.setText("O");
                b0.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "X" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b4.setText("O");
                b4.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "X" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "X" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "X" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else  if (tab[0] == "X" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "")
            {b8.setText("O");
                b8.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "X" && tab[8] == "")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "O" && tab[7] == "" && tab[8] == "X")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}

            else  if (tab[0] == "" && tab[1] == "X" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b6.setText("O");
                b6.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "X" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b6.setText("O");
                b6.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "X" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b0.setText("O");
                b0.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "X" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b0.setText("O");
                b0.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "X" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "X" && tab[7] == "" && tab[8] == "O")
            {b0.setText("O");
                b0.setEnabled(false);
                inf();}
            else  if (tab[0] == "" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "X" && tab[8] == "O")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else  if (tab[0] == "X" && tab[1] == "" && tab[2] == "" && tab[3] == "" && tab[4] == "" && tab[5] == "" && tab[6] == "" && tab[7] == "" && tab[8] == "O")
            {b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else if (tab[0] == "X" && tab[1] == "X" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[1] == "X" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[0] == "X" && tab[1] == "") {
                b1.setText("O");
                b1.setEnabled(false);
                inf();
            } else if (tab[3] == "X" && tab[4] == "X" && tab[5] == "") {
                b5.setText("O");
                b5.setEnabled(false);
                inf();
            } else if (tab[4] == "X" && tab[5] == "X" && tab[3] == "") {
                b3.setText("O");
                b3.setEnabled(false);
                inf();
            } else if (tab[3] == "X" && tab[5] == "X" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
                inf();
            } else if (tab[6] == "X" && tab[7] == "X" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
                inf();
            } else if (tab[7] == "X" && tab[8] == "X" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
                inf();
            } else if (tab[6] == "X" && tab[8] == "X" && tab[7] == "") {
                b7.setText("O");
                b7.setEnabled(false);
                inf();
            } else if (tab[0] == "X" && tab[3] == "X" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
                inf();
            } else if (tab[0] == "X" && tab[6] == "X" && tab[3] == "") {
                b3.setText("O");
                b3.setEnabled(false);
                inf();
            } else if (tab[3] == "X" && tab[6] == "X" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
                inf();
            } else if (tab[1] == "X" && tab[4] == "X" && tab[7] == "") {
                b7.setText("O");
                b7.setEnabled(false);
                inf();
            } else if (tab[4] == "X" && tab[7] == "X" && tab[1] == "") {
                b1.setText("O");
                b1.setEnabled(false);
                inf();
            } else if (tab[1] == "X" && tab[7] == "X" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[5] == "X" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[8] == "X" && tab[5] == "") {
                b5.setText("O");
                b5.setEnabled(false);
                inf();
            } else if (tab[5] == "X" && tab[8] == "X" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
                inf();
            } else if (tab[0] == "X" && tab[4] == "X" && tab[8] == "") {
                b8.setText("O");
                b8.setEnabled(false);
                inf();
            } else if (tab[0] == "X" && tab[8] == "X" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);
                inf();
            } else if (tab[4] == "X" && tab[8] == "X" && tab[0] == "") {
                b0.setText("O");
                b0.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[4] == "X" && tab[6] == "") {
                b6.setText("O");
                b6.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[6] == "X" && tab[4] == "") {
                b4.setText("O");
                b4.setEnabled(false);inf();
            } else if (tab[4] == "X" && tab[6] == "X" && tab[2] == "") {
                b2.setText("O");
                b2.setEnabled(false);
                inf();
            }
            else if (tab[0]==""){b0.setText("O");
                b0.setEnabled(false);
                inf();}
            else if (tab[1]==""){b1.setText("O");
                b1.setEnabled(false);
                inf();}
            else if (tab[2]==""){b2.setText("O");
                b2.setEnabled(false);
                inf();}
            else if (tab[3]==""){b3.setText("O");
                b3.setEnabled(false);
                inf();}
            else if (tab[4]==""){b4.setText("O");
                b4.setEnabled(false);
                inf();}
            else if (tab[5]==""){b5.setText("O");
                b5.setEnabled(false);
                inf();}
            else if (tab[6]==""){b6.setText("O");
                b6.setEnabled(false);
                inf();}
            else if (tab[7]==""){b7.setText("O");
                b7.setEnabled(false);
                inf();}
            else if (tab[8]==""){b8.setText("O");
                b8.setEnabled(false);
                inf();}
        } else {
            if (tab[0]==""&&tab[1]==""&&tab[2]==""&&tab[3]==""&&tab[4]=="O"&&tab[5]==""&&tab[6]==""&&tab[7]==""&&tab[8]=="")
            {Random random=new Random();
            int a = random.nextInt(4);
            if (a==0){b0.setText("X");
                b0.setEnabled(false);
                inf();}
                else if (a==1){b2.setText("X");
                b2.setEnabled(false);
                inf();}
            else if (a==2){b6.setText("X");
                b6.setEnabled(false);
                inf();}
            else if (a==3){b8.setText("X");
                b8.setEnabled(false);
                inf();}
            }
            else if (tab[4]==""){b4.setText("X");b4.setEnabled(false);inf();}

           else if (tab[0] == "X" && tab[1] == "X" && tab[2] == "") {
                b2.setText("X");
                b2.setEnabled(false);
                inf();

            } else if (tab[2] == "X" && tab[1] == "X" && tab[0] == "") {
                b0.setText("X");
                b0.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[0] == "X" && tab[1] == "") {
                b1.setText("X");
                b1.setEnabled(false);
                inf();
            } else if (tab[3] == "X" && tab[4] == "X" && tab[5] == "") {
                b5.setText("X");
                b5.setEnabled(false);
                inf();
            } else if (tab[4] == "X" && tab[5] == "X" && tab[3] == "") {
                b3.setText("X");
                b3.setEnabled(false);
                inf();
            } else if (tab[3] == "X" && tab[5] == "X" && tab[4] == "") {
                b4.setText("X");
                b4.setEnabled(false);
                inf();
            } else if (tab[6] == "X" && tab[7] == "X" && tab[8] == "") {
                b8.setText("X");
                b8.setEnabled(false);
                inf();
            } else if (tab[7] == "X" && tab[8] == "X" && tab[6] == "") {
                b6.setText("X");
                b6.setEnabled(false);
                inf();
            } else if (tab[6] == "X" && tab[8] == "X" && tab[7] == "") {
                b7.setText("X");
                b7.setEnabled(false);
                inf();
            } else if (tab[0] == "X" && tab[3] == "X" && tab[6] == "") {
                b6.setText("X");
                b6.setEnabled(false);
                inf();
            } else if (tab[0] == "X" && tab[6] == "X" && tab[3] == "") {
                b3.setText("X");
                b3.setEnabled(false);
                inf();
            } else if (tab[3] == "X" && tab[6] == "X" && tab[0] == "") {
                b0.setText("X");
                b0.setEnabled(false);
                inf();
            } else if (tab[1] == "X" && tab[4] == "X" && tab[7] == "") {
                b7.setText("X");
                b7.setEnabled(false);
                inf();
            } else if (tab[4] == "X" && tab[7] == "X" && tab[1] == "") {
                b1.setText("X");
                b1.setEnabled(false);
                inf();
            } else if (tab[1] == "X" && tab[7] == "X" && tab[4] == "") {
                b4.setText("X");
                b4.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[5] == "X" && tab[8] == "") {
                b8.setText("X");
                b8.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[8] == "X" && tab[5] == "") {
                b5.setText("X");
                b5.setEnabled(false);
                inf();
            } else if (tab[5] == "X" && tab[8] == "X" && tab[2] == "") {
                b2.setText("X");
                b2.setEnabled(false);
                inf();
            } else if (tab[0] == "X" && tab[4] == "X" && tab[8] == "") {
                b8.setText("X");
                b8.setEnabled(false);
                inf();
            } else if (tab[0] == "X" && tab[8] == "X" && tab[4] == "") {
                b4.setText("X");
                b4.setEnabled(false);
                inf();
            } else if (tab[4] == "X" && tab[8] == "X" && tab[0] == "") {
                b0.setText("X");
                b0.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[4] == "X" && tab[6] == "") {
                b6.setText("X");
                b6.setEnabled(false);
                inf();
            } else if (tab[2] == "X" && tab[6] == "X" && tab[4] == "") {
                b4.setText("X");
                b4.setEnabled(false);
                inf();
            } else if (tab[4] == "X" && tab[6] == "X" && tab[2] == "") {
                b2.setText("X");
                b2.setEnabled(false);
                inf();
            }

            else if (tab[0] == "O" && tab[1] == "O" && tab[2] == "") {
                b2.setText("X");
                b2.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[1] == "O" && tab[0] == "") {
                b0.setText("X");
                b0.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[0] == "O" && tab[1] == "") {
                b1.setText("X");
                b1.setEnabled(false);
                inf();
            } else if (tab[3] == "O" && tab[4] == "O" && tab[5] == "") {
                b5.setText("X");
                b5.setEnabled(false);
                inf();
            } else if (tab[4] == "O" && tab[5] == "O" && tab[3] == "") {
                b3.setText("X");
                b3.setEnabled(false);
                inf();
            } else if (tab[3] == "O" && tab[5] == "O" && tab[4] == "") {
                b4.setText("X");
                b4.setEnabled(false);
                inf();
            } else if (tab[6] == "O" && tab[7] == "O" && tab[8] == "") {
                b8.setText("X");
                b8.setEnabled(false);
                inf();
            } else if (tab[7] == "O" && tab[8] == "O" && tab[6] == "") {
                b6.setText("X");
                b6.setEnabled(false);
                inf();
            } else if (tab[6] == "O" && tab[8] == "O" && tab[7] == "") {
                b7.setText("X");
                b7.setEnabled(false);
                inf();
            } else if (tab[0] == "O" && tab[3] == "O" && tab[6] == "") {
                b6.setText("X");
                b6.setEnabled(false);
                inf();
            } else if (tab[0] == "O" && tab[6] == "O" && tab[3] == "") {
                b3.setText("X");
                b3.setEnabled(false);
                inf();
            } else if (tab[3] == "O" && tab[6] == "O" && tab[0] == "") {
                b0.setText("X");
                b0.setEnabled(false);
                inf();
            } else if (tab[1] == "O" && tab[4] == "O" && tab[7] == "") {
                b7.setText("X");
                b7.setEnabled(false);
                inf();
            } else if (tab[4] == "O" && tab[7] == "O" && tab[1] == "") {
                b1.setText("X");
                b1.setEnabled(false);
                inf();
            } else if (tab[1] == "O" && tab[7] == "O" && tab[4] == "") {
                b4.setText("X");
                b4.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[5] == "O" && tab[8] == "") {
                b8.setText("X");
                b8.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[8] == "O" && tab[5] == "") {
                b5.setText("X");
                b5.setEnabled(false);
                inf();
            } else if (tab[5] == "O" && tab[8] == "O" && tab[2] == "") {
                b2.setText("X");
                b2.setEnabled(false);
                inf();
            } else if (tab[0] == "O" && tab[4] == "O" && tab[8] == "") {
                b8.setText("X");
                b8.setEnabled(false);
                inf();
            } else if (tab[0] == "O" && tab[8] == "O" && tab[4] == "") {
                b4.setText("X");
                b4.setEnabled(false);
                inf();
            } else if (tab[4] == "O" && tab[8] == "O" && tab[0] == "") {
                b0.setText("X");
                b0.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[4] == "O" && tab[6] == "") {
                b6.setText("X");
                b6.setEnabled(false);
                inf();
            } else if (tab[2] == "O" && tab[6] == "O" && tab[4] == "") {
                b4.setText("X");
                b4.setEnabled(false);
                inf();
            } else if (tab[4] == "O" && tab[6] == "O" && tab[2] == "") {
                b2.setText("X");
                b2.setEnabled(false);
                inf();
            }
            else if (tab[0]==""){b0.setText("X");b0.setEnabled(false);inf();}
            else if (tab[1]==""){b1.setText("X");b1.setEnabled(false);inf();}
            else if (tab[2]==""){b2.setText("X");b2.setEnabled(false);inf();}
            else if (tab[3]==""){b3.setText("X");b3.setEnabled(false);inf();}
            else if (tab[4]==""){b4.setText("X");b4.setEnabled(false);inf();}
            else if (tab[5]==""){b5.setText("X");b5.setEnabled(false);inf();}
            else if (tab[6]==""){b6.setText("X");b6.setEnabled(false);inf();}
            else if (tab[7]==""){b7.setText("X");b7.setEnabled(false);inf();}
            else if (tab[8]==""){b8.setText("X");b8.setEnabled(false);inf();}
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
void inf(){
    MediaPlayer mediaPlayer = MediaPlayer.create(Main2Activity.this,R.raw.ding);
    if (who_win()==0){
        Context context = getApplicationContext();
        CharSequence text = "The Winner is: X";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        mediaPlayer.start();
    }else if (who_win()==1){
        Context context = getApplicationContext();
        CharSequence text = "The Winner is: O";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        mediaPlayer.start();
        block();
    }else if (who_win()==3){Context context = getApplicationContext();
        CharSequence text = "TIE";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        mediaPlayer.start();
        block();
    }}

    public int who_win () {
        Button b0 = (Button) findViewById(R.id.button6);
        Button b1 = (Button) findViewById(R.id.button7);
        Button b2 = (Button) findViewById(R.id.button8);
        Button b3 = (Button) findViewById(R.id.button9);
        Button b4 = (Button) findViewById(R.id.button10);
        Button b5 = (Button) findViewById(R.id.button11);
        Button b6 = (Button) findViewById(R.id.button12);
        Button b7 = (Button) findViewById(R.id.button13);
        Button b8 = (Button) findViewById(R.id.button14);
        Switch switcher1 = (Switch) findViewById(R.id.switch1);
        String tab[] = {"", "", "", "", "", "", "", "", ""};
        int winer = 5;
        tab[0] = b0.getText().toString();
        tab[1] = b1.getText().toString();
        tab[2] = b2.getText().toString();
        tab[3] = b3.getText().toString();
        tab[4] = b4.getText().toString();
        tab[5] = b5.getText().toString();
        tab[6] = b6.getText().toString();
        tab[7] = b7.getText().toString();
        tab[8] = b8.getText().toString();


            if (tab[0] == tab[1] && tab[1] == tab[2] && tab[0] == "X" ||
                    tab[3] == tab[4] && tab[5] == tab[4] && tab[3] == "X" ||
                    tab[6] == tab[7] && tab[8] == tab[6] && tab[6] == "X" ||
                    tab[0] == tab[3] && tab[6] == tab[0] && tab[3] == "X" ||
                    tab[1] == tab[4] && tab[4] == tab[7] && tab[1] == "X" ||
                    tab[2] == tab[5] && tab[8] == tab[2] && tab[5] == "X" ||
                    tab[0] == tab[4] && tab[8] == tab[0] && tab[4] == "X" ||
                    tab[2] == tab[4] && tab[6] == tab[2] && tab[6] == "X") {
                //WYGRAL X
                winer=0;
                block();

            } else if (tab[0] == tab[1] && tab[1] == tab[2] && tab[0] == "O" ||
                    tab[3] == tab[4] && tab[5] == tab[4] && tab[3] == "O" ||
                    tab[6] == tab[7] && tab[8] == tab[6] && tab[6] == "O" ||
                    tab[0] == tab[3] && tab[6] == tab[0] && tab[3] == "O" ||
                    tab[1] == tab[4] && tab[4] == tab[7] && tab[1] == "O" ||
                    tab[2] == tab[5] && tab[8] == tab[2] && tab[5] == "O" ||
                    tab[0] == tab[4] && tab[8] == tab[0] && tab[4] == "O" ||
                    tab[2] == tab[4] && tab[6] == tab[2] && tab[6] == "O") {
                //WYGRAL O
                winer=1;
                block();
            } else if (tab[0]!=""&&tab[1]!=""&&tab[2]!=""&&tab[3]!=""&&tab[4]!=""&&tab[5]!=""&&tab[6]!=""&&tab[7]!=""&&tab[8]!=""){winer=3;}
        return winer;}

public void block(){
    Button b0=(Button) findViewById(R.id.button6);
    Button b1=(Button) findViewById(R.id.button7);
    Button b2=(Button) findViewById(R.id.button8);
    Button b3=(Button) findViewById(R.id.button9);
    Button b4=(Button) findViewById(R.id.button10);
    Button b5=(Button) findViewById(R.id.button11);
    Button b6=(Button) findViewById(R.id.button12);
    Button b7=(Button) findViewById(R.id.button13);
    Button b8=(Button) findViewById(R.id.button14);
    b0.setEnabled(false);
    b1.setEnabled(false);
    b2.setEnabled(false);
    b3.setEnabled(false);
    b4.setEnabled(false);
    b5.setEnabled(false);
    b6.setEnabled(false);
    b7.setEnabled(false);
    b8.setEnabled(false);
}
    public void i_tell_you_what_is_your_symbol(){
        Switch switcher1= (Switch)findViewById(R.id.switch1);
        TextView textView2=(TextView) findViewById(R.id.textView2);
        TextView textView3=(TextView) findViewById(R.id.textView3);
        if (switcher1.isChecked()){
            textView3.setText("CPU play first: O");
            textView2.setText("You play second: X");
        }else {textView3.setText("CPU play second: X");
            textView2.setText("You play first: O");}

    }


}