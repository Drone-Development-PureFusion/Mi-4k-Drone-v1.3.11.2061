package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DiscoveryOptions> CREATOR = new C8768e();

    /* renamed from: a */
    final int f28067a;

    /* renamed from: b */
    private final Strategy f28068b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscoveryOptions(int i, Strategy strategy) {
        this.f28067a = i;
        this.f28068b = strategy;
    }

    /* renamed from: a */
    public Strategy m10190a() {
        return this.f28068b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryOptions)) {
            return false;
        }
        DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
        return this.f28067a == discoveryOptions.f28067a && C4585c.m23634a(this.f28068b, discoveryOptions.f28068b);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28067a), this.f28068b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8768e.m10172a(this, parcel, i);
    }
}
