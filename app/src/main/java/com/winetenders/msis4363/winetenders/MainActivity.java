package com.winetenders.msis4363.winetenders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Testing the dropdown spinner with fake data
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.wines_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        // Testing the dropdown spinner with fake data
        Spinner priceSpinner = (Spinner) findViewById(R.id.priceSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> priceAdapter = ArrayAdapter.createFromResource(this,
                R.array.price_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        priceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        priceSpinner.setAdapter(priceAdapter);

        // Testing the dropdown spinner with fake data
        Spinner sweetnessSpinner = (Spinner) findViewById(R.id.sweetnesSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> sweetnessAdapter = ArrayAdapter.createFromResource(this,
                R.array.sweetness_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        sweetnessAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        sweetnessSpinner.setAdapter(sweetnessAdapter);

        // Testing the dropdown spinner with fake data
        Spinner acidicSpinner = (Spinner) findViewById(R.id.aciditySpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> acidicAdapter = ArrayAdapter.createFromResource(this,
                R.array.acidity_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        acidicAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        acidicSpinner.setAdapter(acidicAdapter);

        // Testing the dropdown spinner with fake data
        Spinner bitternessSpinner = (Spinner) findViewById(R.id.bitternessSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> bitternessAdapter = ArrayAdapter.createFromResource(this,
                R.array.bitterness_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        bitternessAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        bitternessSpinner.setAdapter(bitternessAdapter);

    }

}
