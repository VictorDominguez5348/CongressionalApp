package com.example.environmentsaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fourthLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_level);

        Button nextPage = (Button) findViewById(R.id.nextLevel4); //find the button by its assigned id

//Make the button do something:
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(fourthLevel.this,
                        endScreen.class);
                startActivity(myIntent);

            }
        });//end of click listener

    }
    public void Toast (View view)
    {
        if (view.getId() == R.id.button29842)
        {

            Toast.makeText(this, "Good job on saving water", Toast.LENGTH_SHORT).show();
        }

        if (view.getId() == R.id.button233044)
        {

            Toast.makeText(this, "Water is a valuable resource please take care of it and remember to conserve water", Toast.LENGTH_SHORT).show();
        }


    }
}
