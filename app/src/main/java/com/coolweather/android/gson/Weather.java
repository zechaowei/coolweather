package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * ClassName: Weather
 * Package: com.coolweather.android.gson
 * Description:
 *
 * @Author: Mr.zechaowei
 * @Create: 2024/12/11 - 15:19
 * @Version: v1.0
 */
public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
