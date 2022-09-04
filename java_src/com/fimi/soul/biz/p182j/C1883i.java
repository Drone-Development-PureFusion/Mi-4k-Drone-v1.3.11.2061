package com.fimi.soul.biz.p182j;

import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.List;
/* renamed from: com.fimi.soul.biz.j.i */
/* loaded from: classes.dex */
public class C1883i {
    /* renamed from: a */
    public static MarkerOptions m33761a(LatLng latLng, int i) {
        return new MarkerOptions().m11353a(latLng).m11352a(C1884j.m33758a(i)).m11350a(true);
    }

    /* renamed from: a */
    public static MarkerOptions m33760a(LatLng latLng, Context context, float f, boolean z, int i) {
        return new MarkerOptions().m11353a(latLng).m11352a(C1884j.m33757a(context, i, f, z)).m11350a(true);
    }

    /* renamed from: a */
    public static PolylineOptions m33759a(List<LatLng> list, int i, int i2) {
        return new PolylineOptions().m11301a(list).m11303a(i2).m11304a(i);
    }
}
