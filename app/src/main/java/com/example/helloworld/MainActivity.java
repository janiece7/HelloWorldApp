package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));
        // User can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the  text color of the label
                ((TextView)findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the background color
                //#ffbbfe - pink
                findViewById(R.id.parent).setBackgroundColor( getResources().getColor(R.color.lightpink));
            }
        });
        // User can tap a button to change the text string of the label - Android is Awesome!
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text in string
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //User can tap on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 1. Reset the text to " Hello from Janiece " id-text
                textView.setText("Hello from Janiece!");

                // 2. Reset the color of the text to its original color
                textView.setTextColor(getResources().getColor(R.color.purple_200));
                //  Og Text Color - @color/purple_200 - dark purple


                // 3. Reset the background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_purple));
                // Og Background color - #bcbbff - light purple


            }

        });
        //User can tap the “Change text string” button to update the label with the text from the text field.
        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // change the text view to what's in the edit text view
                String userEnteredText = ((EditText)findViewById(R.id.editText)).getText().toString();

                //If the text field is empty, update label with default text string
                if(userEnteredText.isEmpty()){
                    textView.setText("Enter your own text!");
                }else{
                    textView.setText(userEnteredText);
                }
            }
        });

    }
}