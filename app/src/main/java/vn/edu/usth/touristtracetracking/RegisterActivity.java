package vn.edu.usth.touristtracetracking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    TextView txbyTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        constraintLayout = findViewById(R.id.Signup_constraint_layout);
        Button btSignup = (Button)findViewById(R.id.bt_Signup);
        btSignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });







        // change view by time of a day
        txbyTime = findViewById(R.id.txbyTime);
        Calendar c = Calendar.getInstance();
        int timeofDay = c.get(Calendar.HOUR_OF_DAY);
        if(timeofDay >=0 && timeofDay <12){
            //moring
            constraintLayout.setBackground(getDrawable(R.drawable.good_morning_img));
            txbyTime.setText("Good Morning");
        }
        else if(timeofDay>=12 && timeofDay<16){
            //afternoon
            constraintLayout.setBackground(getDrawable(R.drawable.good_morning_img));
            txbyTime.setText("Good Afternoon");
        }
        else if(timeofDay>=16 && timeofDay<21){
            //evening
            constraintLayout.setBackground(getDrawable(R.drawable.good_night_img));
            txbyTime.setText("Good Evening");
        }
        else if(timeofDay>=16 && timeofDay<24){
            //night
            constraintLayout.setBackground(getDrawable(R.drawable.good_night_img));
            txbyTime.setText("Good Night");
        }
    }

}
