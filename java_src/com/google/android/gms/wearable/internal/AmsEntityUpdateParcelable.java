package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.AbstractC9647u;
/* loaded from: classes2.dex */
public class AmsEntityUpdateParcelable extends AbstractSafeParcelable implements AbstractC9647u {
    public static final Parcelable.Creator<AmsEntityUpdateParcelable> CREATOR = new C9542ax();

    /* renamed from: a */
    final int f29864a;

    /* renamed from: b */
    private byte f29865b;

    /* renamed from: c */
    private final byte f29866c;

    /* renamed from: d */
    private final String f29867d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AmsEntityUpdateParcelable(int i, byte b, byte b2, String str) {
        this.f29865b = b;
        this.f29864a = i;
        this.f29866c = b2;
        this.f29867d = str;
    }

    /* renamed from: a */
    public byte m8092a() {
        return this.f29865b;
    }

    /* renamed from: b */
    public byte m8091b() {
        return this.f29866c;
    }

    /* renamed from: c */
    public String m8090c() {
        return this.f29867d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) obj;
        return this.f29865b == amsEntityUpdateParcelable.f29865b && this.f29864a == amsEntityUpdateParcelable.f29864a && this.f29866c == amsEntityUpdateParcelable.f29866c && this.f29867d.equals(amsEntityUpdateParcelable.f29867d);
    }

    public int hashCode() {
        return (((((this.f29864a * 31) + this.f29865b) * 31) + this.f29866c) * 31) + this.f29867d.hashCode();
    }

    public String toString() {
        int i = this.f29864a;
        byte b = this.f29865b;
        byte b2 = this.f29866c;
        String str = this.f29867d;
        return new StringBuilder(String.valueOf(str).length() + 97).append("AmsEntityUpdateParcelable{mVersionCode=").append(i).append(", mEntityId=").append((int) b).append(", mAttributeId=").append((int) b2).append(", mValue='").append(str).append("'").append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9542ax.m7908a(this, parcel, i);
    }
}
