package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * ClassName: Basic
 * Package: com.coolweather.android.gson
 * Description:
 *
 * @Author: Mr.zechaowei
 * @Create: 2024/12/11 - 14:31
 * @Version: v1.0
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
