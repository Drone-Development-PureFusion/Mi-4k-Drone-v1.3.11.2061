package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.C4678a;
import com.google.android.gms.nearby.messages.Message;
import java.util.Set;
/* loaded from: classes2.dex */
public class Update extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Update> CREATOR = new C8842b();

    /* renamed from: a */
    final int f28325a;

    /* renamed from: b */
    final int f28326b;

    /* renamed from: c */
    public final Message f28327c;
    @Nullable

    /* renamed from: d */
    public final DistanceImpl f28328d;
    @Nullable

    /* renamed from: e */
    public final BleSignalImpl f28329e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Update(int i, int i2, Message message, @Nullable DistanceImpl distanceImpl, @Nullable BleSignalImpl bleSignalImpl) {
        boolean z = true;
        this.f28325a = i;
        this.f28326b = i2;
        if (m9900a(1) && m9900a(2)) {
            z = false;
        }
        C4588d.m23622a(z, "Update cannot represent both FOUND and LOST.");
        this.f28327c = message;
        this.f28328d = distanceImpl;
        this.f28329e = bleSignalImpl;
    }

    /* renamed from: a */
    private Set<String> m9901a() {
        C4678a c4678a = new C4678a();
        if (m9900a(1)) {
            c4678a.add("FOUND");
        }
        if (m9900a(2)) {
            c4678a.add("LOST");
        }
        if (m9900a(4)) {
            c4678a.add("DISTANCE");
        }
        if (m9900a(8)) {
            c4678a.add("BLE_SIGNAL");
        }
        return c4678a;
    }

    /* renamed from: a */
    public boolean m9900a(int i) {
        return (this.f28326b & i) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        return this.f28326b == update.f28326b && C4585c.m23634a(this.f28327c, update.f28327c) && C4585c.m23634a(this.f28328d, update.f28328d) && C4585c.m23634a(this.f28329e, update.f28329e);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28326b), this.f28327c, this.f28328d, this.f28329e);
    }

    public String toString() {
        String valueOf = String.valueOf(m9901a());
        String valueOf2 = String.valueOf(this.f28327c);
        String valueOf3 = String.valueOf(this.f28328d);
        String valueOf4 = String.valueOf(this.f28329e);
        return new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length()).append("Update{types=").append(valueOf).append(", message=").append(valueOf2).append(", distance=").append(valueOf3).append(", bleSignal=").append(valueOf4).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8842b.m9891a(this, parcel, i);
    }
}
