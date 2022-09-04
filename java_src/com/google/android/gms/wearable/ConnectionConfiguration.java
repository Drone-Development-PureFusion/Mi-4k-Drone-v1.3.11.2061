package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new C9652z();

    /* renamed from: a */
    final int f29790a;

    /* renamed from: b */
    private final String f29791b;

    /* renamed from: c */
    private final String f29792c;

    /* renamed from: d */
    private final int f29793d;

    /* renamed from: e */
    private final int f29794e;

    /* renamed from: f */
    private final boolean f29795f;

    /* renamed from: g */
    private boolean f29796g;

    /* renamed from: h */
    private String f29797h;

    /* renamed from: i */
    private boolean f29798i;

    /* renamed from: j */
    private String f29799j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConnectionConfiguration(int i, String str, String str2, int i2, int i3, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.f29790a = i;
        this.f29791b = str;
        this.f29792c = str2;
        this.f29793d = i2;
        this.f29794e = i3;
        this.f29795f = z;
        this.f29796g = z2;
        this.f29797h = str3;
        this.f29798i = z3;
        this.f29799j = str4;
    }

    /* renamed from: a */
    public String m8137a() {
        return this.f29791b;
    }

    /* renamed from: b */
    public String m8136b() {
        return this.f29792c;
    }

    /* renamed from: c */
    public int m8135c() {
        return this.f29793d;
    }

    /* renamed from: d */
    public int m8134d() {
        return this.f29794e;
    }

    /* renamed from: e */
    public boolean m8133e() {
        return this.f29796g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return C4585c.m23634a(Integer.valueOf(this.f29790a), Integer.valueOf(connectionConfiguration.f29790a)) && C4585c.m23634a(this.f29791b, connectionConfiguration.f29791b) && C4585c.m23634a(this.f29792c, connectionConfiguration.f29792c) && C4585c.m23634a(Integer.valueOf(this.f29793d), Integer.valueOf(connectionConfiguration.f29793d)) && C4585c.m23634a(Integer.valueOf(this.f29794e), Integer.valueOf(connectionConfiguration.f29794e)) && C4585c.m23634a(Boolean.valueOf(this.f29795f), Boolean.valueOf(connectionConfiguration.f29795f)) && C4585c.m23634a(Boolean.valueOf(this.f29798i), Boolean.valueOf(connectionConfiguration.f29798i));
    }

    /* renamed from: f */
    public String m8132f() {
        return this.f29797h;
    }

    /* renamed from: g */
    public boolean m8131g() {
        return this.f29798i;
    }

    /* renamed from: h */
    public String m8130h() {
        return this.f29799j;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f29790a), this.f29791b, this.f29792c, Integer.valueOf(this.f29793d), Integer.valueOf(this.f29794e), Boolean.valueOf(this.f29795f), Boolean.valueOf(this.f29798i));
    }

    /* renamed from: i */
    public boolean m8129i() {
        return this.f29795f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.f29791b);
        sb.append(valueOf.length() != 0 ? "mName=".concat(valueOf) : new String("mName="));
        String valueOf2 = String.valueOf(this.f29792c);
        sb.append(valueOf2.length() != 0 ? ", mAddress=".concat(valueOf2) : new String(", mAddress="));
        sb.append(new StringBuilder(19).append(", mType=").append(this.f29793d).toString());
        sb.append(new StringBuilder(19).append(", mRole=").append(this.f29794e).toString());
        sb.append(new StringBuilder(16).append(", mEnabled=").append(this.f29795f).toString());
        sb.append(new StringBuilder(20).append(", mIsConnected=").append(this.f29796g).toString());
        String valueOf3 = String.valueOf(this.f29797h);
        sb.append(valueOf3.length() != 0 ? ", mPeerNodeId=".concat(valueOf3) : new String(", mPeerNodeId="));
        sb.append(new StringBuilder(21).append(", mBtlePriority=").append(this.f29798i).toString());
        String valueOf4 = String.valueOf(this.f29799j);
        sb.append(valueOf4.length() != 0 ? ", mNodeId=".concat(valueOf4) : new String(", mNodeId="));
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9652z.m7541a(this, parcel, i);
    }
}
