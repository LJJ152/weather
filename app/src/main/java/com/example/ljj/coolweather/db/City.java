package com.example.ljj.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 39716 on 2017/3/11.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getProvinceName() {
        return cityName;
    }

    public void setProvinceName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setProvinceCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(int ProvinceId){
        this.provinceId=provinceId;
    }
}
