package com.example.phntasktwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int[] birds={R.drawable.egle,R.drawable.flmingo,R.drawable.greycrownedcranes,R.drawable.hummingbird
    ,R.drawable.kingfisher,R.drawable.owl,R.drawable.parrot,R.drawable.peacock,R.drawable.swan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.customList);

        custumBaseAdapter custumBaseAdapter=new custumBaseAdapter(getApplicationContext(),birds);
        listView.setAdapter(custumBaseAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,secondView.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });
    }
}