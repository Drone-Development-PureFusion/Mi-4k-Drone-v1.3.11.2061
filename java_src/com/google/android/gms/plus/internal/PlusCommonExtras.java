package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4631c;
@KeepName
/* loaded from: classes2.dex */
public class PlusCommonExtras extends AbstractSafeParcelable {
    public static final C8972f CREATOR = new C8972f();

    /* renamed from: a */
    private final int f28497a;

    /* renamed from: b */
    private String f28498b;

    /* renamed from: c */
    private String f28499c;

    public PlusCommonExtras() {
        this.f28497a = 1;
        this.f28498b = "";
        this.f28499c = "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PlusCommonExtras(int i, String str, String str2) {
        this.f28497a = i;
        this.f28498b = str;
        this.f28499c = str2;
    }

    /* renamed from: a */
    public int m9682a() {
        return this.f28497a;
    }

    /* renamed from: a */
    public void m9681a(Bundle bundle) {
        bundle.putByteArray("android.gms.plus.internal.PlusCommonExtras.extraPlusCommon", C4631c.m23444a(this));
    }

    /* renamed from: b */
    public String m9680b() {
        return this.f28498b;
    }

    /* renamed from: c */
    public String m9679c() {
        return this.f28499c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlusCommonExtras)) {
            return false;
        }
        PlusCommonExtras plusCommonExtras = (PlusCommonExtras) obj;
        return this.f28497a == plusCommonExtras.f28497a && C4585c.m23634a(this.f28498b, plusCommonExtras.f28498b) && C4585c.m23634a(this.f28499c, plusCommonExtras.f28499c);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f28497a), this.f28498b, this.f28499c);
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("versionCode", Integer.valueOf(this.f28497a)).m23632a("Gpsrc", this.f28498b).m23632a("ClientCallingPackage", this.f28499c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8972f.m9616a(this, parcel, i);
    }
}
