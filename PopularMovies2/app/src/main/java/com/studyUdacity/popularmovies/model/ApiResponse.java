package com.studyUdacity.popularmovies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse<T> {
    @SerializedName("results")
    public List<T> results;
}