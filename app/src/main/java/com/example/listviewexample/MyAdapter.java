package com.example.listviewexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Player> {
    List<Player> listOfPlayers;
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Player> objects) {
        super(context, resource, objects);
        listOfPlayers = objects;
    }

    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent, final Context context) {
        View single_item_view = convertView;
        //Using this inflated view, we can get the access to the various UI widgets present in the row item XML file.
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (single_item_view == null)
            single_item_view = inflater.inflate(R.layout.single_item, null);
        //Todo get single player using position and listOfPlayers
        final Player player = listOfPlayers.get(position);

        TextView textView1 = single_item_view.findViewById(R.id.textView1);
        TextView textView2 = single_item_view.findViewById(R.id.textView2);
        TextView textView3 = single_item_view.findViewById(R.id.textView3);
        TextView textView4 = single_item_view.findViewById(R.id.textView4);
        final ImageView imageView = single_item_view.findViewById(R.id.imageView);
        textView1.setText(player.getName());
        textView2.setText("Age: " + player.getAge());
        textView3.setText(player.getMainSport());
        textView4.setText("Worth: " + player.getWorth());
        imageView.setImageResource(player.getImageResource());

        //Opens ImageViewerActivity onClick listener.
        imageView.setClickable(true);
        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if (context instanceof MainActivity)
                {
                    ((MainActivity) context).startImageViewerActivity(player.getImageResource());
                }
            }
        });

        return  single_item_view;
    }
}
