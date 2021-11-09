package com.example.laboratory4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int costPerTicket = 200;
    int numberOfTickets;
    int totalCost;
    String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ticket = (EditText) findViewById(R.id.tickets);
        Spinner group = (Spinner) findViewById(R.id.spinner);
        TextView result = (TextView) findViewById(R.id.result);

        Button cost = (Button) findViewById(R.id.findcost);
        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numberOfTickets = Integer.parseInt(ticket.getText().toString());
                totalCost = costPerTicket * numberOfTickets;
                groupChoice = group.getSelectedItem().toString();
                result.setText("Cost of fare " + groupChoice + " is " + totalCost + " pesos.");


            }
        });

    }

}