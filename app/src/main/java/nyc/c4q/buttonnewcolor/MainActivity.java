package nyc.c4q.buttonnewcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener {

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.colorchanger);

        button.setOnClickListener(new View.OnClickListener() {  //Anonymous implementation of that interface
            @Override
            public void onClick(View view) {  //This is good because it is a little bit of code

                RelativeLayout relativeLayout = findViewById(R.id.rootlayout);  //RelativeLayout is a class like any other

                relativeLayout.setBackgroundColor(Color.CYAN);

            }
        });

    }

//Another option
//    @Override
//    public void onClick(View view) {
//
//        RelativeLayout relativeLayout = findViewById(R.id.rootlayout);  //RelativeLayout is a class like any other
//
//        relativeLayout.setBackgroundColor(Color.CYAN);
//
//    }
}