package com.example.environmentsaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class firstLevel extends AppCompatActivity
{

    Button next_level1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_level);




        Button nextPage = (Button) findViewById(R.id.nextLevel); //find the button by its assigned id

//Make the button do something:
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(firstLevel.this,
                        secondLevel.class);
                startActivity(myIntent);

            }
        });//end of click listener


    }


    public void Toast (View view)
    {
        if (view.getId() == R.id.button)
        {

            Toast.makeText(this, "Please don't throw plastic bottles in the trash.", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == R.id.button2)
        {

            Toast.makeText(this, "Good job on disposing plastic properly", Toast.LENGTH_SHORT).show();
        }


    }
}