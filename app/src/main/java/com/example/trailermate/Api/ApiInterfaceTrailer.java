package com.example.trailermate.Api;

import com.example.trailermate.ModelsTrailer.TrendingMovieModel;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterfaceTrailer {

    @GET("/3/trending/movie/day")
    Call<TrendingMovieModel>  fetchtrendingmovies(@Query("api_key") String api_key);

    @GET("/3/trending/tv/day")
    Call<TrendingMovieModel>  fetchtrendingtv(@Query("api_key") String api_key);


    @GET("/3/movie/upcoming")
    Call<TrendingMovieModel>  fetchtupcomingmovies(@Query("api_key") String api_key);

    @GET("3/movie/popular")
    Call<TrendingMovieModel>  fetchpopularmovies(@Query("api_key") String api_key);


    @GET("/3/movie/top_rated")
    Call<TrendingMovieModel>  fetchtopratedmovies(@Query("api_key") String api_key);

    @GET("/3/discover/movie")
    Call<TrendingMovieModel>  fetchtdiscovermovies(@Query("api_key") String api_key);

    @GET("3/search/movie")
    Call<TrendingMovieModel>  fetchsearchedmovies(@Query("api_key") String api_key,@Query("query") String search);


}
