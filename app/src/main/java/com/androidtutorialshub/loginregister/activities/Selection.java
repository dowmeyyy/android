package com.androidtutorialshub.loginregister.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.androidtutorialshub.loginregister.R;

public class Selection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }
    public void onButtonClick(View v)
    {
        if (v.getId() == R.id.prof){

                Intent i;
            i = new Intent(Selection.this, RegisterActivity.class);
            startActivity(i);

        }
        if (v.getId() == R.id.stud){
            Intent ii = new Intent(Selection.this, RegisterActivity.class);

            startActivity(ii);
        }
    }
}
