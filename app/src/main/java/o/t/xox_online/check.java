package o.t.xox_online;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import o.t.xox_online.Main2Activity;
/**
 * Created by User on 20.01.2017.
 */

public class check extends Main2Activity {

    int move_number(int number){
        int a=0;
        Random random = new Random();
        a= random.nextInt(number);
        return a;
    }
}
