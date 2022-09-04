package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.p247a.C8463m;
/* loaded from: classes2.dex */
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C8568l CREATOR = new C8568l();

    /* renamed from: a */
    private final int f27270a;

    /* renamed from: b */
    private StreetViewPanoramaCamera f27271b;

    /* renamed from: c */
    private String f27272c;

    /* renamed from: d */
    private LatLng f27273d;

    /* renamed from: e */
    private Integer f27274e;

    /* renamed from: f */
    private Boolean f27275f;

    /* renamed from: g */
    private Boolean f27276g;

    /* renamed from: h */
    private Boolean f27277h;

    /* renamed from: i */
    private Boolean f27278i;

    /* renamed from: j */
    private Boolean f27279j;

    public StreetViewPanoramaOptions() {
        this.f27275f = true;
        this.f27276g = true;
        this.f27277h = true;
        this.f27278i = true;
        this.f27270a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.f27275f = true;
        this.f27276g = true;
        this.f27277h = true;
        this.f27278i = true;
        this.f27270a = i;
        this.f27271b = streetViewPanoramaCamera;
        this.f27273d = latLng;
        this.f27274e = num;
        this.f27272c = str;
        this.f27275f = C8463m.m11657a(b);
        this.f27276g = C8463m.m11657a(b2);
        this.f27277h = C8463m.m11657a(b3);
        this.f27278i = C8463m.m11657a(b4);
        this.f27279j = C8463m.m11657a(b5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11929a() {
        return this.f27270a;
    }

    /* renamed from: a */
    public StreetViewPanoramaOptions m11928a(LatLng latLng) {
        this.f27273d = latLng;
        return this;
    }

    /* renamed from: a */
    public StreetViewPanoramaOptions m11927a(LatLng latLng, Integer num) {
        this.f27273d = latLng;
        this.f27274e = num;
        return this;
    }

    /* renamed from: a */
    public StreetViewPanoramaOptions m11926a(StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.f27271b = streetViewPanoramaCamera;
        return this;
    }

    /* renamed from: a */
    public StreetViewPanoramaOptions m11925a(String str) {
        this.f27272c = str;
        return this;
    }

    /* renamed from: a */
    public StreetViewPanoramaOptions m11924a(boolean z) {
        this.f27275f = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public byte m11923b() {
        return C8463m.m11656a(this.f27275f);
    }

    /* renamed from: b */
    public StreetViewPanoramaOptions m11922b(boolean z) {
        this.f27276g = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte m11921c() {
        return C8463m.m11656a(this.f27276g);
    }

    /* renamed from: c */
    public StreetViewPanoramaOptions m11920c(boolean z) {
        this.f27277h = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public byte m11919d() {
        return C8463m.m11656a(this.f27277h);
    }

    /* renamed from: d */
    public StreetViewPanoramaOptions m11918d(boolean z) {
        this.f27278i = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public byte m11917e() {
        return C8463m.m11656a(this.f27278i);
    }

    /* renamed from: e */
    public StreetViewPanoramaOptions m11916e(boolean z) {
        this.f27279j = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public byte m11915f() {
        return C8463m.m11656a(this.f27279j);
    }

    /* renamed from: g */
    public StreetViewPanoramaCamera m11914g() {
        return this.f27271b;
    }

    /* renamed from: h */
    public LatLng m11913h() {
        return this.f27273d;
    }

    /* renamed from: i */
    public Integer m11912i() {
        return this.f27274e;
    }

    /* renamed from: j */
    public String m11911j() {
        return this.f27272c;
    }

    /* renamed from: k */
    public Boolean m11910k() {
        return this.f27275f;
    }

    /* renamed from: l */
    public Boolean m11909l() {
        return this.f27276g;
    }

    /* renamed from: m */
    public Boolean m11908m() {
        return this.f27277h;
    }

    /* renamed from: n */
    public Boolean m11907n() {
        return this.f27278i;
    }

    /* renamed from: o */
    public Boolean m11906o() {
        return this.f27279j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8568l.m11428a(this, parcel, i);
    }
}
