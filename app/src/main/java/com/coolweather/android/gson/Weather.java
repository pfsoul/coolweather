package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 15pr on 2017/7/16.
 */

public class Weather {
    public String status;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    public Basic basic;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
