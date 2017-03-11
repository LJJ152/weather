package com.example.ljj.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 39716 on 2017/3/11.
 */

public class County extends DataSupport {
    private int id;
    private String countryName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setProvinceName(String countryName) {
        this.countryName = countryName;
    }

    public String getWatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}
