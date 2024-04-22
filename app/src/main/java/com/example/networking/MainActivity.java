package com.example.networking;

import android.os.Bundle;
import android.util.Log;



import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "HTTPS_URL_TO_JSON_DATA_CHANGE_THIS_URL";
    private final String JSON_FILE = "mountains.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonFile(this, this).execute(JSON_FILE);
/*
        recyclerView = findViewById(R.id.recycler_view); // Make sure you have a RecyclerView with this ID in your layout
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<RecyclerViewItem> items = new ArrayList<>(Arrays.asList(
                new RecyclerViewItem("Matterhorn"),
                new RecyclerViewItem("Mont Blanc"),
                new RecyclerViewItem("Denali")
    }
*/

    }
    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
    }


/*
    RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, items, new RecyclerViewAdapter.OnClickListener() {
        @Override
        public void onClick(RecyclerViewItem item) {
            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }
    });
*/


}

