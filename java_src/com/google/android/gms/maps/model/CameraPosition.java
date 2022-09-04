package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.C3424R;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.p253b.C9755a;
/* loaded from: classes2.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final C8622n CREATOR = new C8622n();

    /* renamed from: a */
    public final LatLng f27430a;

    /* renamed from: b */
    public final float f27431b;

    /* renamed from: c */
    public final float f27432c;

    /* renamed from: d */
    public final float f27433d;

    /* renamed from: e */
    private final int f27434e;

    /* renamed from: com.google.android.gms.maps.model.CameraPosition$a */
    /* loaded from: classes2.dex */
    public static final class C8569a {

        /* renamed from: a */
        private LatLng f27435a;

        /* renamed from: b */
        private float f27436b;

        /* renamed from: c */
        private float f27437c;

        /* renamed from: d */
        private float f27438d;

        public C8569a() {
        }

        public C8569a(CameraPosition cameraPosition) {
            this.f27435a = cameraPosition.f27430a;
            this.f27436b = cameraPosition.f27431b;
            this.f27437c = cameraPosition.f27432c;
            this.f27438d = cameraPosition.f27433d;
        }

        /* renamed from: a */
        public C8569a m11421a(float f) {
            this.f27436b = f;
            return this;
        }

        /* renamed from: a */
        public C8569a m11420a(LatLng latLng) {
            this.f27435a = latLng;
            return this;
        }

        /* renamed from: a */
        public CameraPosition m11422a() {
            return new CameraPosition(this.f27435a, this.f27436b, this.f27437c, this.f27438d);
        }

        /* renamed from: b */
        public C8569a m11419b(float f) {
            this.f27437c = f;
            return this;
        }

        /* renamed from: c */
        public C8569a m11418c(float f) {
            this.f27438d = f;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraPosition(int i, LatLng latLng, float f, float f2, float f3) {
        C4588d.m23626a(latLng, "null camera target");
        C4588d.m23617b(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.f27434e = i;
        this.f27430a = latLng;
        this.f27431b = f;
        this.f27432c = f2 + 0.0f;
        this.f27433d = (((double) f3) <= C9755a.f30449c ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this(1, latLng, f, f2, f3);
    }

    /* renamed from: a */
    public static C8569a m11425a(CameraPosition cameraPosition) {
        return new C8569a(cameraPosition);
    }

    /* renamed from: a */
    public static CameraPosition m11426a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C3424R.styleable.MapAttrs);
        LatLng latLng = new LatLng(obtainAttributes.hasValue(C3424R.styleable.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(C3424R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, obtainAttributes.hasValue(C3424R.styleable.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(C3424R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        C8569a m11423b = m11423b();
        m11423b.m11420a(latLng);
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_cameraZoom)) {
            m11423b.m11421a(obtainAttributes.getFloat(C3424R.styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_cameraBearing)) {
            m11423b.m11418c(obtainAttributes.getFloat(C3424R.styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(C3424R.styleable.MapAttrs_cameraTilt)) {
            m11423b.m11419b(obtainAttributes.getFloat(C3424R.styleable.MapAttrs_cameraTilt, 0.0f));
        }
        return m11423b.m11422a();
    }

    /* renamed from: a */
    public static final CameraPosition m11424a(LatLng latLng, float f) {
        return new CameraPosition(latLng, f, 0.0f, 0.0f);
    }

    /* renamed from: b */
    public static C8569a m11423b() {
        return new C8569a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m11427a() {
        return this.f27434e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f27430a.equals(cameraPosition.f27430a) && Float.floatToIntBits(this.f27431b) == Float.floatToIntBits(cameraPosition.f27431b) && Float.floatToIntBits(this.f27432c) == Float.floatToIntBits(cameraPosition.f27432c) && Float.floatToIntBits(this.f27433d) == Float.floatToIntBits(cameraPosition.f27433d);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f27430a, Float.valueOf(this.f27431b), Float.valueOf(this.f27432c), Float.valueOf(this.f27433d));
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("target", this.f27430a).m23632a("zoom", Float.valueOf(this.f27431b)).m23632a("tilt", Float.valueOf(this.f27432c)).m23632a("bearing", Float.valueOf(this.f27433d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8622n.m10952a(this, parcel, i);
    }
}
