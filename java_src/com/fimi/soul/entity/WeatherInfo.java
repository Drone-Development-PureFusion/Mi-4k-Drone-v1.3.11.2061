package com.fimi.soul.entity;

import java.io.Serializable;
/* loaded from: classes.dex */
public class WeatherInfo implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: WD */
    private String f7789WD;

    /* renamed from: WS */
    private String f7790WS;
    private String city;
    private String index_tr;
    private String temp;
    private String time;
    private String weather;

    public String getCity() {
        return this.city;
    }

    public String getIndex_tr() {
        return this.index_tr;
    }

    public String getTemp() {
        return this.temp;
    }

    public String getTime() {
        return this.time;
    }

    public String getWD() {
        return this.f7789WD;
    }

    public String getWS() {
        return this.f7790WS;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setIndex_tr(String str) {
        this.index_tr = str;
    }

    public void setTemp(String str) {
        this.temp = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setWD(String str) {
        this.f7789WD = str;
    }

    public void setWS(String str) {
        this.f7790WS = str;
    }

    public void setWeather(String str) {
        this.weather = str;
    }
}
