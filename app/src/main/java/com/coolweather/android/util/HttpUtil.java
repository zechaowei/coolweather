package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * ClassName: HttpUtil
 * Package: com.coolweather.android.util
 * Description:
 *
 * @Author: Mr.zechaowei
 * @Create: 2024/12/10 - 21:33
 * @Version: v1.0
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
