package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * ClassName: Province
 * Package: com.coolweather.android.db
 * Description:
 *
 * @Author: Mr.zechaowei
 * @Create: 2024/12/10 - 21:06
 * @Version: v1.0
 */
public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
