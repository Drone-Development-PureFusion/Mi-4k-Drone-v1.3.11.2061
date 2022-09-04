package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class Strategy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Strategy> CREATOR = new C8770g();

    /* renamed from: a */
    public static final Strategy f28074a = new Strategy(3, 3);

    /* renamed from: b */
    public static final Strategy f28075b = new Strategy(1, 1);

    /* renamed from: c */
    final int f28076c;

    /* renamed from: d */
    private final int f28077d;

    /* renamed from: e */
    private final int f28078e;

    private Strategy(int i, int i2) {
        this(1, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Strategy(int i, int i2, int i3) {
        this.f28076c = i;
        this.f28077d = i2;
        this.f28078e = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m10185a() {
        return this.f28077d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m10184b() {
        return this.f28078e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return this.f28077d == strategy.f28077d && this.f28078e == strategy.f28078e;
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28077d), Integer.valueOf(this.f28078e));
    }

    public String toString() {
        int i = this.f28077d;
        return new StringBuilder(63).append("Strategy{discoveryMode=").append(i).append(", connectionType=").append(this.f28078e).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8770g.m10166a(this, parcel, i);
    }
}
