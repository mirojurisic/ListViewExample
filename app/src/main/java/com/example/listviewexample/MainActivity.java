package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        List<Player> list= getPlayers();
        //Todo reference listview
        // Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
        MyAdapter adapter=new MyAdapter(this,R.id.listview,list);
        listView.setAdapter(adapter);


    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    public List<Player> getPlayers(ArrayList<Player> list)
    {
        list.add(new Player("Lionel Messi",32,44224400.00,"football",R.drawable.mesi));
        list.add(new Player("David Robert Joseph Beckham",44,1291800.00,"football",R.drawable.beckham));
        list.add(new Player("Hanyu Yuzulu",24,500000,"figure skating",R.drawable.hanyu));
        list.add(new Player("Zhang Jike",31,500000,"Ping-pong",R.drawable.zhang));
//        list.add(new Player("Lin Dan",))

    }
    // choose successful sportsmen from different sports, make sure to fill Player class before starting


    public List getPlayers()
    {
        List<Player> list = Arrays.asList(new Player[]{
                new Player("Doris", 16, 100000, "Basketball", R.drawable.member_placeholder_female),
                new Player("LeBron James", 34, 40000000, "Basketball", R.drawable.team_man_placeholder),
                new Player("Kevin Durant", 31, 30000000, "Basketball", R.drawable.team_man_placeholder),
                new Player("Kyrie Irving", 27, 20100000, "Basketball", R.drawable.team_man_placeholder),
                new Player("James Harden", 30, 28300000, "Basketball", R.drawable.team_man_placeholder),
                new Player("Stephen Curry", 31, 37460000, "Basketball", R.drawable.team_man_placeholder)
        });
        return list;
    }
}
