package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.p232c.AbstractC4170e;
/* loaded from: classes2.dex */
public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final C8624p CREATOR = new C8624p();

    /* renamed from: a */
    public static final float f27448a = -1.0f;

    /* renamed from: b */
    private final int f27449b;

    /* renamed from: c */
    private C8575a f27450c;

    /* renamed from: d */
    private LatLng f27451d;

    /* renamed from: e */
    private float f27452e;

    /* renamed from: f */
    private float f27453f;

    /* renamed from: g */
    private LatLngBounds f27454g;

    /* renamed from: h */
    private float f27455h;

    /* renamed from: i */
    private float f27456i;

    /* renamed from: j */
    private boolean f27457j;

    /* renamed from: k */
    private float f27458k;

    /* renamed from: l */
    private float f27459l;

    /* renamed from: m */
    private float f27460m;

    /* renamed from: n */
    private boolean f27461n;

    public GroundOverlayOptions() {
        this.f27457j = true;
        this.f27458k = 0.0f;
        this.f27459l = 0.5f;
        this.f27460m = 0.5f;
        this.f27461n = false;
        this.f27449b = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.f27457j = true;
        this.f27458k = 0.0f;
        this.f27459l = 0.5f;
        this.f27460m = 0.5f;
        this.f27461n = false;
        this.f27449b = i;
        this.f27450c = new C8575a(AbstractC4170e.AbstractBinderC4171a.m25295a(iBinder));
        this.f27451d = latLng;
        this.f27452e = f;
        this.f27453f = f2;
        this.f27454g = latLngBounds;
        this.f27455h = f3;
        this.f27456i = f4;
        this.f27457j = z;
        this.f27458k = f5;
        this.f27459l = f6;
        this.f27460m = f7;
        this.f27461n = z2;
    }

    /* renamed from: b */
    private GroundOverlayOptions m11390b(LatLng latLng, float f, float f2) {
        this.f27451d = latLng;
        this.f27452e = f;
        this.f27453f = f2;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder m11400a() {
        return this.f27450c.m11256a().asBinder();
    }

    /* renamed from: a */
    public GroundOverlayOptions m11399a(float f) {
        this.f27455h = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    /* renamed from: a */
    public GroundOverlayOptions m11398a(float f, float f2) {
        this.f27459l = f;
        this.f27460m = f2;
        return this;
    }

    /* renamed from: a */
    public GroundOverlayOptions m11397a(LatLng latLng, float f) {
        boolean z = true;
        C4588d.m23622a(this.f27454g == null, "Position has already been set using positionFromBounds");
        C4588d.m23618b(latLng != null, "Location must be specified");
        if (f < 0.0f) {
            z = false;
        }
        C4588d.m23618b(z, "Width must be non-negative");
        return m11390b(latLng, f, -1.0f);
    }

    /* renamed from: a */
    public GroundOverlayOptions m11396a(LatLng latLng, float f, float f2) {
        boolean z = true;
        C4588d.m23622a(this.f27454g == null, "Position has already been set using positionFromBounds");
        C4588d.m23618b(latLng != null, "Location must be specified");
        C4588d.m23618b(f >= 0.0f, "Width must be non-negative");
        if (f2 < 0.0f) {
            z = false;
        }
        C4588d.m23618b(z, "Height must be non-negative");
        return m11390b(latLng, f, f2);
    }

    /* renamed from: a */
    public GroundOverlayOptions m11395a(LatLngBounds latLngBounds) {
        boolean z = this.f27451d == null;
        String valueOf = String.valueOf(this.f27451d);
        C4588d.m23622a(z, new StringBuilder(String.valueOf(valueOf).length() + 46).append("Position has already been set using position: ").append(valueOf).toString());
        this.f27454g = latLngBounds;
        return this;
    }

    /* renamed from: a */
    public GroundOverlayOptions m11394a(C8575a c8575a) {
        this.f27450c = c8575a;
        return this;
    }

    /* renamed from: a */
    public GroundOverlayOptions m11393a(boolean z) {
        this.f27457j = z;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m11392b() {
        return this.f27449b;
    }

    /* renamed from: b */
    public GroundOverlayOptions m11391b(float f) {
        this.f27456i = f;
        return this;
    }

    /* renamed from: b */
    public GroundOverlayOptions m11389b(boolean z) {
        this.f27461n = z;
        return this;
    }

    /* renamed from: c */
    public GroundOverlayOptions m11387c(float f) {
        C4588d.m23618b(f >= 0.0f && f <= 1.0f, "Transparency must be in the range [0..1]");
        this.f27458k = f;
        return this;
    }

    /* renamed from: c */
    public C8575a m11388c() {
        return this.f27450c;
    }

    /* renamed from: d */
    public LatLng m11386d() {
        return this.f27451d;
    }

    /* renamed from: e */
    public float m11385e() {
        return this.f27452e;
    }

    /* renamed from: f */
    public float m11384f() {
        return this.f27453f;
    }

    /* renamed from: g */
    public LatLngBounds m11383g() {
        return this.f27454g;
    }

    /* renamed from: h */
    public float m11382h() {
        return this.f27455h;
    }

    /* renamed from: i */
    public float m11381i() {
        return this.f27456i;
    }

    /* renamed from: j */
    public float m11380j() {
        return this.f27458k;
    }

    /* renamed from: k */
    public float m11379k() {
        return this.f27459l;
    }

    /* renamed from: l */
    public float m11378l() {
        return this.f27460m;
    }

    /* renamed from: m */
    public boolean m11377m() {
        return this.f27457j;
    }

    /* renamed from: n */
    public boolean m11376n() {
        return this.f27461n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8624p.m10946a(this, parcel, i);
    }
}
