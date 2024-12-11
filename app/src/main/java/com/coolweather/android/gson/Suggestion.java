package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * ClassName: Suggestion
 * Package: com.coolweather.android.gson
 * Description:
 *
 * @Author: Mr.zechaowei
 * @Create: 2024/12/11 - 14:35
 * @Version: v1.0
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

}
