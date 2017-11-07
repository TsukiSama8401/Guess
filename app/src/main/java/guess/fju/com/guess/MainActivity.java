package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guess(){
       // int random = (int)(Math.random()*10+1);
        int random = 5;
        if (R.id.editText - random > 0){
            new AlertDialog.Builder(this)
            .setMessage("小一點")
                    .show();
            }else if(R.id.editText - random < 0){
            new AlertDialog.Builder(this)
            .setMessage("大一點")
                    .show();
            }  else if(R.id.editText - random == 0){
            new AlertDialog.Builder(this)
            .setMessage("答對了")
                    .show();
        }
        }
    }
