package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.AbstractC9635o;
/* loaded from: classes2.dex */
public class NodeParcelable extends AbstractSafeParcelable implements AbstractC9635o {
    public static final Parcelable.Creator<NodeParcelable> CREATOR = new C9493ae();

    /* renamed from: a */
    final int f29974a;

    /* renamed from: b */
    private final String f29975b;

    /* renamed from: c */
    private final String f29976c;

    /* renamed from: d */
    private final int f29977d;

    /* renamed from: e */
    private final boolean f29978e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NodeParcelable(int i, String str, String str2, int i2, boolean z) {
        this.f29974a = i;
        this.f29975b = str;
        this.f29976c = str2;
        this.f29977d = i2;
        this.f29978e = z;
    }

    @Override // com.google.android.gms.wearable.AbstractC9635o
    /* renamed from: a */
    public String mo7568a() {
        return this.f29975b;
    }

    @Override // com.google.android.gms.wearable.AbstractC9635o
    /* renamed from: b */
    public String mo7567b() {
        return this.f29976c;
    }

    @Override // com.google.android.gms.wearable.AbstractC9635o
    /* renamed from: c */
    public boolean mo7566c() {
        return this.f29978e;
    }

    /* renamed from: d */
    public int m8038d() {
        return this.f29977d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NodeParcelable)) {
            return false;
        }
        return ((NodeParcelable) obj).f29975b.equals(this.f29975b);
    }

    public int hashCode() {
        return this.f29975b.hashCode();
    }

    public String toString() {
        String str = this.f29976c;
        String str2 = this.f29975b;
        int i = this.f29977d;
        return new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(str2).length()).append("Node{").append(str).append(", id=").append(str2).append(", hops=").append(i).append(", isNearby=").append(this.f29978e).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9493ae.m8013a(this, parcel, i);
    }
}
