package com.example.amst2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Vector;

public class VideoActivity extends AppCompatActivity {
    RecyclerView recyclerView;
<<<<<<< HEAD
    Vector<YouTubeVideos> youtubeVideos = new Vector<YouTubeVideos>();
=======
    Vector<YouTubeVideos> youtubeVideos = new Vector<>();
>>>>>>> ab273cf (Nuevos cambios en las dependencias)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

<<<<<<< HEAD
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
=======
        recyclerView = findViewById(R.id.recyclerView);
>>>>>>> ab273cf (Nuevos cambios en las dependencias)
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/f64qAe422uU\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kDuNGhAM7uk\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/VXpF07vbfVk\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kxjdbVh8x2k\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/7p-0Afoy3xI\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);
    }
}