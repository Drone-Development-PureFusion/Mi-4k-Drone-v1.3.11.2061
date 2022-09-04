package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p001v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final C8631w CREATOR = new C8631w();

    /* renamed from: a */
    private final int f27504a;

    /* renamed from: b */
    private final List<LatLng> f27505b;

    /* renamed from: c */
    private float f27506c;

    /* renamed from: d */
    private int f27507d;

    /* renamed from: e */
    private float f27508e;

    /* renamed from: f */
    private boolean f27509f;

    /* renamed from: g */
    private boolean f27510g;

    /* renamed from: h */
    private boolean f27511h;

    public PolylineOptions() {
        this.f27506c = 10.0f;
        this.f27507d = ViewCompat.MEASURED_STATE_MASK;
        this.f27508e = 0.0f;
        this.f27509f = true;
        this.f27510g = false;
        this.f27511h = false;
        this.f27504a = 1;
        this.f27505b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PolylineOptions(int i, List list, float f, int i2, float f2, boolean z, boolean z2, boolean z3) {
        this.f27506c = 10.0f;
        this.f27507d = ViewCompat.MEASURED_STATE_MASK;
        this.f27508e = 0.0f;
        this.f27509f = true;
        this.f27510g = false;
        this.f27511h = false;
        this.f27504a = i;
        this.f27505b = list;
        this.f27506c = f;
        this.f27507d = i2;
        this.f27508e = f2;
        this.f27509f = z;
        this.f27510g = z2;
        this.f27511h = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11305a() {
        return this.f27504a;
    }

    /* renamed from: a */
    public PolylineOptions m11304a(float f) {
        this.f27506c = f;
        return this;
    }

    /* renamed from: a */
    public PolylineOptions m11303a(int i) {
        this.f27507d = i;
        return this;
    }

    /* renamed from: a */
    public PolylineOptions m11302a(LatLng latLng) {
        this.f27505b.add(latLng);
        return this;
    }

    /* renamed from: a */
    public PolylineOptions m11301a(Iterable<LatLng> iterable) {
        for (LatLng latLng : iterable) {
            this.f27505b.add(latLng);
        }
        return this;
    }

    /* renamed from: a */
    public PolylineOptions m11300a(boolean z) {
        this.f27509f = z;
        return this;
    }

    /* renamed from: a */
    public PolylineOptions m11299a(LatLng... latLngArr) {
        this.f27505b.addAll(Arrays.asList(latLngArr));
        return this;
    }

    /* renamed from: b */
    public PolylineOptions m11297b(float f) {
        this.f27508e = f;
        return this;
    }

    /* renamed from: b */
    public PolylineOptions m11296b(boolean z) {
        this.f27510g = z;
        return this;
    }

    /* renamed from: b */
    public List<LatLng> m11298b() {
        return this.f27505b;
    }

    /* renamed from: c */
    public float m11295c() {
        return this.f27506c;
    }

    /* renamed from: c */
    public PolylineOptions m11294c(boolean z) {
        this.f27511h = z;
        return this;
    }

    /* renamed from: d */
    public int m11293d() {
        return this.f27507d;
    }

    /* renamed from: e */
    public float m11292e() {
        return this.f27508e;
    }

    /* renamed from: f */
    public boolean m11291f() {
        return this.f27509f;
    }

    /* renamed from: g */
    public boolean m11290g() {
        return this.f27510g;
    }

    /* renamed from: h */
    public boolean m11289h() {
        return this.f27511h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8631w.m10925a(this, parcel, i);
    }
}
