package com.androidtutorialshub.loginregister.activities;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    private DrawerLayout mDrawerLayoutSt;
    private ActionBarDrawerToggle mToggleSt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayoutSt = (DrawerLayout) findViewById(R.id.drawerstudent);
        mToggleSt = new ActionBarDrawerToggle(this, mDrawerLayoutSt, R.string.open, R.string.close);
        mDrawerLayoutSt.addDrawerListener(mToggleSt);
        mToggleSt.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (mToggleSt.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);    }
}
