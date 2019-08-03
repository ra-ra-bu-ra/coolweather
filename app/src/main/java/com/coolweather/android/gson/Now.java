package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Date: 2019/8/1
 * Time: 下午 3:54
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
