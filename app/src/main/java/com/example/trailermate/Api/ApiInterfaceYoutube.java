package com.example.trailermate.Api;

import com.example.trailermate.ModelsTrailer.TrendingMovieModel;
import com.example.trailermate.ModelsTrailer.YoutubeMainModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterfaceYoutube {

    @GET("/youtube/v3/search")
    Call<YoutubeMainModel> fetchYouTubeId(@Query("key") String api_key, @Query("q") String search);
}
