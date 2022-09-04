package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
@Deprecated
/* loaded from: classes.dex */
public class CountrySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new C9398h();

    /* renamed from: a */
    String f29430a;

    /* renamed from: b */
    private final int f29431b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CountrySpecification(int i, String str) {
        this.f29431b = i;
        this.f29430a = str;
    }

    public CountrySpecification(String str) {
        this.f29431b = 1;
        this.f29430a = str;
    }

    /* renamed from: a */
    public int m8594a() {
        return this.f29431b;
    }

    /* renamed from: b */
    public String m8593b() {
        return this.f29430a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C9398h.m8231a(this, parcel, i);
    }
}
