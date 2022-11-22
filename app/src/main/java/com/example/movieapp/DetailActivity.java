package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private TextView tvMovieTitle, tvMovieGenre, tvMovieDescription;
    private ImageView ivMoviePoster;
    private MoviesData currentMovie;
    private ArrayList<Movie> listMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        listMovies.addAll(MoviesData.getMovies());

        tvMovieTitle = findViewById(R.id.tv_movie_title_single);
        tvMovieGenre = findViewById(R.id.tv_movie_genre);
        tvMovieDescription = findViewById(R.id.tv_movie_description_single);
        ivMoviePoster = findViewById(R.id.iv_movie_poster_single);

        tvMovieTitle.setText(getIntent().getExtras().getString("title"));
        tvMovieGenre.setText(getIntent().getExtras().getString("genre"));
        tvMovieDescription.setText(getIntent().getExtras().getString("description"));
        ivMoviePoster.setImageResource(getIntent().getExtras().getInt("image"));

    }
}