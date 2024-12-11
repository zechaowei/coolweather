package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * ClassName: Now
 * Package: com.coolweather.android.gson
 * Description:
 *
 * @Author: Mr.zechaowei
 * @Create: 2024/12/11 - 14:34
 * @Version: v1.0
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
