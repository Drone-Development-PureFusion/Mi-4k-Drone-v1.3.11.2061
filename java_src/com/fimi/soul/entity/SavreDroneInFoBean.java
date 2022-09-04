package com.fimi.soul.entity;

import com.fimi.soul.drone.p195d.p196a.C2196c;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class SavreDroneInFoBean implements Serializable {
    private ConcurrentHashMap<String, C2196c> hashMap = new ConcurrentHashMap<>();

    public ConcurrentHashMap<String, C2196c> getHashMap() {
        return this.hashMap;
    }
}
