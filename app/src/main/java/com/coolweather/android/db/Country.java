package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 15pr on 2017/7/14.
 * countryName 县的名字
 * weatherId 对应天气的ID
 * cityId 所属市的名字
 */

public class Country extends DataSupport {
    private int Id;

    private String countryName;

    private String weatherId;

    private int cityCode;

    public int getId() {
        return Id;
    }

    public String getCountryName() {
        return countryName;
    }



    public int getCityCode() {
        return cityCode;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeaherId() {
        return weatherId;
    }

    public void setWeaherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
}
