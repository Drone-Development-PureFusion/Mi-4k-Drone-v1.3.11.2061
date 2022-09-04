package com.fimi.soul.module.dronemanage;

import android.graphics.Point;
import com.google.android.gms.maps.C8500c;
import com.google.android.gms.maps.model.C8617i;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.fimi.soul.module.dronemanage.e */
/* loaded from: classes.dex */
public class C2706e {

    /* renamed from: a */
    private C8500c f9291a;

    /* renamed from: b */
    private List<C8617i> f9292b = new ArrayList();

    /* renamed from: c */
    private C8617i f9293c;

    public C2706e(C8500c c8500c) {
        this.f9291a = c8500c;
    }

    /* renamed from: a */
    public void m30556a() {
        for (C8617i c8617i : this.f9292b) {
            c8617i.m10985a();
        }
    }

    /* renamed from: a */
    public void m30554a(LatLng latLng, LatLng latLng2) {
        m30556a();
        int i = this.f9291a.m11554n().m11482a(latLng).x;
        int i2 = this.f9291a.m11554n().m11482a(latLng).y;
        int i3 = this.f9291a.m11554n().m11482a(latLng2).x;
        int i4 = this.f9291a.m11554n().m11482a(latLng2).y;
        double atan = Math.atan(10.0d / 20.0d);
        double sqrt = Math.sqrt((20.0d * 20.0d) + (10.0d * 10.0d));
        double[] m30555a = m30555a(i3 - i, i4 - i2, atan, sqrt);
        double[] m30555a2 = m30555a(i3 - i, i4 - i2, -atan, sqrt);
        double d = i3 - m30555a[0];
        double d2 = i4 - m30555a[1];
        double d3 = i3 - m30555a2[0];
        double d4 = i4 - m30555a2[1];
        Point point = new Point((int) d, (int) d2);
        Point point2 = new Point((int) d3, (int) d4);
        LatLng m11483a = this.f9291a.m11554n().m11483a(point);
        LatLng m11483a2 = this.f9291a.m11554n().m11483a(point2);
        this.f9293c = this.f9291a.m11575a(new PolylineOptions().m11299a(latLng2, m11483a).m11303a(-256).m11304a(5.0f));
        if (!this.f9292b.contains(this.f9293c)) {
            this.f9292b.add(this.f9293c);
        }
        this.f9293c = this.f9291a.m11575a(new PolylineOptions().m11299a(latLng2, m11483a2).m11303a(-256).m11304a(5.0f));
        if (!this.f9292b.contains(this.f9293c)) {
            this.f9292b.add(this.f9293c);
        }
    }

    /* renamed from: a */
    public double[] m30555a(int i, int i2, double d, double d2) {
        double cos = (i * Math.cos(d)) - (i2 * Math.sin(d));
        double sin = (i * Math.sin(d)) + (i2 * Math.cos(d));
        double sqrt = Math.sqrt((cos * cos) + (sin * sin));
        return new double[]{(cos / sqrt) * d2, (sin / sqrt) * d2};
    }
}
