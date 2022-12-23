package com.geektech.marvel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    ArrayList<MovieModel> moviesList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView moviesRecyclerView = findViewById(R.id.recycler_view);
        loadData();
        MovieAdapter adapter = new MovieAdapter(moviesList, this);
        moviesRecyclerView.setAdapter(adapter);
    }

    private void loadData() {
        moviesList.add(new MovieModel(R.drawable.img1, "Doctor Strange", "Movie", "8.6"));
        moviesList.add(new MovieModel(R.drawable.img3, "Spiderman", "Movie", "6.9"));
        moviesList.add(new MovieModel(R.drawable.img4, "Captain America", "Movie", "7.7"));
        moviesList.add(new MovieModel(R.drawable.img5, "Iron Man", "Movie", "8.7"));
        moviesList.add(new MovieModel(R.drawable.img6, "Black Panther", "Movie", "7.4"));
        moviesList.add(new MovieModel(R.drawable.img1, "Doctor Strange", "Movie", "8.6"));
        moviesList.add(new MovieModel(R.drawable.img2, "Avengers", "Movie", "6.9"));
        moviesList.add(new MovieModel(R.drawable.img4, "Captain America", "Movie", "7.7"));
        moviesList.add(new MovieModel(R.drawable.img5, "Iron Man", "Movie", "8.7"));
        moviesList.add(new MovieModel(R.drawable.img6, "Black Panther", "Movie", "7.4"));
    }

    @Override
    public void onItemClick(MovieModel movieModel) {
        Intent intent = new Intent(MainActivity.this, DescriptionActivity.class);
        intent.putExtra("image", movieModel.image);
        intent.putExtra("title", movieModel.title);
        intent.putExtra("desc", movieModel.description);
        startActivity(intent);

    }
}