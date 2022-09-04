package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class UserAttributeParcel extends AbstractSafeParcelable {
    public static final C8721k CREATOR = new C8721k();

    /* renamed from: a */
    public final int f27614a;

    /* renamed from: b */
    public final String f27615b;

    /* renamed from: c */
    public final long f27616c;

    /* renamed from: d */
    public final Long f27617d;

    /* renamed from: e */
    public final Float f27618e;

    /* renamed from: f */
    public final String f27619f;

    /* renamed from: g */
    public final String f27620g;

    /* renamed from: h */
    public final Double f27621h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAttributeParcel(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        Double d2 = null;
        this.f27614a = i;
        this.f27615b = str;
        this.f27616c = j;
        this.f27617d = l;
        this.f27618e = null;
        if (i == 1) {
            this.f27621h = f != null ? Double.valueOf(f.doubleValue()) : d2;
        } else {
            this.f27621h = d;
        }
        this.f27619f = str2;
        this.f27620g = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAttributeParcel(C8722l c8722l) {
        this(c8722l.f27911b, c8722l.f27912c, c8722l.f27913d, c8722l.f27910a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAttributeParcel(String str, long j, Object obj, String str2) {
        C4588d.m23625a(str);
        this.f27614a = 2;
        this.f27615b = str;
        this.f27616c = j;
        this.f27620g = str2;
        if (obj == null) {
            this.f27617d = null;
            this.f27618e = null;
            this.f27621h = null;
            this.f27619f = null;
        } else if (obj instanceof Long) {
            this.f27617d = (Long) obj;
            this.f27618e = null;
            this.f27621h = null;
            this.f27619f = null;
        } else if (obj instanceof String) {
            this.f27617d = null;
            this.f27618e = null;
            this.f27621h = null;
            this.f27619f = (String) obj;
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        } else {
            this.f27617d = null;
            this.f27618e = null;
            this.f27621h = (Double) obj;
            this.f27619f = null;
        }
    }

    /* renamed from: a */
    public Object m10894a() {
        if (this.f27617d != null) {
            return this.f27617d;
        }
        if (this.f27621h != null) {
            return this.f27621h;
        }
        if (this.f27619f == null) {
            return null;
        }
        return this.f27619f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8721k.m10552a(this, parcel, i);
    }
}
