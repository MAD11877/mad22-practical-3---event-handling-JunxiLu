package sg.edu.np.mad.junxiprac2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
        int randomnumber = i.getIntExtra("number", 1739039545);

        TextView namezz = findViewById(R.id.nameTxt);
        namezz.setText("MAD " + randomnumber);



    user student1 = new user("Junxi Lu",
                "Second year IT student at Ngee Ann Polytechnic",
                10219098,
                false);

        TextView nameTxt = findViewById(R.id.nameTxt);
        nameTxt.setText(student1.name);

        TextView descTxt = findViewById(R.id.descTxt);
        descTxt.setText(student1.description);

        Button followBtn = findViewById(R.id.followBtn);
        if (student1.followed){
            followBtn.setText(R.string.unfollow);
        } else {
            followBtn.setText(R.string.follow);
        }

        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button followBtn = findViewById(R.id.followBtn);
                if (student1.followed){
                    followBtn.setText(R.string.follow);
                    Toast.makeText(getApplicationContext(),"Unfollowed",Toast.LENGTH_SHORT).show();
                } else {
                    followBtn.setText(R.string.unfollow);
                    Toast.makeText(getApplicationContext(),"Followed",Toast.LENGTH_SHORT).show();
                }

                //Update followed status accordingly
                student1.followed = !student1.followed;
            }
        });
    }
}