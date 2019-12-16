package com.example.environmentsaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class thirdLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_level);

        Button nextPage = (Button) findViewById(R.id.nextLevel3); //find the button by its assigned id

//Make the button do something:
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(thirdLevel.this,
                        fourthLevel.class);
                startActivity(myIntent);

            }
        });//end of click listener
    }

    public void Toast (View view)
    {
        if (view.getId() == R.id.button2982)
        {

            Toast.makeText(this, "Never throw trash through a window, this will ensure that it will not be properly disposed of.", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == R.id.button23344)
        {

            Toast.makeText(this, "Good job, remember that trash contaminates the enviroment.", Toast.LENGTH_SHORT).show();
        }


    }
}
