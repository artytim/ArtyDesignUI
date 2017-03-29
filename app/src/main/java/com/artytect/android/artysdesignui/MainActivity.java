package com.artytect.android.artysdesignui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView productText = (TextView) findViewById(R.id.product_name);
        String productName =
                String.format(getString(R.string.delicious_pie), "Apple");
        productText.setText(productName);
    }
}
