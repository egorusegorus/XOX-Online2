package o.t.xox_online;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        who_play_first();
        leave_mark();
        game_a();

    }

    void who_play_first() {
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1) {
            textView2.setText("You play first: X");
        } else {
            textView2.setText("You play second: O");
        }
    }

    void leave_mark() {
        final Button button6 = (Button) findViewById(R.id.button6);
        final Button button7 = (Button) findViewById(R.id.button7);
        final Button button8 = (Button) findViewById(R.id.button8);
        final Button button9 = (Button) findViewById(R.id.button9);
        final Button button10 = (Button) findViewById(R.id.button10);
        final Button button11 = (Button) findViewById(R.id.button11);
        final Button button12 = (Button) findViewById(R.id.button12);
        final Button button13 = (Button) findViewById(R.id.button13);
        final Button button14 = (Button) findViewById(R.id.button14);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        String txt;
        String sign = "";
        txt = (String) textView2.getText();
        int click = 0;
        if (txt.equals("You play second: O")) {
            sign = "O";
        } else {
            sign = "X";
        }
        final String finalSign = sign;
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setText(finalSign);
                button6.setEnabled(false);
                move_number();
                game_a();
                game_b();

            }
        });
        final String finalSign1 = sign;
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button7.setText(finalSign1);
                button7.setEnabled(false);
                move_number();
                game_a();
                game_b();
            }
        });

        final String finalSign2 = sign;
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button8.setText(finalSign2);
                button8.setEnabled(false);
                move_number();
                game_a();
                game_b();
            }
        });

        final String finalSign3 = sign;
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setText(finalSign3);
                button9.setEnabled(false);
                move_number();
                game_a();
                game_b();
            }
        });

        final String finalSign4 = sign;
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setText(finalSign4);
                button10.setEnabled(false);
                move_number();
                game_a();
                game_b();
            }
        });

        final String finalSign5 = sign;
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11.setText(finalSign5);
                button11.setEnabled(false);
                move_number();
                game_a();
                game_b();
            }
        });

        final String finalSign6 = sign;
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button12.setText(finalSign6);
                button12.setEnabled(false);
                move_number();
                game_a();
                game_b();
            }
        });

        final String finalSign7 = sign;
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setText(finalSign7);
                button13.setEnabled(false);
                move_number();
                game_a();
                game_b();
            }
        });

        final String finalSign8 = sign;
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button14.setText(finalSign8);
                button14.setEnabled(false);
                move_number();
                game_a();
                game_b();
            }
        });
    }

    void move_number() {
        int ruch;
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        ruch = Integer.parseInt(textView3.getText().toString());
        ruch = ruch + 1;
        String a;
        a=Integer.toString(ruch);
        textView3.setText(a);
    }

    void game_a() {
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        if (textView2.getText() == "You play second: O") {    //cpu play first
            if (textView3.getText().equals("0")) {
                Random random = new Random();
                int a = random.nextInt(4) + 1;
                if (a == 1) {
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();
                } else if (a == 2) {
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();
                } else if (a == 3) {
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();
                } else if (a == 4) {
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();
                }
            }
            if (textView3.getText().equals("2") && textView2.getText() == "You play second: O") {
                if (button10.getText().equals("O")) {
                    if (button6.getText().equals("X")) {
                        button14.setText("X");
                        button14.setEnabled(false);
                        move_number();
                    } else if (button8.getText().equals("X")) {
                        button12.setText("X");
                        button12.setEnabled(false);
                        move_number();
                    } else if (button12.getText().equals("X")) {
                        button8.setText("X");
                        button8.setEnabled(false);
                        move_number();
                    } else if (button14.getText().equals("X")) {
                        button6.setText("X");
                        button6.setEnabled(false);
                        move_number();
                    }
                } else if (button10.getText().equals("")) {
                    if (button6.getText().equals("X") && button8.getText().equals("")) {
                        button8.setText("X");
                        button8.setEnabled(false);
                        move_number();
                    } else if (button6.getText().equals("X") && button12.getText().equals("")) {
                        button12.setText("X");
                        button12.setEnabled(false);
                        move_number();
                    } else if (button8.getText().equals("X") && button6.getText().equals("")) {
                        button6.setText("X");
                        button6.setEnabled(false);
                        move_number();
                    } else if (button8.getText().equals("X") && button14.getText().equals("")) {
                        button14.setText("X");
                        button14.setEnabled(false);
                        move_number();
                    } else if (button12.getText().equals("X") && button6.getText().equals("")) {
                        button6.setText("X");
                        button6.setEnabled(false);
                        move_number();
                    } else if (button12.getText().equals("X") && button14.getText().equals("")) {
                        button14.setText("X");
                        button14.setEnabled(false);
                        move_number();
                    } else if (button14.getText().equals("X") && button12.getText().equals("")) {
                        button12.setText("X");
                        button12.setEnabled(false);
                        move_number();
                    } else if (button14.getText().equals("X") && button8.getText().equals("")) {
                        button8.setText("X");
                        button8.setEnabled(false);
                        move_number();
                    }

                }
            }

        }
        if (textView3.getText().equals("4") && textView2.getText() == "You play second: O") {
            if (button10.getText().equals("O")) {
                if(button7.getText().equals("O")){
                    button13.setText("X");
                    button13.setEnabled(false);
                    move_number();
                }
                else if(button9.getText().equals("O")){
                    button11.setText("X");
                    button11.setEnabled(false);
                    move_number();
                }
               else if(button11.getText().equals("O")){
                    button9.setText("X");
                    button9.setEnabled(false);
                    move_number();
                }
               else if(button13.getText().equals("O")){
                    button7.setText("X");
                    button7.setEnabled(false);
                    move_number();
                }
                else if (button6.getText().equals("")) {
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();
                } else if (button8.getText().equals("")) {
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();
                } else if (button12.getText().equals("")) {
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();
                } else if (button14.getText().equals("")) {
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();
                }
            } else if (button10.getText().equals("")) {
                if (button6.getText().equals("X") && button8.getText().equals("X") && button7.getText().equals("")) {
                    button7.setText("X");
                    button7.setEnabled(false);
                    move_number();

                } else if (button6.getText().equals("X") && button12.getText().equals("X") && button9.getText().equals("")) {
                    button9.setText("X");
                    button9.setEnabled(false);
                    move_number();

                } else if (button8.getText().equals("X") && button14.getText().equals("X") && button11.getText().equals("")) {
                    button11.setText("X");
                    button11.setEnabled(false);
                    move_number();

                } else if (button14.getText().equals("X") && button12.getText().equals("X") && button13.getText().equals("")) {
                    button13.setText("X");
                    button13.setEnabled(false);
                    move_number();

                } else if (button6.getText().equals("")) {
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();
                } else if (button8.getText().equals("")) {
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();
                } else if (button12.getText().equals("")) {
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();
                } else if (button14.getText().equals("")) {
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();
                }
            } else {
                if (button10.getText().equals("O") && button6.getText().equals("O") && button14.getText().equals("")) {
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();
                } else if (button10.getText().equals("O") && button7.getText().equals("O") && button13.getText().equals("")) {
                    button13.setText("X");
                    button13.setEnabled(false);
                    move_number();
                } else if (button10.getText().equals("O") && button8.getText().equals("O") && button12.getText().equals("")) {
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();
                } else if (button10.getText().equals("O") && button9.getText().equals("O") && button11.getText().equals("")) {
                    button11.setText("X");
                    button11.setEnabled(false);
                    move_number();
                } else if (button10.getText().equals("O") && button11.getText().equals("O") && button9.getText().equals("")) {
                    button9.setText("X");
                    button9.setEnabled(false);
                    move_number();
                } else if (button10.getText().equals("O") && button12.getText().equals("O") && button8.getText().equals("")) {
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();
                } else if (button10.getText().equals("O") && button13.getText().equals("O") && button7.getText().equals("")) {
                    button7.setText("X");
                    button7.setEnabled(false);
                    move_number();
                } else if (button10.getText().equals("O") && button14.getText().equals("O") && button6.getText().equals("")) {
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();
                } else if (button6.getText().equals("O") && button7.getText().equals("O") && button8.getText().equals("")) {
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();
                } else if (button6.getText().equals("O") && button8.getText().equals("O") && button7.getText().equals("")) {
                    button7.setText("X");
                    button7.setEnabled(false);
                    move_number();
                } else if (button8.getText().equals("O") && button7.getText().equals("O") && button6.getText().equals("")) {
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();
                } else if (button12.getText().equals("O") && button13.getText().equals("O") && button14.getText().equals("")) {
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();
                } else if (button12.getText().equals("O") && button14.getText().equals("O") && button13.getText().equals("")) {
                    button13.setText("X");
                    button13.setEnabled(false);
                    move_number();
                } else if (button13.getText().equals("O") && button14.getText().equals("O") && button12.getText().equals("")) {
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();
                } else if (button6.getText().equals("O") && button9.getText().equals("O") && button12.getText().equals("")) {
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();
                } else if (button6.getText().equals("O") && button12.getText().equals("O") && button9.getText().equals("")) {
                    button9.setText("X");
                    button9.setEnabled(false);
                    move_number();
                } else if (button9.getText().equals("O") && button12.getText().equals("O") && button6.getText().equals("")) {
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();
                } else if (button8.getText().equals("O") && button11.getText().equals("O") && button14.getText().equals("")) {
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();
                } else if (button8.getText().equals("O") && button14.getText().equals("O") && button11.getText().equals("")) {
                    button11.setText("X");
                    button11.setEnabled(false);
                    move_number();
                } else if (button11.getText().equals("O") && button14.getText().equals("O") && button8.getText().equals("")) {
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();
                }
            }
        }


        if (textView3.getText().equals("6") && textView2.getText() == "You play second: O") {
            if (button10.getText().equals("O")) {
                if (button6.getText().equals("X") && button8.getText().equals("X") && button7.getText().equals("")) {
                    button7.setText("X");
                    button7.setEnabled(false);
                    move_number();
                } else if (button6.getText().equals("X") && button12.getText().equals("X") && button9.getText().equals("")) {
                    button9.setText("X");
                    button9.setEnabled(false);
                    move_number();
                } else if ((button12.getText().equals("X") && button14.getText().equals("X") && button13.getText().equals(""))) {
                    button13.setText("X");
                    button13.setEnabled(false);
                    move_number();
                } else if (button8.getText().equals("X") && button14.getText().equals("X") && button11.getText().equals("")) {
                    button11.setText("X");
                    button11.setEnabled(false);
                    move_number();
                }

                else if(button10.getText().equals("O")&&button6.getText().equals("O")&&button14.getText().equals("")) {
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("O")&&button7.getText().equals("O")&&button13.getText().equals("")) {
                    button13.setText("X");
                    button13.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("O")&&button8.getText().equals("O")&&button12.getText().equals("")) {
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("O")&&button9.getText().equals("O")&&button11.getText().equals("")) {
                    button11.setText("X");
                    button11.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("O")&&button11.getText().equals("O")&&button9.getText().equals("")) {
                    button9.setText("X");
                    button9.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("O")&&button12.getText().equals("O")&&button8.getText().equals("")) {
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("O")&&button13.getText().equals("O")&&button7.getText().equals("")) {
                    button7.setText("X");
                    button7.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("O")&&button14.getText().equals("O")&&button6.getText().equals("")) {
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("O")&&button7.getText().equals("O")&&button8.getText().equals("")) {
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("O")&&button8.getText().equals("O")&&button7.getText().equals("")) {
                    button7.setText("X");
                    button7.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("O")&&button7.getText().equals("O")&&button6.getText().equals("")) {
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("O")&&button13.getText().equals("O")&&button14.getText().equals("")) {
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("O")&&button14.getText().equals("O")&&button13.getText().equals("")) {
                    button13.setText("X");
                    button13.setEnabled(false);
                    move_number();}
                else if(button13.getText().equals("O")&&button14.getText().equals("O")&&button12.getText().equals("")) {
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("O")&&button9.getText().equals("O")&&button12.getText().equals("")) {
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("O")&&button12.getText().equals("O")&&button9.getText().equals("")) {
                    button9.setText("X");
                    button9.setEnabled(false);
                    move_number();}
                else if(button9.getText().equals("O")&&button12.getText().equals("O")&&button6.getText().equals("")) {
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("O")&&button11.getText().equals("O")&&button14.getText().equals("")) {
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("O")&&button14.getText().equals("O")&&button11.getText().equals("")) {
                    button11.setText("X");
                    button11.setEnabled(false);
                    move_number();}
                else if(button11.getText().equals("O")&&button14.getText().equals("O")&&button8.getText().equals("")) {
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();}

            } else if (button10.getText().equals("")) {
                button10.setText("X");
                button10.setEnabled(false);
                move_number();
            } else {
                Random random= new Random();
                int a;
                a=random.nextInt(9);
                if (a==0&&button6.getText().equals("")){
                    button6.setText("X");
                    button6.setEnabled(false);
                    move_number();}
                else if (a==1&&button7.getText().equals("")){
                    button7.setText("X");
                    button7.setEnabled(false);
                    move_number();}
                else if (a==2&&button8.getText().equals("")){
                    button8.setText("X");
                    button8.setEnabled(false);
                    move_number();}
                else if (a==3&&button9.getText().equals("")){
                    button9.setText("X");
                    button9.setEnabled(false);
                    move_number();}
                else if (a==4&&button10.getText().equals("")){
                    button10.setText("X");
                    button10.setEnabled(false);
                    move_number();}
                else if (a==5&&button11.getText().equals("")){
                    button11.setText("X");
                    button11.setEnabled(false);
                    move_number();}
                else if (a==6&&button12.getText().equals("")){
                    button12.setText("X");
                    button12.setEnabled(false);
                    move_number();}
                else if (a==7&&button13.getText().equals("")){
                    button13.setText("X");
                    button13.setEnabled(false);
                    move_number();}
                else if (a==8&&button14.getText().equals("")){
                    button14.setText("X");
                    button14.setEnabled(false);
                    move_number();}
            }
        }
        if (textView3.getText().equals("8") && textView2.getText() == "You play second: O") {
            if (button6.getText().equals("")){button6.setText("X");}
            else if (button7.getText().equals("")){button7.setText("X");}
            else if (button8.getText().equals("")){button8.setText("X");}
            else if (button9.getText().equals("")){button9.setText("X");}
            else if (button10.getText().equals("")){button10.setText("X");}
            else if (button11.getText().equals("")){button11.setText("X");}
            else if (button12.getText().equals("")){button12.setText("X");}
            else if (button13.getText().equals("")){button13.setText("X");}
            else if (button14.getText().equals("")){button14.setText("X");}
        }
    }


    void game_b() {
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        if (textView2.getText().equals("You play first: X")) {
            if (textView3.getText().equals("1")) {
                if (button10.getText().equals("X")) {
                    int a;
                    Random random = new Random();
                    a = random.nextInt(4 - 1) + 1;
                    if (a == 1) {
                        button6.setText("O");
                        button6.setEnabled(false);
                        move_number();
                    } else if (a == 2) {
                        button8.setText("O");
                        button8.setEnabled(false);
                        move_number();
                    } else if (a == 3) {
                        button12.setText("O");
                        button12.setEnabled(false);
                        move_number();
                    } else if (a == 4) {
                        button14.setText("O");
                        button14.setEnabled(false);
                        move_number();
                    }
                } else if (!button10.getText().equals("X")) {
                    button10.setText("O");
                    button10.setEnabled(false);
                    move_number();
                }}
            if (textView3.getText().equals("3")) {
                if(button6.getText().equals("X")&&button14.getText().equals("X")) {
                button12.setText("O");
                    button12.setEnabled(false);
                move_number();}
                else if(button8.getText().equals("X")&&button12.getText().equals("X")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button9.getText().equals("X")&&button11.getText().equals("X")) {
                button7.setText("O");
                    button7.setEnabled(false);
                move_number();}
                else if(button7.getText().equals("X")&&button13.getText().equals("X")) {
                button14.setText("O");
                    button14.setEnabled(false);
                move_number();}
                else if(button6.getText().equals("X")&&button8.getText().equals("X")) {
                    button7.setText("O");
                    button7.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("X")&&button14.getText().equals("X")) {
                    button13.setText("O");
                    button13.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button12.getText().equals("X")) {
                    button9.setText("O");
                    button9.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button14.getText().equals("X")) {
                    button11.setText("O");
                    button11.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button13.getText().equals("X")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("X")&&button7.getText().equals("X")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button13.getText().equals("X")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button7.getText().equals("X")&&button14.getText().equals("X")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button8.getText().equals("X")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button9.getText().equals("X")&&button14.getText().equals("X")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button11.getText().equals("X")&&button6.getText().equals("X")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button11.getText().equals("X")&&button12.getText().equals("X")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button6.getText().equals("X")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button7.getText().equals("X")) {
                    button13.setText("O");
                    button13.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button8.getText().equals("X")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button9.getText().equals("X")) {
                    button11.setText("O");
                    button11.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button11.getText().equals("X")) {
                    button9.setText("O");
                    button9.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button12.getText().equals("X")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button13.getText().equals("X")) {
                    button7.setText("O");
                    button7.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button14.getText().equals("X")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                if(button10.getText().equals("X")&&button6.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button7.getText().equals("X")&&button13.getText().equals("")) {
                    button13.setText("O");
                    button13.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button8.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button9.getText().equals("X")&&button11.getText().equals("")) {
                    button11.setText("O");
                    button11.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button11.getText().equals("X")&&button9.getText().equals("")) {
                    button9.setText("O");
                    button9.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button12.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button13.getText().equals("X")&&button7.getText().equals("")) {
                    button7.setText("O");
                    button7.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button14.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button7.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button8.getText().equals("X")&&button7.getText().equals("")) {
                    button7.setText("O");
                    button7.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button7.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("X")&&button13.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("X")&&button14.getText().equals("X")&&button13.getText().equals("")) {
                    button13.setText("O");
                    button13.setEnabled(false);
                    move_number();}
                else if(button13.getText().equals("X")&&button14.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button9.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button12.getText().equals("X")&&button9.getText().equals("")) {
                    button9.setText("O");
                    button9.setEnabled(false);
                    move_number();}
                else if(button9.getText().equals("X")&&button12.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button11.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button14.getText().equals("X")&&button11.getText().equals("")) {
                    button11.setText("O");
                    button11.setEnabled(false);
                    move_number();}
                else if(button11.getText().equals("X")&&button14.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button7.getText().equals("X")&&button11.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button7.getText().equals("X")&&button9.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button9.getText().equals("X")&&button13.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button11.getText().equals("X")&&button13.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
            }

              if (textView3.getText().equals("5")) {
                if(button10.getText().equals("X")&&button6.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button7.getText().equals("X")&&button13.getText().equals("")) {
                    button13.setText("O");
                    button13.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button8.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button9.getText().equals("X")&&button11.getText().equals("")) {
                    button11.setText("O");
                    button11.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button11.getText().equals("X")&&button9.getText().equals("")) {
                    button9.setText("O");
                    button9.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button12.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button13.getText().equals("X")&&button7.getText().equals("")) {
                    button7.setText("O");
                    button7.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button14.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button7.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button8.getText().equals("X")&&button7.getText().equals("")) {
                    button7.setText("O");
                    button7.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button7.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("X")&&button13.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("X")&&button14.getText().equals("X")&&button13.getText().equals("")) {
                    button13.setText("O");
                    button13.setEnabled(false);
                    move_number();}
                else if(button13.getText().equals("X")&&button14.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button9.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button12.getText().equals("X")&&button9.getText().equals("")) {
                    button9.setText("O");
                    button9.setEnabled(false);
                    move_number();}
                else if(button9.getText().equals("X")&&button12.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button11.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button14.getText().equals("X")&&button11.getText().equals("")) {
                    button11.setText("O");
                    button11.setEnabled(false);
                    move_number();}
                else if(button11.getText().equals("X")&&button14.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button12.getText().equals("X")&&button11.getText().equals("X")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button8.getText().equals("X")&&button13.getText().equals("X")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button14.getText().equals("X")&&button9.getText().equals("X")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("X")&&button14.getText().equals("X")&&button7.getText().equals("X")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                  else {Random random =new Random();
                int a;
                a=random.nextInt(9);
                    if (a==0&&button6.getText().equals("")){button6.setText("O");
                        button6.setEnabled(false);
                        move_number();}
                    else if (a==1&&button7.getText().equals("")){button7.setText("O");
                        button7.setEnabled(false);
                        move_number();}
                    else if (a==2&&button8.getText().equals("")){button8.setText("O");
                        button8.setEnabled(false);
                        move_number();}
                    else if (a==3&&button9.getText().equals("")){button9.setText("O");
                        button9.setEnabled(false);
                        move_number();}
                    else if (a==4&&button10.getText().equals("")){button10.setText("O");
                        button10.setEnabled(false);
                        move_number();}
                    else if (a==5&&button11.getText().equals("")){button11.setText("O");
                        button11.setEnabled(false);
                        move_number();}
                    else if (a==6&&button12.getText().equals("")){button12.setText("O");
                        button12.setEnabled(false);
                        move_number();}
                    else if (a==7&&button13.getText().equals("")){button13.setText("O");
                        button13.setEnabled(false);
                        move_number();}
                    else if (a==8&&button14.getText().equals("")){button14.setText("O");
                        button14.setEnabled(false);
                        move_number();}
                }
              }

            if (textView3.getText().equals("7")) {
                if(button10.getText().equals("X")&&button6.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button7.getText().equals("X")&&button13.getText().equals("")) {
                    button13.setText("O");
                    button13.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button8.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button9.getText().equals("X")&&button11.getText().equals("")) {
                    button11.setText("O");
                    button11.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button11.getText().equals("X")&&button9.getText().equals("")) {
                    button9.setText("O");
                    button9.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button12.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button13.getText().equals("X")&&button7.getText().equals("")) {
                    button7.setText("O");
                    button7.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("X")&&button14.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button7.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button8.getText().equals("X")&&button7.getText().equals("")) {
                    button7.setText("O");
                    button7.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button7.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("X")&&button13.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("X")&&button14.getText().equals("X")&&button13.getText().equals("")) {
                    button13.setText("O");
                    button13.setEnabled(false);
                    move_number();}
                else if(button13.getText().equals("X")&&button14.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button9.getText().equals("X")&&button12.getText().equals("")) {
                    button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("X")&&button12.getText().equals("X")&&button9.getText().equals("")) {
                    button9.setText("O");
                    button9.setEnabled(false);
                    move_number();}
                else if(button9.getText().equals("X")&&button12.getText().equals("X")&&button6.getText().equals("")) {
                    button6.setText("O");
                    button6.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button11.getText().equals("X")&&button14.getText().equals("")) {
                    button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("X")&&button14.getText().equals("X")&&button11.getText().equals("")) {
                    button11.setText("O");
                    button11.setEnabled(false);
                    move_number();}
                else if(button11.getText().equals("X")&&button14.getText().equals("X")&&button8.getText().equals("")) {
                    button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button6.getText().equals("")){button6.setText("O");
                        button6.setEnabled(false);
                        move_number();}
                else if(button7.getText().equals("")){button7.setText("O");
                    button7.setEnabled(false);
                    move_number();}
                else if(button8.getText().equals("")){button8.setText("O");
                    button8.setEnabled(false);
                    move_number();}
                else if(button9.getText().equals("")){button9.setText("O");
                    button9.setEnabled(false);
                    move_number();}
                else if(button10.getText().equals("")){button10.setText("O");
                    button10.setEnabled(false);
                    move_number();}
                else if(button11.getText().equals("")){button11.setText("O");
                    button11.setEnabled(false);
                    move_number();}
                else if(button12.getText().equals("")){button12.setText("O");
                    button12.setEnabled(false);
                    move_number();}
                else if(button13.getText().equals("")){button13.setText("O");
                    button13.setEnabled(false);
                    move_number();}
                else if(button14.getText().equals("")){button14.setText("O");
                    button14.setEnabled(false);
                    move_number();}
            }

            }
            }
                }