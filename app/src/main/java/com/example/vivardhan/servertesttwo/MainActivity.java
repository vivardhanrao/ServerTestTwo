package com.example.vivardhan.servertesttwo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.app.Activity;
import android.view.Menu;
import android.view.View;


public class MainActivity extends AppCompatActivity{

    private EditText usernameField,passwordField;
    private TextView status,role,method;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameField = (EditText)findViewById(R.id.editText1);
        passwordField = (EditText)findViewById(R.id.editText2);

        status = (TextView)findViewById(R.id.textView6);
        role = (TextView)findViewById(R.id.textView7);
        method = (TextView)findViewById(R.id.textView9);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /*button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            new SigninActivity(this,textView,0); //.execute(username,password)
        }
    });*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void login(View view){
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        method.setText("Get Method");
        new SigninActivity(this,status,role,0).execute(username,password);

    }

    public void loginPost(View view){
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        method.setText("Post Method");
        new SigninActivity(this,status,role,1).execute(username,password);
    }



    /*public void login(View view){
        new SigninActivity(this,textView,0); //.execute(username,password)
    }*/

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
