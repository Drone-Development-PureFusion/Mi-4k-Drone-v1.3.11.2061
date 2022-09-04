package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.support.p001v4.view.ViewCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes2.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final C8623o CREATOR = new C8623o();

    /* renamed from: a */
    private final int f27439a;

    /* renamed from: b */
    private LatLng f27440b;

    /* renamed from: c */
    private double f27441c;

    /* renamed from: d */
    private float f27442d;

    /* renamed from: e */
    private int f27443e;

    /* renamed from: f */
    private int f27444f;

    /* renamed from: g */
    private float f27445g;

    /* renamed from: h */
    private boolean f27446h;

    /* renamed from: i */
    private boolean f27447i;

    public CircleOptions() {
        this.f27440b = null;
        this.f27441c = C9755a.f30449c;
        this.f27442d = 10.0f;
        this.f27443e = ViewCompat.MEASURED_STATE_MASK;
        this.f27444f = 0;
        this.f27445g = 0.0f;
        this.f27446h = true;
        this.f27447i = false;
        this.f27439a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z, boolean z2) {
        this.f27440b = null;
        this.f27441c = C9755a.f30449c;
        this.f27442d = 10.0f;
        this.f27443e = ViewCompat.MEASURED_STATE_MASK;
        this.f27444f = 0;
        this.f27445g = 0.0f;
        this.f27446h = true;
        this.f27447i = false;
        this.f27439a = i;
        this.f27440b = latLng;
        this.f27441c = d;
        this.f27442d = f;
        this.f27443e = i2;
        this.f27444f = i3;
        this.f27445g = f2;
        this.f27446h = z;
        this.f27447i = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11417a() {
        return this.f27439a;
    }

    /* renamed from: a */
    public CircleOptions m11416a(double d) {
        this.f27441c = d;
        return this;
    }

    /* renamed from: a */
    public CircleOptions m11415a(float f) {
        this.f27442d = f;
        return this;
    }

    /* renamed from: a */
    public CircleOptions m11414a(int i) {
        this.f27443e = i;
        return this;
    }

    /* renamed from: a */
    public CircleOptions m11413a(LatLng latLng) {
        this.f27440b = latLng;
        return this;
    }

    /* renamed from: a */
    public CircleOptions m11412a(boolean z) {
        this.f27446h = z;
        return this;
    }

    /* renamed from: b */
    public CircleOptions m11410b(float f) {
        this.f27445g = f;
        return this;
    }

    /* renamed from: b */
    public CircleOptions m11409b(int i) {
        this.f27444f = i;
        return this;
    }

    /* renamed from: b */
    public CircleOptions m11408b(boolean z) {
        this.f27447i = z;
        return this;
    }

    /* renamed from: b */
    public LatLng m11411b() {
        return this.f27440b;
    }

    /* renamed from: c */
    public double m11407c() {
        return this.f27441c;
    }

    /* renamed from: d */
    public float m11406d() {
        return this.f27442d;
    }

    /* renamed from: e */
    public int m11405e() {
        return this.f27443e;
    }

    /* renamed from: f */
    public int m11404f() {
        return this.f27444f;
    }

    /* renamed from: g */
    public float m11403g() {
        return this.f27445g;
    }

    /* renamed from: h */
    public boolean m11402h() {
        return this.f27446h;
    }

    /* renamed from: i */
    public boolean m11401i() {
        return this.f27447i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8623o.m10949a(this, parcel, i);
    }
}
