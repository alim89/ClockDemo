package com.example.a20140550.clockdemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
private TextClock tc;
    private AnalogClock an;
    private Button exitbtn;
    private AlertDialog.Builder AlertD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        an= (AnalogClock) findViewById(R.id.Anaid);
        tc= (TextClock) findViewById(R.id.digitalid);
        exitbtn= (Button) findViewById(R.id.btnID);
        an.setOnClickListener(this);
        tc.setOnClickListener(this);
        exitbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
if(v.getId()==R.id.Anaid)
{
    Toast.makeText(MainActivity.this,"Analog Clock",Toast.LENGTH_SHORT).show();
}if(v.getId()==R.id.digitalid)
{
    Toast.makeText(MainActivity.this,"Digital Clock",Toast.LENGTH_SHORT).show();
}

AlertD=new AlertDialog.Builder(MainActivity.this);
        //for set title
AlertD.setTitle(R.string.alert);
        // for message
        AlertD.setMessage(R.string.message);
        AlertD.setIcon(R.drawable.alerti);
AlertD.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        finish();
    }
});
        AlertD.setNegativeButton("No", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialog, int which) {
        Toast.makeText(MainActivity.this,"You Have clicked No Button",Toast.LENGTH_SHORT).show();
    }
});

        AlertD.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You have clicked Cancel Button",Toast.LENGTH_SHORT).show();
            }
        });

AlertDialog alt=AlertD.create();
        alt.show();

    }
}
