package com.fred.apple.bean;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * @author Fred Liu (liuxiaokun0410@gmail.com)
 * @version 5.0
 * @since 2015/11/20 14:49
 */
@DatabaseTable(tableName = "province")
public class Province implements Serializable {

    @DatabaseField(id = true, canBeNull = false, columnName = "province_id")
    private Integer provinceId;

    @DatabaseField(columnName = "province_name", canBeNull = false)
    private String provinceName;

    @DatabaseField(columnName = "enable", canBeNull = false, defaultValue = "1")
    private Integer enable;

    public Province() {
        // ORMLite needs a no-arg constructor
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}
