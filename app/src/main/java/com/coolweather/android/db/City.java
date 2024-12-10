package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * ClassName: City
 * Package: com.coolweather.android.db
 * Description:
 *
 * @Author: Mr.zechaowei
 * @Create: 2024/12/10 - 21:09
 * @Version: v1.0
 */
public class City extends LitePalSupport {
    private int id;
    private String cityName;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
