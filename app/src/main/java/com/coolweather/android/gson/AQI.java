package com.coolweather.android.gson;

/**
 * Created by 15pr on 2017/7/16.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
