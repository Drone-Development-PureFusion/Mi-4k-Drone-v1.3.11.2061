package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class Permission extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Permission> CREATOR = new C5117y();

    /* renamed from: a */
    final int f17531a;

    /* renamed from: b */
    private String f17532b;

    /* renamed from: c */
    private int f17533c;

    /* renamed from: d */
    private String f17534d;

    /* renamed from: e */
    private String f17535e;

    /* renamed from: f */
    private int f17536f;

    /* renamed from: g */
    private boolean f17537g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Permission(int i, String str, int i2, String str2, String str3, int i3, boolean z) {
        this.f17531a = i;
        this.f17532b = str;
        this.f17533c = i2;
        this.f17534d = str2;
        this.f17535e = str3;
        this.f17536f = i3;
        this.f17537g = z;
    }

    /* renamed from: a */
    public static boolean m22723a(int i) {
        switch (i) {
            case 256:
            case 257:
            case 258:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m22721b(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public String m22724a() {
        if (!m22723a(this.f17533c)) {
            return null;
        }
        return this.f17532b;
    }

    /* renamed from: b */
    public int m22722b() {
        if (!m22723a(this.f17533c)) {
            return -1;
        }
        return this.f17533c;
    }

    /* renamed from: c */
    public String m22720c() {
        return this.f17534d;
    }

    /* renamed from: d */
    public String m22719d() {
        return this.f17535e;
    }

    /* renamed from: e */
    public int m22718e() {
        if (!m22721b(this.f17536f)) {
            return -1;
        }
        return this.f17536f;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Permission permission = (Permission) obj;
        return C4585c.m23634a(this.f17532b, permission.f17532b) && this.f17533c == permission.f17533c && this.f17536f == permission.f17536f && this.f17537g == permission.f17537g;
    }

    /* renamed from: f */
    public boolean m22717f() {
        return this.f17537g;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17532b, Integer.valueOf(this.f17533c), Integer.valueOf(this.f17536f), Boolean.valueOf(this.f17537g));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C5117y.m21784a(this, parcel, i);
    }
}
