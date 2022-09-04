package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class ApplicationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApplicationStatus> CREATOR = new C4417a();

    /* renamed from: a */
    private final int f16595a;

    /* renamed from: b */
    private String f16596b;

    public ApplicationStatus() {
        this(1, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ApplicationStatus(int i, String str) {
        this.f16595a = i;
        this.f16596b = str;
    }

    /* renamed from: a */
    public int m24280a() {
        return this.f16595a;
    }

    /* renamed from: b */
    public String m24279b() {
        return this.f16596b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ApplicationStatus) {
            return C4430f.m24206a(this.f16596b, ((ApplicationStatus) obj).f16596b);
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f16596b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4417a.m24270a(this, parcel, i);
    }
}
