package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C4513x();

    /* renamed from: a */
    final int f16784a;

    /* renamed from: b */
    private final String f16785b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i, String str) {
        C4588d.m23624a(str, (Object) "scopeUri must not be null or empty");
        this.f16784a = i;
        this.f16785b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: a */
    public String m24024a() {
        return this.f16785b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f16785b.equals(((Scope) obj).f16785b);
        }
        return false;
    }

    public int hashCode() {
        return this.f16785b.hashCode();
    }

    public String toString() {
        return this.f16785b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4513x.m23924a(this, parcel, i);
    }
}
