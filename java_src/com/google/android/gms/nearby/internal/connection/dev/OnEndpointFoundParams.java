package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class OnEndpointFoundParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnEndpointFoundParams> CREATOR = new C8772aa();

    /* renamed from: a */
    final int f28099a;

    /* renamed from: b */
    private final String f28100b;

    /* renamed from: c */
    private final String f28101c;

    /* renamed from: d */
    private final String f28102d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OnEndpointFoundParams(int i, String str, String str2, String str3) {
        this.f28099a = i;
        this.f28100b = str;
        this.f28101c = str2;
        this.f28102d = str3;
    }

    /* renamed from: a */
    public String m10153a() {
        return this.f28100b;
    }

    /* renamed from: b */
    public String m10152b() {
        return this.f28101c;
    }

    /* renamed from: c */
    public String m10151c() {
        return this.f28102d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnEndpointFoundParams)) {
            return false;
        }
        OnEndpointFoundParams onEndpointFoundParams = (OnEndpointFoundParams) obj;
        return this.f28099a == onEndpointFoundParams.f28099a && C4585c.m23634a(this.f28100b, onEndpointFoundParams.f28100b) && C4585c.m23634a(this.f28101c, onEndpointFoundParams.f28101c) && C4585c.m23634a(this.f28102d, onEndpointFoundParams.f28102d);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28099a), this.f28100b, this.f28101c, this.f28102d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8772aa.m10109a(this, parcel, i);
    }
}
