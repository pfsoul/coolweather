package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 15pr on 2017/7/14.
 * countyName 县的名字
 * weatherId 对应天气的ID
 * cityId 所属市的名字
 */

public class County extends DataSupport {
    private int Id;

    private String countyName;

    private String weatherId;

    private int cityId;

    public int getId() {
        return Id;
    }

    public String getCountyName() {
        return countyName;
    }



    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
