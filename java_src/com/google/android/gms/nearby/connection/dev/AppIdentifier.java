package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@Deprecated
/* loaded from: classes.dex */
public final class AppIdentifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AppIdentifier> CREATOR = new C8765b();

    /* renamed from: a */
    private final int f28063a;

    /* renamed from: b */
    private final String f28064b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppIdentifier(int i, String str) {
        this.f28063a = i;
        this.f28064b = C4588d.m23624a(str, (Object) "Missing application identifier value");
    }

    /* renamed from: a */
    public int m10194a() {
        return this.f28063a;
    }

    /* renamed from: b */
    public String m10193b() {
        return this.f28064b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8765b.m10178a(this, parcel, i);
    }
}
