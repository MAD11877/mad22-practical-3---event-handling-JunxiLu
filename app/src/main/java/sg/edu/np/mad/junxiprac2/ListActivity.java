package sg.edu.np.mad.junxiprac2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageView;


import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView alert = findViewById(R.id.ImageView2);
        alert.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);
            builder.setTitle("Profile");
            builder.setMessage("MADness");
            builder.setPositiveButton("View", (dialogInterface, i) -> {
                Random random = new Random();
                int randomNumber = random.nextInt(1739039545);
                Intent intent = new Intent(ListActivity.this, MainActivity.class);

                intent.putExtra("number", randomNumber);
                startActivity(intent);
            });
            builder.setNegativeButton("Close", (dialogInterface, i) -> finish());
            builder.show();

        });
    }
}