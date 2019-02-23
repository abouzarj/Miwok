package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family members
        TextView family_members = (TextView) findViewById(R.id.family);

        //Set a click listener on that View
        family_members.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the family members View is clicked on.
            @Override
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the colors
        TextView colors = (TextView) findViewById(R.id.colors);

        //Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view){
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the phrases
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view){
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }

}