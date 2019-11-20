package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewerActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewer);

        Intent intent = getIntent();
        int imageResource = intent.getIntExtra("image", R.drawable.team_man_placeholder);
        ImageView imageView = findViewById(R.id.imageView);

        imageView.setImageResource(imageResource);
    }
}
