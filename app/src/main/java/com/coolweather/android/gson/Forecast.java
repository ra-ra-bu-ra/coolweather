package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Date: 2019/8/1
 * Time: 下午 4:04
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
