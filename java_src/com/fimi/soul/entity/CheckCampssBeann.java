package com.fimi.soul.entity;

import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class CheckCampssBeann implements Serializable {
    private List<LatLng> listLatlng = new ArrayList();

    public List<LatLng> getListLatlng() {
        return this.listLatlng;
    }

    public void setListLatlng(List<LatLng> list) {
        this.listLatlng = list;
    }
}
