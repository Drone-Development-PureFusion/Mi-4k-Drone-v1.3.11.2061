package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class PlusSession extends AbstractSafeParcelable {
    public static final C8974h CREATOR = new C8974h();

    /* renamed from: a */
    private final int f28500a;

    /* renamed from: b */
    private final String f28501b;

    /* renamed from: c */
    private final String[] f28502c;

    /* renamed from: d */
    private final String[] f28503d;

    /* renamed from: e */
    private final String[] f28504e;

    /* renamed from: f */
    private final String f28505f;

    /* renamed from: g */
    private final String f28506g;

    /* renamed from: h */
    private final String f28507h;

    /* renamed from: i */
    private final String f28508i;

    /* renamed from: j */
    private final PlusCommonExtras f28509j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlusSession(int i, String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, String str5, PlusCommonExtras plusCommonExtras) {
        this.f28500a = i;
        this.f28501b = str;
        this.f28502c = strArr;
        this.f28503d = strArr2;
        this.f28504e = strArr3;
        this.f28505f = str2;
        this.f28506g = str3;
        this.f28507h = str4;
        this.f28508i = str5;
        this.f28509j = plusCommonExtras;
    }

    public PlusSession(String str, String[] strArr, String[] strArr2, String[] strArr3, String str2, String str3, String str4, PlusCommonExtras plusCommonExtras) {
        this.f28500a = 1;
        this.f28501b = str;
        this.f28502c = strArr;
        this.f28503d = strArr2;
        this.f28504e = strArr3;
        this.f28505f = str2;
        this.f28506g = str3;
        this.f28507h = str4;
        this.f28508i = null;
        this.f28509j = plusCommonExtras;
    }

    /* renamed from: a */
    public int m9678a() {
        return this.f28500a;
    }

    /* renamed from: b */
    public String m9677b() {
        return this.f28501b;
    }

    /* renamed from: c */
    public String[] m9676c() {
        return this.f28502c;
    }

    /* renamed from: d */
    public String[] m9675d() {
        return this.f28503d;
    }

    /* renamed from: e */
    public String[] m9674e() {
        return this.f28504e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusSession)) {
            return false;
        }
        PlusSession plusSession = (PlusSession) obj;
        return this.f28500a == plusSession.f28500a && C4585c.m23634a(this.f28501b, plusSession.f28501b) && Arrays.equals(this.f28502c, plusSession.f28502c) && Arrays.equals(this.f28503d, plusSession.f28503d) && Arrays.equals(this.f28504e, plusSession.f28504e) && C4585c.m23634a(this.f28505f, plusSession.f28505f) && C4585c.m23634a(this.f28506g, plusSession.f28506g) && C4585c.m23634a(this.f28507h, plusSession.f28507h) && C4585c.m23634a(this.f28508i, plusSession.f28508i) && C4585c.m23634a(this.f28509j, plusSession.f28509j);
    }

    /* renamed from: f */
    public String m9673f() {
        return this.f28505f;
    }

    /* renamed from: g */
    public String m9672g() {
        return this.f28506g;
    }

    /* renamed from: h */
    public String m9671h() {
        return this.f28507h;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28500a), this.f28501b, this.f28502c, this.f28503d, this.f28504e, this.f28505f, this.f28506g, this.f28507h, this.f28508i, this.f28509j);
    }

    /* renamed from: i */
    public String m9670i() {
        return this.f28508i;
    }

    /* renamed from: j */
    public PlusCommonExtras m9669j() {
        return this.f28509j;
    }

    /* renamed from: k */
    public Bundle m9668k() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
        this.f28509j.m9681a(bundle);
        return bundle;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("versionCode", Integer.valueOf(this.f28500a)).m23632a("accountName", this.f28501b).m23632a("requestedScopes", this.f28502c).m23632a("visibleActivities", this.f28503d).m23632a("requiredFeatures", this.f28504e).m23632a("packageNameForAuth", this.f28505f).m23632a("callingPackageName", this.f28506g).m23632a("applicationName", this.f28507h).m23632a("extra", this.f28509j.toString()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8974h.m9610a(this, parcel, i);
    }
}
