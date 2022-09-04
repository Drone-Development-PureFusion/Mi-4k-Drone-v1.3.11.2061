package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.p232c.AbstractC4170e;
/* loaded from: classes2.dex */
public final class MarkerOptions extends AbstractSafeParcelable {
    public static final C8628t CREATOR = new C8628t();

    /* renamed from: a */
    private final int f27475a;

    /* renamed from: b */
    private LatLng f27476b;

    /* renamed from: c */
    private String f27477c;

    /* renamed from: d */
    private String f27478d;

    /* renamed from: e */
    private C8575a f27479e;

    /* renamed from: f */
    private float f27480f;

    /* renamed from: g */
    private float f27481g;

    /* renamed from: h */
    private boolean f27482h;

    /* renamed from: i */
    private boolean f27483i;

    /* renamed from: j */
    private boolean f27484j;

    /* renamed from: k */
    private float f27485k;

    /* renamed from: l */
    private float f27486l;

    /* renamed from: m */
    private float f27487m;

    /* renamed from: n */
    private float f27488n;

    /* renamed from: o */
    private float f27489o;

    public MarkerOptions() {
        this.f27480f = 0.5f;
        this.f27481g = 1.0f;
        this.f27483i = true;
        this.f27484j = false;
        this.f27485k = 0.0f;
        this.f27486l = 0.5f;
        this.f27487m = 0.0f;
        this.f27488n = 1.0f;
        this.f27475a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f27480f = 0.5f;
        this.f27481g = 1.0f;
        this.f27483i = true;
        this.f27484j = false;
        this.f27485k = 0.0f;
        this.f27486l = 0.5f;
        this.f27487m = 0.0f;
        this.f27488n = 1.0f;
        this.f27475a = i;
        this.f27476b = latLng;
        this.f27477c = str;
        this.f27478d = str2;
        this.f27479e = iBinder == null ? null : new C8575a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder));
        this.f27480f = f;
        this.f27481g = f2;
        this.f27482h = z;
        this.f27483i = z2;
        this.f27484j = z3;
        this.f27485k = f3;
        this.f27486l = f4;
        this.f27487m = f5;
        this.f27488n = f6;
        this.f27489o = f7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11356a() {
        return this.f27475a;
    }

    /* renamed from: a */
    public MarkerOptions m11355a(float f) {
        this.f27489o = f;
        return this;
    }

    /* renamed from: a */
    public MarkerOptions m11354a(float f, float f2) {
        this.f27480f = f;
        this.f27481g = f2;
        return this;
    }

    /* renamed from: a */
    public MarkerOptions m11353a(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f27476b = latLng;
        return this;
    }

    /* renamed from: a */
    public MarkerOptions m11352a(@Nullable C8575a c8575a) {
        this.f27479e = c8575a;
        return this;
    }

    /* renamed from: a */
    public MarkerOptions m11351a(@Nullable String str) {
        this.f27477c = str;
        return this;
    }

    /* renamed from: a */
    public MarkerOptions m11350a(boolean z) {
        this.f27482h = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public IBinder m11349b() {
        if (this.f27479e == null) {
            return null;
        }
        return this.f27479e.m11256a().asBinder();
    }

    /* renamed from: b */
    public MarkerOptions m11348b(float f) {
        this.f27485k = f;
        return this;
    }

    /* renamed from: b */
    public MarkerOptions m11347b(float f, float f2) {
        this.f27486l = f;
        this.f27487m = f2;
        return this;
    }

    /* renamed from: b */
    public MarkerOptions m11346b(@Nullable String str) {
        this.f27478d = str;
        return this;
    }

    /* renamed from: b */
    public MarkerOptions m11345b(boolean z) {
        this.f27483i = z;
        return this;
    }

    /* renamed from: c */
    public LatLng m11344c() {
        return this.f27476b;
    }

    /* renamed from: c */
    public MarkerOptions m11343c(float f) {
        this.f27488n = f;
        return this;
    }

    /* renamed from: c */
    public MarkerOptions m11342c(boolean z) {
        this.f27484j = z;
        return this;
    }

    /* renamed from: d */
    public String m11341d() {
        return this.f27477c;
    }

    /* renamed from: e */
    public String m11340e() {
        return this.f27478d;
    }

    /* renamed from: f */
    public C8575a m11339f() {
        return this.f27479e;
    }

    /* renamed from: g */
    public float m11338g() {
        return this.f27480f;
    }

    /* renamed from: h */
    public float m11337h() {
        return this.f27481g;
    }

    /* renamed from: i */
    public boolean m11336i() {
        return this.f27482h;
    }

    /* renamed from: j */
    public boolean m11335j() {
        return this.f27483i;
    }

    /* renamed from: k */
    public boolean m11334k() {
        return this.f27484j;
    }

    /* renamed from: l */
    public float m11333l() {
        return this.f27485k;
    }

    /* renamed from: m */
    public float m11332m() {
        return this.f27486l;
    }

    /* renamed from: n */
    public float m11331n() {
        return this.f27487m;
    }

    /* renamed from: o */
    public float m11330o() {
        return this.f27488n;
    }

    /* renamed from: p */
    public float m11329p() {
        return this.f27489o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8628t.m10934a(this, parcel, i);
    }
}
