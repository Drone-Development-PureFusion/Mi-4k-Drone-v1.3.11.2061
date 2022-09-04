package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@Deprecated
/* loaded from: classes.dex */
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyCard> CREATOR = new C9413w();

    /* renamed from: a */
    String f29558a;

    /* renamed from: b */
    String f29559b;

    /* renamed from: c */
    int f29560c;

    /* renamed from: d */
    int f29561d;

    /* renamed from: e */
    private final int f29562e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProxyCard(int i, String str, String str2, int i2, int i3) {
        this.f29562e = i;
        this.f29558a = str;
        this.f29559b = str2;
        this.f29560c = i2;
        this.f29561d = i3;
    }

    /* renamed from: a */
    public int m8460a() {
        return this.f29562e;
    }

    /* renamed from: b */
    public String m8459b() {
        return this.f29558a;
    }

    /* renamed from: c */
    public String m8458c() {
        return this.f29559b;
    }

    /* renamed from: d */
    public int m8457d() {
        return this.f29560c;
    }

    /* renamed from: e */
    public int m8456e() {
        return this.f29561d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9413w.m8186a(this, parcel, i);
    }
}
