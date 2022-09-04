package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class AppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppIdentifier> CREATOR = new C8762c();

    /* renamed from: a */
    private final int f28044a;

    /* renamed from: b */
    private final String f28045b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppIdentifier(int i, String str) {
        this.f28044a = i;
        this.f28045b = C4588d.m23624a(str, (Object) "Missing application identifier value");
    }

    public AppIdentifier(String str) {
        this(1, str);
    }

    /* renamed from: a */
    public int m10229a() {
        return this.f28044a;
    }

    /* renamed from: b */
    public String m10228b() {
        return this.f28045b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8762c.m10200a(this, parcel, i);
    }
}
