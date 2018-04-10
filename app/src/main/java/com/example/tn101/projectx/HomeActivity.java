package com.example.tn101.projectx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
/**
 * Created by TN101 on 09-04-2018.
 */

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClickPlan (View view)
    {
        if (view.getId() == R.id.book)
        {
            Intent a =new Intent(HomeActivity.this, IntrestActivity.class);
            startActivity(a);
        }
    }

    public void onClickComp (View view)
    {
        if (view.getId() == R.id.complete)
        {
            Intent a =new Intent(HomeActivity.this, IntrestActivity.class);
            startActivity(a);
        }
    }
}
