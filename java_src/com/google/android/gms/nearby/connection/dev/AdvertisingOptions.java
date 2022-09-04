package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdvertisingOptions> CREATOR = new C8764a();

    /* renamed from: a */
    final int f28060a;

    /* renamed from: b */
    private final Strategy f28061b;
    @Nullable

    /* renamed from: c */
    private final String f28062c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdvertisingOptions(int i, Strategy strategy, @Nullable String str) {
        this.f28060a = i;
        this.f28061b = strategy;
        this.f28062c = str;
    }

    /* renamed from: a */
    public Strategy m10196a() {
        return this.f28061b;
    }

    @Nullable
    /* renamed from: b */
    public String m10195b() {
        return this.f28062c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertisingOptions)) {
            return false;
        }
        AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
        return this.f28060a == advertisingOptions.f28060a && C4585c.m23634a(this.f28061b, advertisingOptions.f28061b) && C4585c.m23634a(this.f28062c, advertisingOptions.f28062c);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28060a), this.f28061b, this.f28062c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8764a.m10181a(this, parcel, i);
    }
}
