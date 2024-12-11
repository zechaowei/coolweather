package com.coolweather.android.gson;

/**
 * ClassName: AQI
 * Package: com.coolweather.android.gson
 * Description:
 *
 * @Author: Mr.zechaowei
 * @Create: 2024/12/11 - 14:33
 * @Version: v1.0
 */
public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
