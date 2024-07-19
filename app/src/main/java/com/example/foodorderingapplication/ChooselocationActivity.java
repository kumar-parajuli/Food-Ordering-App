package com.example.foodorderingapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChooselocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chooselocation);

       //Creatig the location list
        String[] locationList ={"x","y","z"};

        //create the adapter
        ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,locationList);

        //Bind the AutoCompletetextview and set the adpter
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.listoflocation);
        autoCompleteTextView.setAdapter(adapter);




        // Set window insets listener
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}