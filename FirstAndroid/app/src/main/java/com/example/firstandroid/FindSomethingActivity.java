package com.example.firstandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindSomethingActivity extends AppCompatActivity {
    private EmiExpert expert = new EmiExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_something);
    }

    public void onClickFindSomething(View view) {
        // Ref to TextView
        TextView brands = findViewById(R.id.brands);
        // Ref to spinner
        Spinner spinner = findViewById(R.id.spinner);
        // Extract value of spinner item
        String typeSelected = String.valueOf(spinner.getSelectedItem());
        // Displays what ever has been selected
        //brands.setText(typeSelected);


        // for list of recommendation instead of single selection
        List<String> brandsList = expert.getBrands(typeSelected);
        StringBuilder brandsFormattedList = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormattedList.append(brand).append('\n');
        }

        brands.setText(brandsFormattedList);
    }
}
