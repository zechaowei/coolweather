package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * ClassName: County
 * Package: com.coolweather.android.db
 * Description:
 *
 * @Author: Mr.zechaowei
 * @Create: 2024/12/10 - 21:10
 * @Version: v1.0
 */
public class County extends LitePalSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
