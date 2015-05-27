package com.example.experiment.myappportfollo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends Activity {
    Button button, button2, button3, button4, button5, button6, button7;
    RelativeLayout layout;
    Toast toast, toast2, toast3, toast4, toast5, toast6, toast7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (RelativeLayout) findViewById(R.id.layout);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                toast = Toast.makeText(getApplicationContext(),
                        "The Cat app", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                toast2 = Toast.makeText(getApplicationContext(),
                        "Thing1 app", Toast.LENGTH_LONG);
                toast2.setGravity(Gravity.CENTER, 0, 0);
                toast2.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                toast3 = Toast.makeText(getApplicationContext(),
                        "Thing2 app", Toast.LENGTH_LONG);
                toast3.setGravity(Gravity.CENTER, 0, 0);
                toast3.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                toast4 = Toast.makeText(getApplicationContext(),
                        "Thingamajigger app", Toast.LENGTH_LONG);
                toast4.setGravity(Gravity.CENTER, 0, 0);
                toast4.show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                toast5 = Toast.makeText(getApplicationContext(),
                        "Sally app", Toast.LENGTH_LONG);
                toast5.setGravity(Gravity.CENTER, 0, 0);
                toast5.show();
            }
        });
        button6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                toast6 = Toast.makeText(getApplicationContext(),
                        "Nick app", Toast.LENGTH_LONG);
                toast6.setGravity(Gravity.CENTER, 0, 0);
                toast6.show();
            }
        });
        button7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                toast7 = Toast.makeText(getApplicationContext(),
                        "Dr.Seuss app", Toast.LENGTH_LONG);
                toast7.setGravity(Gravity.CENTER, 0, 0);
                toast7.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
