package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p001v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final C8630v CREATOR = new C8630v();

    /* renamed from: a */
    private final int f27494a;

    /* renamed from: b */
    private final List<LatLng> f27495b;

    /* renamed from: c */
    private final List<List<LatLng>> f27496c;

    /* renamed from: d */
    private float f27497d;

    /* renamed from: e */
    private int f27498e;

    /* renamed from: f */
    private int f27499f;

    /* renamed from: g */
    private float f27500g;

    /* renamed from: h */
    private boolean f27501h;

    /* renamed from: i */
    private boolean f27502i;

    /* renamed from: j */
    private boolean f27503j;

    public PolygonOptions() {
        this.f27497d = 10.0f;
        this.f27498e = ViewCompat.MEASURED_STATE_MASK;
        this.f27499f = 0;
        this.f27500g = 0.0f;
        this.f27501h = true;
        this.f27502i = false;
        this.f27503j = false;
        this.f27494a = 1;
        this.f27495b = new ArrayList();
        this.f27496c = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PolygonOptions(int i, List<LatLng> list, List list2, float f, int i2, int i3, float f2, boolean z, boolean z2, boolean z3) {
        this.f27497d = 10.0f;
        this.f27498e = ViewCompat.MEASURED_STATE_MASK;
        this.f27499f = 0;
        this.f27500g = 0.0f;
        this.f27501h = true;
        this.f27502i = false;
        this.f27503j = false;
        this.f27494a = i;
        this.f27495b = list;
        this.f27496c = list2;
        this.f27497d = f;
        this.f27498e = i2;
        this.f27499f = i3;
        this.f27500g = f2;
        this.f27501h = z;
        this.f27502i = z2;
        this.f27503j = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11327a() {
        return this.f27494a;
    }

    /* renamed from: a */
    public PolygonOptions m11326a(float f) {
        this.f27497d = f;
        return this;
    }

    /* renamed from: a */
    public PolygonOptions m11325a(int i) {
        this.f27498e = i;
        return this;
    }

    /* renamed from: a */
    public PolygonOptions m11324a(LatLng latLng) {
        this.f27495b.add(latLng);
        return this;
    }

    /* renamed from: a */
    public PolygonOptions m11323a(Iterable<LatLng> iterable) {
        for (LatLng latLng : iterable) {
            this.f27495b.add(latLng);
        }
        return this;
    }

    /* renamed from: a */
    public PolygonOptions m11322a(boolean z) {
        this.f27501h = z;
        return this;
    }

    /* renamed from: a */
    public PolygonOptions m11321a(LatLng... latLngArr) {
        this.f27495b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    /* renamed from: b */
    public PolygonOptions m11319b(float f) {
        this.f27500g = f;
        return this;
    }

    /* renamed from: b */
    public PolygonOptions m11318b(int i) {
        this.f27499f = i;
        return this;
    }

    /* renamed from: b */
    public PolygonOptions m11317b(Iterable<LatLng> iterable) {
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : iterable) {
            arrayList.add(latLng);
        }
        this.f27496c.add(arrayList);
        return this;
    }

    /* renamed from: b */
    public PolygonOptions m11316b(boolean z) {
        this.f27502i = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public List m11320b() {
        return this.f27496c;
    }

    /* renamed from: c */
    public PolygonOptions m11314c(boolean z) {
        this.f27503j = z;
        return this;
    }

    /* renamed from: c */
    public List<LatLng> m11315c() {
        return this.f27495b;
    }

    /* renamed from: d */
    public List<List<LatLng>> m11313d() {
        return this.f27496c;
    }

    /* renamed from: e */
    public float m11312e() {
        return this.f27497d;
    }

    /* renamed from: f */
    public int m11311f() {
        return this.f27498e;
    }

    /* renamed from: g */
    public int m11310g() {
        return this.f27499f;
    }

    /* renamed from: h */
    public float m11309h() {
        return this.f27500g;
    }

    /* renamed from: i */
    public boolean m11308i() {
        return this.f27501h;
    }

    /* renamed from: j */
    public boolean m11307j() {
        return this.f27502i;
    }

    /* renamed from: k */
    public boolean m11306k() {
        return this.f27503j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8630v.m10928a(this, parcel, i);
    }
}
