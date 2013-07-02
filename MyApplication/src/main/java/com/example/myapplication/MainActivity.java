package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.task.ScrapeTask;

public class MainActivity extends Activity {

    private TextView resultsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultsText = (TextView) findViewById(R.id.resultsText);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void fetchData(View view) {
        String url = "http://www.racq.com.au";
        ScrapeTask task = new ScrapeTask(this);
        resultsText.setText("");
        task.execute(url);

    }

    public void placeResults(String results) {
        resultsText.setText(results);
    }


    
}
