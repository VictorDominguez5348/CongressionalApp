package com.example.environmentsaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class secondLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_level);


        Button nextPage = (Button) findViewById(R.id.nextLevel2); //find the button by its assigned id

//Make the button do something:
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(secondLevel.this,
                        thirdLevel.class);
                startActivity(myIntent);

            }
        });//end of click listener
    }

    public void Toast (View view)
    {
        if (view.getId() == R.id.button22)
        {

            Toast.makeText(this, "Please don't use plastic bags, they end up in the ocean and are bad for sea life.", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == R.id.button23344)
        {

            Toast.makeText(this, "Good job on reducing your plastic consumption", Toast.LENGTH_SHORT).show();
        }


    }
}


