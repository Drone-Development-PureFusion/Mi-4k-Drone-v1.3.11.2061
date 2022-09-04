package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.p247a.C8463m;
/* loaded from: classes2.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C8567k CREATOR = new C8567k();

    /* renamed from: a */
    private final int f27223a;

    /* renamed from: b */
    private Boolean f27224b;

    /* renamed from: c */
    private Boolean f27225c;

    /* renamed from: d */
    private int f27226d;

    /* renamed from: e */
    private CameraPosition f27227e;

    /* renamed from: f */
    private Boolean f27228f;

    /* renamed from: g */
    private Boolean f27229g;

    /* renamed from: h */
    private Boolean f27230h;

    /* renamed from: i */
    private Boolean f27231i;

    /* renamed from: j */
    private Boolean f27232j;

    /* renamed from: k */
    private Boolean f27233k;

    /* renamed from: l */
    private Boolean f27234l;

    /* renamed from: m */
    private Boolean f27235m;

    /* renamed from: n */
    private Boolean f27236n;

    /* renamed from: o */
    private Float f27237o;

    /* renamed from: p */
    private Float f27238p;

    /* renamed from: q */
    private LatLngBounds f27239q;

    public GoogleMapOptions() {
        this.f27226d = -1;
        this.f27237o = null;
        this.f27238p = null;
        this.f27239q = null;
        this.f27223a = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds) {
        this.f27226d = -1;
        this.f27237o = null;
        this.f27238p = null;
        this.f27239q = null;
        this.f27223a = i;
        this.f27224b = C8463m.m11657a(b);
        this.f27225c = C8463m.m11657a(b2);
        this.f27226d = i2;
        this.f27227e = cameraPosition;
        this.f27228f = C8463m.m11657a(b3);
        this.f27229g = C8463m.m11657a(b4);
        this.f27230h = C8463m.m11657a(b5);
        this.f27231i = C8463m.m11657a(b6);
        this.f27232j = C8463m.m11657a(b7);
        this.f27233k = C8463m.m11657a(b8);
        this.f27234l = C8463m.m11657a(b9);
        this.f27235m = C8463m.m11657a(b10);
        this.f27236n = C8463m.m11657a(b11);
        this.f27237o = f;
        this.f27238p = f2;
        this.f27239q = latLngBounds;
    }

    /* renamed from: a */
    public static GoogleMapOptions m12010a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3424R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_mapType)) {
            googleMapOptions.m12011a(obtainAttributes.getInt(C3424R.styleable.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_zOrderOnTop)) {
            googleMapOptions.m12007a(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_useViewLifecycle)) {
            googleMapOptions.m12004b(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_uiCompass)) {
            googleMapOptions.m12000d(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_uiRotateGestures)) {
            googleMapOptions.m11992h(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_uiScrollGestures)) {
            googleMapOptions.m11998e(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_uiTiltGestures)) {
            googleMapOptions.m11994g(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_uiZoomGestures)) {
            googleMapOptions.m11996f(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_uiZoomControls)) {
            googleMapOptions.m12002c(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_liteMode)) {
            googleMapOptions.m11990i(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_uiMapToolbar)) {
            googleMapOptions.m11988j(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_ambientEnabled)) {
            googleMapOptions.m11986k(obtainAttributes.getBoolean(C3424R.styleable.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.m12012a(obtainAttributes.getFloat(C3424R.styleable.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.m12005b(obtainAttributes.getFloat(C3424R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.m12008a(LatLngBounds.m11371a(context, attributeSet));
        googleMapOptions.m12009a(CameraPosition.m11426a(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* renamed from: A */
    public Float m12015A() {
        return this.f27238p;
    }

    /* renamed from: B */
    public LatLngBounds m12014B() {
        return this.f27239q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m12013a() {
        return this.f27223a;
    }

    /* renamed from: a */
    public GoogleMapOptions m12012a(float f) {
        this.f27237o = Float.valueOf(f);
        return this;
    }

    /* renamed from: a */
    public GoogleMapOptions m12011a(int i) {
        this.f27226d = i;
        return this;
    }

    /* renamed from: a */
    public GoogleMapOptions m12009a(CameraPosition cameraPosition) {
        this.f27227e = cameraPosition;
        return this;
    }

    /* renamed from: a */
    public GoogleMapOptions m12008a(LatLngBounds latLngBounds) {
        this.f27239q = latLngBounds;
        return this;
    }

    /* renamed from: a */
    public GoogleMapOptions m12007a(boolean z) {
        this.f27224b = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public byte m12006b() {
        return C8463m.m11656a(this.f27224b);
    }

    /* renamed from: b */
    public GoogleMapOptions m12005b(float f) {
        this.f27238p = Float.valueOf(f);
        return this;
    }

    /* renamed from: b */
    public GoogleMapOptions m12004b(boolean z) {
        this.f27225c = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte m12003c() {
        return C8463m.m11656a(this.f27225c);
    }

    /* renamed from: c */
    public GoogleMapOptions m12002c(boolean z) {
        this.f27228f = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public byte m12001d() {
        return C8463m.m11656a(this.f27228f);
    }

    /* renamed from: d */
    public GoogleMapOptions m12000d(boolean z) {
        this.f27229g = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public byte m11999e() {
        return C8463m.m11656a(this.f27229g);
    }

    /* renamed from: e */
    public GoogleMapOptions m11998e(boolean z) {
        this.f27230h = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public byte m11997f() {
        return C8463m.m11656a(this.f27230h);
    }

    /* renamed from: f */
    public GoogleMapOptions m11996f(boolean z) {
        this.f27231i = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public byte m11995g() {
        return C8463m.m11656a(this.f27231i);
    }

    /* renamed from: g */
    public GoogleMapOptions m11994g(boolean z) {
        this.f27232j = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public byte m11993h() {
        return C8463m.m11656a(this.f27232j);
    }

    /* renamed from: h */
    public GoogleMapOptions m11992h(boolean z) {
        this.f27233k = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public byte m11991i() {
        return C8463m.m11656a(this.f27233k);
    }

    /* renamed from: i */
    public GoogleMapOptions m11990i(boolean z) {
        this.f27234l = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public byte m11989j() {
        return C8463m.m11656a(this.f27234l);
    }

    /* renamed from: j */
    public GoogleMapOptions m11988j(boolean z) {
        this.f27235m = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public byte m11987k() {
        return C8463m.m11656a(this.f27235m);
    }

    /* renamed from: k */
    public GoogleMapOptions m11986k(boolean z) {
        this.f27236n = Boolean.valueOf(z);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public byte m11985l() {
        return C8463m.m11656a(this.f27236n);
    }

    /* renamed from: m */
    public Boolean m11984m() {
        return this.f27224b;
    }

    /* renamed from: n */
    public Boolean m11983n() {
        return this.f27225c;
    }

    /* renamed from: o */
    public int m11982o() {
        return this.f27226d;
    }

    /* renamed from: p */
    public CameraPosition m11981p() {
        return this.f27227e;
    }

    /* renamed from: q */
    public Boolean m11980q() {
        return this.f27228f;
    }

    /* renamed from: r */
    public Boolean m11979r() {
        return this.f27229g;
    }

    /* renamed from: s */
    public Boolean m11978s() {
        return this.f27230h;
    }

    /* renamed from: t */
    public Boolean m11977t() {
        return this.f27231i;
    }

    /* renamed from: u */
    public Boolean m11976u() {
        return this.f27232j;
    }

    /* renamed from: v */
    public Boolean m11975v() {
        return this.f27233k;
    }

    /* renamed from: w */
    public Boolean m11974w() {
        return this.f27234l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8567k.m11431a(this, parcel, i);
    }

    /* renamed from: x */
    public Boolean m11973x() {
        return this.f27235m;
    }

    /* renamed from: y */
    public Boolean m11972y() {
        return this.f27236n;
    }

    /* renamed from: z */
    public Float m11971z() {
        return this.f27237o;
    }
}
