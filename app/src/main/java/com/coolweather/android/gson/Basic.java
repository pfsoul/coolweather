package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15pr on 2017/7/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherid;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String upDateTime;
    }
}
