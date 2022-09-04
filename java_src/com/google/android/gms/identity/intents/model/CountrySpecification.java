package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class CountrySpecification extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CountrySpecification> CREATOR = new C6089a();

    /* renamed from: a */
    String f20583a;

    /* renamed from: b */
    private final int f20584b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CountrySpecification(int i, String str) {
        this.f20584b = i;
        this.f20583a = str;
    }

    public CountrySpecification(String str) {
        this.f20584b = 1;
        this.f20583a = str;
    }

    /* renamed from: a */
    public int m18797a() {
        return this.f20584b;
    }

    /* renamed from: b */
    public String m18796b() {
        return this.f20583a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6089a.m18776a(this, parcel, i);
    }
}
