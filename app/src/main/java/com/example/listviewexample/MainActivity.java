package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Todo reference listview
    //  Todo       ListView listView = findViewById();
    // Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
        //Todo  add custom adapter to listview
        //Todo listView.setAdapter(------);
        ListView listView = findViewById(R.id.listview);
        ArrayAdapter<Player> MyAdapter = new ArrayAdapter<Player>(this, R.layout.activity_main,getPlayers());
        listView.setAdapter(MyAdapter);
    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    // choose successful sportsmen from different sports, make sure to fill Player class before starting
    public List<Player> getPlayers(){
        ArrayList<Player> list = new ArrayList<Player>();
        for(int i = 0;i<15;i++){
            list.add(new Player("asdf",1,1.0,"sex",i));
        }
        return list;
    }

}
