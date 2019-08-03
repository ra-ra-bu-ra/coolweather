package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Date: 2019/8/1
 * Time: 下午 3:48
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }


}
